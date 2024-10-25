import java.util.Scanner;
public class Ej7 {
        public static void main(String[] args) {
            Scanner A = new Scanner(System.in);
            double indicedefelicidad;
            System.out.println("Vamos a calcular tu indice de felicidad |Solo ingrese numeros entre 1 y 10|");

            System.out.print("Nivel de satisfacción con la vida: ");
            int satisfaccionVida = A.nextInt();
            while (satisfaccionVida > 10 || satisfaccionVida<0){
                System.out.println("ingrese un numero entre 1 y 10");
                satisfaccionVida = A.nextInt();
            }

            System.out.print("Nivel de estrés: ");
            int estres = A.nextInt();
            while (estres > 10 || estres<0){
                System.out.println("ingrese un numero entre 1 y 10");
                estres = A.nextInt();
            }

            System.out.print("Nivel de salud: ");
            int salud = A.nextInt();
            while (salud > 10 || salud<0){
               System.out.println("ingrese un numero entre 1 y 10");
                salud = A.nextInt();
            }

            System.out.print("Relaciones personales: ");
            int relaciones = A.nextInt();
            while (relaciones > 10 || relaciones<0){
                System.out.println("ingrese un numero entre 1 y 10");
                relaciones = A.nextInt();
            }

            System.out.print("Trabajo/Estudio: ");
            int trabajo = A.nextInt();
            while (trabajo > 10 || trabajo<0){
                System.out.println("ingrese un numero entre 1 y 10");
                trabajo = A.nextInt();
            }

            System.out.print("Ocio y tiempo libre: ");
            int tiempolibre = A.nextInt();
            while (tiempolibre > 10 || tiempolibre<0){
                System.out.println("ingrese un numero entre 1 y 10");
                tiempolibre = A.nextInt();
            }
            indicedefelicidad = (satisfaccionVida + (10-estres) + salud + relaciones + trabajo + tiempolibre) / 6.0;
            System.out.printf("Tu inidice de Felicidad es: %.2f\n ", indicedefelicidad);
        }
    }


