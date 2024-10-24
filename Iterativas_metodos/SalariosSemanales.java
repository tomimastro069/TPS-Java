import java.util.Scanner;

public class SalariosSemanales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de empleados: ");
        int numEmpleados = sc.nextInt();
        int tarifaPorHora = 15; // Tarifa fija por hora
        int i = 1;

        while (i <= numEmpleados) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = sc.nextInt();
            double salario = horasTrabajadas * tarifaPorHora;
            System.out.println("El salario semanal del empleado " + i + " es: $" + salario);
            i++;
        }
    }
}

