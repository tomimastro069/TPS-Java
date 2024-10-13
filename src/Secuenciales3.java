import java.util.Scanner;

public class Secuenciales3 {

    public static void principiante() {
        System.out.println("Martes y Jueves: Entrenamiento Full Body (series x repeticiones)\n" +
                "Press plano: 3 x 12-15\nPrensa 45°: 3 x 15\nVuelos laterales: 3 x 12 c/lado\nJalón al pecho prono: 3 x 12-15");
    }
    public static void intermedio() {
        System.out.println("Lunes y Miércoles: Tren Superior (series x repeticiones)\n" +
                "Press plano: 4 x 10-15\nPress Inclinado: 4 x 10-12\nJalón al pecho prono: 4 x 10-15\nRemo: 4 x 10-12\nVuelo lateral: 4 x 8-10");
        System.out.println("Martes y Jueves: Tren Inferior\n" +
                "Extensión cuádriceps: 4 x 10-15\nSentadillas: 4 x 8-12\nFemorales camilla: 4 x 12\nGemelos: 4 x 10-15");
        System.out.println("Incluye una sesión de cardio de 30min. 2 veces a la semana.");
    }
    public static void avanzado() {
        System.out.println("Lunes/Miércoles/Viernes: Tren Superior (series x repeticiones)\n" +
                "Press plano: 5 x 10-15\nPress Inclinado: 5 x 10-12\nJalón al pecho prono: 5 x 10-15\nRemo: 5 x 10-12\nVuelo lateral: 5 x 8-10");
        System.out.println("Martes/Jueves/Sábado: Tren Inferior\n" +
                "Extensión cuádriceps: 5 x 10-15\nSentadillas: 5 x 8-12\nFemorales camilla: 5 x 12\nGemelos: 5 x 10-15");
        System.out.println("Incluye una sesión de cardio de 30min. al final de cada entrenamiento.");
    }

    public static void main(String[] args) {

        int nivel,duracion;
        String ejercicio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nivel de condición física:\n1-Principiante\n2-Intermedio\n3-Avanzado");
        nivel = sc.nextInt();

        switch (nivel) {
            case 1:
                principiante();
                break;
            case 2:
                intermedio();
                break;
            case 3:
                avanzado();
                break;
        }

    }
}