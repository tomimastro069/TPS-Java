import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        int categoria;

        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        do {
            System.out.println("Selecciones una de las siguientes categorías:\n" +
                    "1 - ESTUDIANTE\n2 - ADULTO\n3 - JUBILADO");
            categoria = sc.nextInt();
            if (categoria < 1 || categoria > 3) {
                System.out.println("Opción no válida, intente nuevamente.");
            }
        }while (categoria<1 || categoria>3);


        switch (categoria){
            case 1:
                precio = precio - (precio * 0.10);
                System.out.println("Descuento del 10% aplicado.\nMonto final: $"+ precio);
                break;
            case 2:
                precio = precio - (precio * 0.05);
                System.out.println("Descuento del 5% aplicado.\nMonto final: $"+ precio);
                break;
            case 3:
                precio = precio - (precio * 0.15);
                System.out.println("Descuento del 15% aplicado.\nMonto final: $"+ precio);
                break;
        }
    }
}
