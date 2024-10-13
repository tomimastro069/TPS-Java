import java.util.Scanner;

public class Secuenciales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km;
        double consumo,cantidad_combustible,costo_por_litro,precio_final;

        System.out.println("Ingrese la distancia del viaje en Kilómetros: ");
        km = sc.nextInt();
        System.out.println("Ingrese el consumo de combustible por Km recorrido: ");
        consumo = sc.nextDouble();
        System.out.println("Ingrese el costo del combustible por litro: ");
        costo_por_litro = sc.nextDouble();

        //-----Costo del viaje (CALCULO-----
        cantidad_combustible = consumo * km;
        precio_final = cantidad_combustible * costo_por_litro;
        System.out.println("El costo total del viaje es de: $"+precio_final);

    }
}
