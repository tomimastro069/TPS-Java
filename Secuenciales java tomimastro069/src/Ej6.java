import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        float horas;
        System.out.println("Cuantas horas diarias puede estudiar?");
        horas = A.nextFloat();
        System.out.println("Distrubuyendo horarios en materias(Matematica/Fisica/Programacion/Literatura/Quimica");

        System.out.printf("Lunes: Matematica %.1fhs y Programacion %.1fhs\n", horas*0.30,horas*0.70);

        System.out.printf("Martes: Matematica %.1hs y Fisica %.1fhs\n",horas*0.7,horas*0.30);

        System.out.printf("Miercoles: Fisica %.1fhs y Literatura %.1fhs\n",horas*0.7,horas*0.30);

        System.out.printf("Jueves: Literatura %.1fhs y Quimica %.1fhs\n",horas*0.7,horas*0.30);

        System.out.printf("Viernes: Matematica %.1fhs y Programacion %.1fhs\n",horas*0.50,horas*0.5);

        System.out.print("Sabado: Descanso\n");

        System.out.print("Domingo: Descanso");

    }
}
