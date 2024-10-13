import java.util.Scanner;

public class Secuenciales4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int animo;

        System.out.println("Cuál de las siguientes describe mejor tu estado de ánimo:\n1-Feliz\n2-Triste\n3-Enérgico\n4-Relajado");
        animo = sc.nextInt();

        switch (animo) {
            case 1:
                System.out.println("Playlist 1");
                for (int i=1;i<11;i++){
                    System.out.println("Cancion "+i);}  //"Cancion" se muestra a modo de ejemplo.
                break;
            case 2:
                System.out.println("Playlist 2");
                for (int i=1;i<11;i++){
                    System.out.println("Cancion "+i);}
                break;
            case 3:
                System.out.println("Playlist 3");
                for (int i=1;i<11;i++){
                    System.out.println("Cancion "+i);}
                break;
        }
    }
}
