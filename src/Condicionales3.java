import java.util.Scanner;

public class Condicionales3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion;

        System.out.println("Seleccione su temática favorita para un libro:\n1-Fantasía\n2-Misterio\n3-Romance\n4-Ciencia Ficción ");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Libro recomendado: Harry Potter");
                break;
            case 2:
                System.out.println("Libro recomendado: Sherlock Holmes");
                break;
            case 3:
                System.out.println("Libro recomendado: 500 dias con ella");
                break;
            case 4:
                System.out.println("Libro recomendado: Animales Fantásticos");
                break;
        }


    }
}
