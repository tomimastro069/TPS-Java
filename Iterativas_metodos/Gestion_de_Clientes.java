public class Gestion_de_Clientes {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Luis"};
        double[] facturasPendientes = {600.50, 450.75, 800.00, 320.00, 750.20};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura pendiente: $" + facturasPendientes[i]);
            }
        }
    }
}

