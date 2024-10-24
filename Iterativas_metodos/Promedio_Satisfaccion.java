public class Promedio_Satisfaccion {
    public static void main(String[] args) {
        double[] calificaciones = {4.5, 3.8, 4.9, 5.0, 3.6};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción del cliente es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(double[] calificaciones) {
        double total = 0;
        for (double calificacion : calificaciones) {
            total += calificacion;
        }
        return total / calificaciones.length;
    }
}

