import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int genero;
        System.out.println("Seleccione uno de los siguientes géneros de películas:\n1-Accion\n2-Comedia\n3-Drama\n4-Ciencia Ficción");
        genero = sc.nextInt();

        switch (genero){
            case 1:
                System.out.println("Título recomendado: John Wick");
                break;
            case 2 :
                System.out.println("Título recomendado: Son Como Niños");
                break;
            case 3:
                System.out.println("Título recomendado: El pianista");
                break;
            case 4:
                System.out.println("Título recomendado: El señor de los anillos");
                break;
        }

    }
}
