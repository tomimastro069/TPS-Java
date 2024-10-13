import java.util.Scanner;

public class Condicionales4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg;
        double altura,imc;

        System.out.println("Ingrese su peso en Kg: ");
        kg = sc.nextInt();
        System.out.println("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        imc = kg / (altura*altura);
        System.out.println("IMC: "+ imc);
        if (imc<18.5) {
            System.out.println("Bajo peso");
        } else if (imc>18.5 && imc<=24.9) {
            System.out.println("Peso Normal");
        } else if (imc>24.9 && imc<=29.9) {
            System.out.println("Sobrepeso");
        } else if (imc>=30) {
            System.out.println("Obesidad");

        }
    }
}
