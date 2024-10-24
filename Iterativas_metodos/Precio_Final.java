public class Precio_Final {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.00, 250.00, 300.00, 450.00, 150.00};

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10;
        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioConDescuento = preciosOriginales[i] * (1 - descuento);
            System.out.println("Producto " + (i + 1) + " - Precio original: $" + preciosOriginales[i] + " - Precio con descuento: $" + precioConDescuento);
        }
    }
}

