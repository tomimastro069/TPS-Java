import java.util.Scanner;

public class TiempoActividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        double totalHoras = 0;
        int i = 0;

        while (i < actividades.length) {
            System.out.print("Ingresa las horas dedicadas a " + actividades[i] + ": ");
            double horas = sc.nextDouble();
            totalHoras += horas;
            i++;
        }

        System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");
    }
}
