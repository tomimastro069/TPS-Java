import java.util.Scanner;

public class Condicionales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estado;
        System.out.println("¿Cual de las siguientes opciones describe mejor su estado de ánimo?\n" +
                "1-Feliz\n2-Triste\n3-Enérgico\n4-Relajado");
        estado = sc.nextInt();
        switch (estado){
            case 1:
                System.out.println("Enhorabuena! Es un buen momento para compartir con seres queridos");
            case 2:
                System.out.println("Es una lástima, recomendaría realizar alguna actividad que disfrute");
            case 3:
                System.out.println("Hay que aprovechar el momentum! Recomendaría hacer algo de ejercicio.");
            case 4:
                System.out.println("Nunca viene mal una pausa, que tal leer un libro o tomar una siesta");
        }
    }
}
