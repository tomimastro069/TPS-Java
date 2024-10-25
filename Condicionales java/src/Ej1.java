import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int Tipodepelicula;
        Scanner A = new Scanner(System.in);
        System.out.println("Q tipo de pelicula te gusta? \n 1 | acción \n 2 | comedia \n 3 | drama\n 4 | ciencia ficción");
        Tipodepelicula = A.nextInt();
        switch (Tipodepelicula){
            case 1:
                System.out.println("te recomiendo: \n indiana Jones y la última cruzada \n Terminator 2");
                break;
            case 2:
                System.out.println("te recomiendo: \n Que paso ayer?  \n Zoolander ");
                break;
            case 3:
                System.out.println("te recomiendo: \n La lista de Schindler \n Taxi Driver ");
                break;
            case 4:
                System.out.println("te recomiendo:\n Volver al futuro \n Matrix ");
                break;
            default:
                System.out.println("Valor no valido");
                break;
        }


    }
}
