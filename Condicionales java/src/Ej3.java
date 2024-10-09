import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int genero;
        String libroRecomendado;
        Scanner A = new Scanner(System.in);
        System.out.println("Q tipo de libro te gusta? \n 1 | Fantasia \n 2 | Misterio \n 3 | Romance \n 4 | ciencia ficción");
        genero = A.nextInt();
        switch (genero) {
            case 1:
                libroRecomendado = "Te recomendamos 'El Señor de los Anillos' de J.R.R. Tolkien";
                break;
            case 2:
                libroRecomendado = "Te recomendamos 'El Código Da Vinci' de Dan Brown";
                break;
            case 3:
                libroRecomendado = "Te recomendamos 'Orgullo y Prejuicio' de Jane Austen";
                break;
            case 4:
                libroRecomendado = "Te recomendamos 'Dune' de Frank Herbert";
                break;
            default:
                libroRecomendado = "Genero invalido";
                break;
        }

        System.out.println(libroRecomendado);


    }
}
