public class Calculo_Impuestos {
    public static void main(String[] args) {
        double[] facturas = {200.00, 450.75, 300.00, 520.30, 150.60};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        double tasaImpuesto = 0.21;
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * tasaImpuesto;
            System.out.println("Factura " + (i + 1) + " - Monto: $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }
}

