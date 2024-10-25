import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        int Tipodeanimo;
        Scanner A = new Scanner(System.in);
        System.out.println("Q estado de animo se acuerda mas a su condiciom? \n 1 | Feliz \n 2 | Triste \n 3 | Energico \n 4 | Relajado");
        Tipodeanimo = A.nextInt();
        switch (Tipodeanimo){
            case 1:
                System.out.println("te recomiendo: \n Escuchar tu cancion favorita");
                break;
            case 2:
                System.out.println("te recomiendo: \n Juntarte con gente amada ");
                break;
            case 3:
                System.out.println("te recomiendo: \n Salir a correr ");
                break;
            case 4:
                System.out.println("te recomiendo:\n Salir a tomar mates al parque.");
                break;
            default:
                System.out.println("Valor no valido");
                break;
        }


    }
}
