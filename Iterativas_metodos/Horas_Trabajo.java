public class Horas_Trabajo {
    public static void main(String[] args) {
        String[] empleados = {"Juan", "María", "Carlos", "Ana", "Luis"};
        int[] horasTrabajadas = {40, 35, 42, 38, 45};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        int tarifaPorHora = 15;
        for (int i = 0; i < empleados.length; i++) {
            int pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " - Pago semanal: $" + pago);
        }
    }
}
