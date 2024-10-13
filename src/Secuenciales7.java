import java.util.Scanner;

public class Secuenciales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1,i2,i3,i4,i5; //Factores para el índice de felicidad
        double resultado;
        System.out.println("En escala del 1 al 10, ¿Cómo calificaría las siguientes cosas?\n-Satisfacción con su vida: ");
        i1 = sc.nextInt();
        System.out.println("-Motivación");
        i2 = sc.nextInt();
        System.out.println("-Salud Física: ");
        i3 = sc.nextInt();
        System.out.println("-Salud Psicológica: ");
        i4 = sc.nextInt();
        System.out.println("-Nivel de estres (siendo 1 muy estresado y 10 para nada estresado: )");;
        i5 = sc.nextInt();

        resultado = (double) (i1 + i2 + i3 + i4 + i5) / 5;
        System.out.println("Su índice de felicidad es de: "+resultado+" sobre 10");

    }
}
