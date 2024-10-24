import java.util.Scanner;

public class Ingresos_Mensuales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[30]; // Arreglo para almacenar ventas diarias

        // Registrar ventas diarias
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingresa las ventas del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        // Calcular ingresos mensuales
        double totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}

