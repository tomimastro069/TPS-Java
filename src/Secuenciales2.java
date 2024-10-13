import java.util.Scanner;

public class Secuenciales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos,calorias,ejercicio;
        double kg;
        calorias = 0;

        System.out.println("Ingrese su peso en Kilogramos: ");
        kg = sc.nextDouble();

        System.out.println("Ingrese el ejercicio deseado: \n1-Correr\n2-Nadar\n3-Bicicleta");
        ejercicio = sc.nextInt();

        System.out.println("Ingrese el tiempo deseado en minutos: ");
        minutos = sc.nextInt();

        switch (ejercicio) {
            case 1:
                for (int i = 0; i<minutos; i++) {
                    calorias = calorias+12;
                }
                calorias = (int) (calorias + (kg / minutos));
                System.out.println("Calorias quemadas: "+ calorias);
                break;
            case 2:
                for (int i = 0; i<minutos; i++) {
                    calorias = calorias+8;
                }
                calorias = (int) (calorias + (kg / minutos));
                System.out.println("Calorias quemadas: "+ calorias);
                break;
            case 3:
                for (int i = 0; i<minutos; i++) {
                    calorias = calorias+10;
                }
                calorias = (int) (calorias + (kg / minutos));
                System.out.println("Calorias quemadas: "+ calorias);
                break;
            default:
                System.out.println("Ejercicio no válido.");
                break;
        }
    }
}
