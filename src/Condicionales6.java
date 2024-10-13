import java.util.Scanner;

public class Condicionales6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comida,dormir,ejercicio,puntos;
        System.out.println("Ingrese la cantidad de horas que duerme: ");
        dormir = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas de ejercicio diario: ");
        ejercicio = sc.nextInt();
        System.out.println("Ingrese cuantas comidas saludables realiza en el día: ");
        comida = sc.nextInt();
        puntos = 0;

        if (dormir==8 || dormir==9){
            System.out.println("Usted duerme adecuadamente.");
            puntos=puntos+1;
        }else {
            System.out.println("Usted debe ajustar el tiempo de sueño a 8hs");
        }
        if (ejercicio >= 2){
            System.out.println("Usted parece ser una persona activa físicamente, continue así");
            puntos=puntos+1;
        }else {
            System.out.println("Intente llegar a unas 2hs diarias de ejercicio");
        }
        if (comida>=3){
            System.out.println("Usted parece llevar una buena alimentación");
            puntos=puntos+1;
        }else {
            System.out.println("Intente consumir al menos 3 comidas saludables al día");
        }

        System.out.println("Puntos: "+puntos);
        System.out.println("Si consiguió 3 puntos, ¡Felicitaciones! Es una persona de hábitos saludables.\nSi consiguió menos puntaje, se recomienda hacer ligeros cambios en sus hábitos.");
    }

}
