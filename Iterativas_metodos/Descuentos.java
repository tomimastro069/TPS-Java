public class Descuentos {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Luis"};
        int[] compras = {12, 5, 18, 9, 11};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes con descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Compras: " + compras[i] + " - Descuento aplicado: 10%");
            }
        }
    }
}
