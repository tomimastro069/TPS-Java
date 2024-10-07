import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int tiempo, tipodeejercicio;
        float peso, caloriasquemadas;
        System.out.println("ingresa tu peso: ");
        peso = A.nextFloat();
        System.out.println("cuanto tiempo estuviste haciendo ejercicio? // en minutos");
        tiempo = A.nextInt();
        System.out.println("Que tipo de ejercicio hizo?\n 1| Correr\n 2| Nadar\n 3| Andar en bicicleta");
        tipodeejercicio = A.nextInt();
        switch (tipodeejercicio){
            case 1:
                System.out.println("Calorias quemadas: "+ (tiempo * 11.7));
                break;
            case 2:
                System.out.println("Calorias quemadas: "+ (tiempo * 12.5));
                break;
            case 3 :
                System.out.println("Calorias quemadas: "+ (tiempo * 9.8));
            default:
                System.out.println("valor incorrecto");
        }

    }
}
