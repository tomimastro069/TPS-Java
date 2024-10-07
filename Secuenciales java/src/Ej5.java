import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);
        float distancia, consumo , preciodenafta,gastoFinal;
        System.out.println("Ingrese la distancia del viaje en KM");

        distancia = A.nextFloat();

        System.out.println("ingrese el consumo de combustible Litros X KM");

        consumo = A.nextFloat();

        System.out.println("ingrese  el precio de combustible por litro ");

        preciodenafta = A.nextFloat();

        gastoFinal = ((consumo * distancia)* preciodenafta);

        System.out.println("El gasto del viaje va a ser de >"+ gastoFinal+ "< Pesos");
    }
}
