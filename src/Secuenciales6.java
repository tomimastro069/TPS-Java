import java.util.Scanner;

public class Secuenciales6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad_horas;
        int resultado;

        System.out.println("Materias:\n-Matemática\n-Historia\n-Inglés\n-Lógica");
        System.out.println("Ingrese la cantidad de horas disponibles para estudiar en la semana:");
        cantidad_horas = sc.nextInt();

        resultado = (cantidad_horas) / 5;
        System.out.println("Lunes: Matemática\n"+resultado+"hs");
        System.out.println("Martes: Inglés\n"+resultado+"hs");
        System.out.println("Miercoles: Historia\n"+resultado+"hs");
        System.out.println("Jueves: Lógica\n"+resultado+"hs");
        System.out.println("Viernes: Repaso General\n"+resultado+"hs");
        int resto;
        if (cantidad_horas % 5 != 0) {
            resto = cantidad_horas % 5;
            System.out.println("Te quedan aproximadamente: "+resto+"hs para invertirlas como creas conveniente.");
        }
    }
}
