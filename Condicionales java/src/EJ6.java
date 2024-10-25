import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.println("Cuantas horas al dia duerme? ");
        int HorasDesuenoaldia = A.nextInt();
        while (HorasDesuenoaldia < 0 ){
            System.out.println("ingrese un valor valido");
            HorasDesuenoaldia = A.nextInt();
        }
        System.out.println("Cuantas horas de ejercicio hace al dia? ");
        int Horasdeejercicio = A.nextInt();
        while (Horasdeejercicio < 0 ){
            System.out.println("ingrese un valor valido");
            Horasdeejercicio = A.nextInt();
        }
        System.out.println("Cuantas comidas saludables consume al dia? ");
        int ComidasSaludables = A.nextInt();
        while (ComidasSaludables < 0 ){
            System.out.println("ingrese un valor valido");
            ComidasSaludables = A.nextInt();
        }
        int indicedesalud;
        indicedesalud = ((HorasDesuenoaldia + Horasdeejercicio + ComidasSaludables)/3);
        System.out.println("tu indice de salud es: "+ indicedesalud);


    }
}
