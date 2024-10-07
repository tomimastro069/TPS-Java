import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.println("Que tipo de condicion fisica posee?\n 1| Principiante \n 2| Intermedio\n 3| Avanzado\n");
        int condicion;

        condicion = A.nextInt();

        switch (condicion){
            case 1:
                System.out.println("Su rutina de nivel principiante es:\n | Calentamiento (5-10 minutos)\n" +
                        "Caminata rápida en el lugar o marchar con elevación de rodillas.\n" +
                        "Rotaciones de brazos (20 segundos hacia adelante, 20 segundos hacia atrás).\n" +
                        "Giros de cintura (20 segundos).\n" +
                        "Saltos de tijera (si puedes).\n" +
                        "2. Entrenamiento de fuerza y cardio (30 minutos)\n" +
                        "Sentadillas: 3 series de 12 repeticiones.\n" +
                        "(Puedes usar una silla para apoyarte si es necesario).\n" +
                        "Flexiones de rodillas: 3 series de 8-10 repeticiones.\n" +
                        "(Si no puedes hacer flexiones completas, puedes hacerlas apoyando las rodillas en el suelo).\n" +
                        "Planchas: Mantén la posición durante 20-30 segundos, 3 veces.\n" +
                        "(Apoya las rodillas si es necesario).\n" +
                        "Puentes de glúteos: 3 series de 15 repeticiones.\n" +
                        "(Acuéstate boca arriba, con las rodillas flexionadas y los pies apoyados en el suelo. Eleva las caderas).\n" +
                        "Mountain climbers (escaladores): 3 series de 20 repeticiones (10 por pierna).\n" +
                        "(Puedes hacerlos más despacio si lo necesitas).\n" +
                        "Estocadas: 3 series de 10 repeticiones por pierna.\n" +
                        "(Da un paso hacia adelante y baja las caderas hasta que ambas rodillas formen un ángulo de 90 grados).\n" +
                        "3. Enfriamiento (5 minutos)\n" +
                        "Estiramiento de piernas, brazos y espalda.\n" +
                        "Respiración profunda.\n");
                break;
            case 2:
                System.out.println("Su rutina de nivel Intermedio es:\n | Día 1: Fuerza - Tren Superior\n" +
                        "Flexiones de pecho: 4x12-15.\n" +
                        "Remo con mancuernas: 4x10-12.\n" +
                        "Press de hombros: 3x10-12.\n" +
                        "Fondos de tríceps: 3x10-12.\n" +
                        "Curl de bíceps: 3x12-15.\n" +
                        "Planchas laterales: 3x30 seg.\n" +
                        "Día 2: Fuerza - Tren Inferior\n" +
                        "Sentadillas: 4x12-15.\n" +
                        "Peso muerto: 4x10-12.\n" +
                        "Zancadas: 3x12 por pierna.\n" +
                        "Elevaciones de talones: 4x15-20.\n" +
                        "Puentes de glúteos: 3x15.\n" +
                        "Día 3: Cardio y Core\n" +
                        "HIIT (intervalos de sprint y trote): 30 min.\n" +
                        "Plancha frontal: 4x45 seg.\n" +
                        "Crunches bicicleta: 3x20.\n" +
                        "Elevación de piernas: 3x15.");
            case 3:
                System.out.println("Su rutina de nivel Avanzado es: \n  | Día 1: Fuerza - Tren Superior\n" +
                        "Press de banca: 4x6-8.\n" +
                        "Dominadas: 4x8-10.\n" +
                        "Press militar: 4x6-8.\n" +
                        "Remo con barra: 4x6-8.\n" +
                        "Fondos en paralelas: 4x8-10.\n" +
                        "Planchas con elevación de brazo: 3x30 seg.\n" +
                        "Día 2: Fuerza - Tren Inferior\n" +
                        "Sentadillas con barra: 4x6-8.\n" +
                        "Peso muerto convencional: 4x6-8.\n" +
                        "Prensa de piernas: 4x8-10.\n" +
                        "Zancadas con barra: 3x8 por pierna.\n" +
                        "Elevaciones de talones (gemelos): 4x12-15.\n" +
                        "Plancha lateral con peso: 3x30 seg.\n" +
                        "Día 3: Cardio y Core\n" +
                        "HIIT (circuito de sprints): 30 min.\n" +
                        "Plancha con desplazamiento: 3x30 seg.\n" +
                        "Elevaciones de piernas en barra: 3x15.\n" +
                        "Russian twists: 3x20.\n" +
                        "Día 4: Circuito Full Body\n" +
                        "Realizar 4 rondas de:\n" +
                        "\n" +
                        "Burpees: 15.\n" +
                        "Thrusters con barra: 12.\n" +
                        "Kettlebell swings: 15.\n" +
                        "Box jumps: 10.\n" +
                        "Mountain climbers: 30 seg.");

        }
    }
}