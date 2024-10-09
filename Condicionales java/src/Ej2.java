import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        double precio;
        String categoria;
        System.out.println("Ingrese el precio del producto");
        precio = A.nextDouble();
        System.out.println("Ingrese su categoria\n Estudiante \n Adulto \n Jubilado");
        categoria = A.next();
        categoria = categoria.toUpperCase();
        switch(categoria){
            case "ESTUDIANTE":
                precio = precio - (precio * 0.10); break;
            case "ADULTO":
                precio = precio - (precio * 0.05); break;
            case "JUBILADO":
                precio = precio - (precio * 0.15); break;
            default:
                System.out.println("Categoria inexistente"); break;
        }
        System.out.println("el precio con tu descuento correspondiente es: \n $" + precio);


    }
}
