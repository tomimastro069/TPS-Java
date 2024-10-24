public class Descuento_Compras {
    public static void main(String[] args) {
        double[] compras = {300.00, 550.00, 700.00, 150.00, 500.00};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        double descuento = 0.15;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double descuentoAplicado = compras[i] * descuento;
                System.out.println("Compra " + (i + 1) + " - Monto: $" + compras[i] + " - Descuento aplicado: $" + descuentoAplicado);
            }
        }
    }
}
