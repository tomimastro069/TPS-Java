import java.util.Scanner;

public class Horas_Extras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de empleados: ");
        int numEmpleados = sc.nextInt();
        int i = 1;

        do {
            System.out.print("Ingresa las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = sc.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no tiene horas extras.");
            }

            i++;
        } while (i <= numEmpleados);
    }
}

