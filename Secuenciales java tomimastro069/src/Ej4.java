import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        int tipo;

        System.out.println("Con q estado de animo se identifica mas?\n 1|feliz\n 2|triste\n 3|enérgico\n 4|relajado\n");

        tipo = A.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Puedes escuchar: \n Vivo (Gustavo cerati) \n Hacerse Cargo (CARAJO) \n Promesas (CARAJO)");
                break;
            case 2:
                System.out.println("Puedes escuchar: \n Triste(CARAJO)\n Adios(Gustavo Cerati) \n Fantasma(Gustavo cerati)\n Chamber of reflection (Mac de marco) \n La sed Verdadera\n");
                break;
            case 3:
                System.out.println("Puedes escuchar: \n Drama (CARAJO), Fuego del cielo (Arde la sangre)");
                break;
            case 4:
                System.out.println("Puedes escuchar: \n De frente al mar (CARAJO) \n El mar de las almas (CARAJO) \n Perdonar es divino (Gustavo Cerati)\n Bocanada (Gustavo Cerati)");
                break;
            default:
                System.out.println("valor incorrecto");
                break;

        }
    }
}