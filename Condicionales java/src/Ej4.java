import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("ingrese su peso en kilogramos");
        double peso = A.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = A.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Bajo peso. Se recomienda consultar a un nutricionista.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal. ¡Mantén un estilo de vida saludable!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso. Se recomienda realizar ejercicio y consultar a un nutricionista.");
        } else {
            System.out.println("Obesidad. Se recomienda consultar a un médico o nutricionista para un plan adecuado.");
        }
    }
}
