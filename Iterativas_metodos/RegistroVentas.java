import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingresa las ventas del día " + dia + ": ");
            double ventasDia = sc.nextDouble();
            totalVentas += ventasDia;
        }

        System.out.println("El total de ventas al final de la semana es: $" + totalVentas);
    }
}
