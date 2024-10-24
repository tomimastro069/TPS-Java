import java.util.Scanner;

public class Control_Inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de productos: ");
        int numProductos = sc.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            System.out.print("Ingresa la cantidad disponible del producto " + i + ": ");
            int cantidadDisponible = sc.nextInt();
            if (cantidadDisponible < 5) {
                System.out.println("Es necesario realizar un pedido del producto " + i + " (menos de 5 unidades disponibles).");
            }
        }
    }
}

