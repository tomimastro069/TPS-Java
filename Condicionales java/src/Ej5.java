import java.util.Scanner;
import java.util.Random;
public class Ej5 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        Random B = new Random();
        String maquinaeleccion;
        maquinaeleccion = "";
        System.out.println("Elige entre \n 1 | piedra\n 2 | papel\n 3 | tijera");
        int ValorUsuario = A.nextInt();
        int ValorAleatorio = B.nextInt(3);
        switch (ValorAleatorio){
            case 0: maquinaeleccion = "Piedra"; break;
            case 1: maquinaeleccion = "Papel"; break;
            case 2: maquinaeleccion = "Tijera"; break;
        }
        System.out.println("La eleccion de la computadora fue: "+ maquinaeleccion);

        if (ValorUsuario == 1){
            if (ValorAleatorio == 0) {
                    System.out.println("EMPATE");
            }   else if (ValorAleatorio == 1) {
                System.out.println("PERDISTE");
            }   else {
                    System.out.println("GANASTE");
                }
            }
        else if (ValorUsuario == 2) {
            if (ValorAleatorio == 0) {
                System.out.println( "GANASTE");
            } else if (ValorAleatorio == 1) {
                System.out.println( "EMPATE");
            } else {
                System.out.println( "PERDISTE");
            }
        } else if (ValorUsuario == 3) {
            if (ValorAleatorio == 0) {
                System.out.println("PERDISTE");
            } else if (ValorAleatorio == 1) {
                System.out.println("GANASTE");
            } else {
                System.out.println("EMPATE");
            }
        } else {
            System.out.println( "Opción no válida  elige 1, 2 o 3.");
        }
    }

}
