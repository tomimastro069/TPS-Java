import java.util.Scanner;
import java.util.Random;
public class Condicionales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuario;
        System.out.println("Elija una de las siguientes opciones:\n1-Piedra\n2-Papel\n3-Tijeras");
        usuario = sc.nextInt();

        Random rnd = new Random();
        int min = 1; // límite inferior
        int max = 3; // límite superior
        int numeroAleatorio = rnd.nextInt(max - min + 1) + min;

        switch (usuario){
            case 1:
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("EMPATE (Piedra vs Piedra)");
                        break;
                    case 2:
                        System.out.println("DERROTA (Piedra vs Papel)");
                        break;
                    case 3:
                        System.out.println("VICTORIA (Piedra vs Tijera)");
                        break;
                }
                break;
            case 2:
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("VICTORIA (Papel vs Piedra)");
                        break;
                    case 2:
                        System.out.println("EMPATE (Papel vs Papel)");
                        break;
                    case 3:
                        System.out.println("DERROTA (Papel vs Tijera)");
                        break;
                }
                break;
            case 3:
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("DERROTA (Tijera vs Piedra)");
                        break;
                    case 2:
                        System.out.println("VICTORIA (Tijera vs Papel)");
                        break;
                    case 3:
                        System.out.println("EMPATE (Tijera vs Tijera)");
                        break;
                }
                break;
        }
    }
}
