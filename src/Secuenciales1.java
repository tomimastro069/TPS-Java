import java.util.Scanner;

public class Secuenciales1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fecha;

        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA: ");
        fecha = sc.nextLine();

        String[] subcadenas = fecha.split("/");

        int dia = Integer.parseInt(subcadenas[0]);
        int mes = Integer.parseInt(subcadenas[1]);
        int anio = Integer.parseInt(subcadenas[2]);

        switch (mes) {
            case 1: //ENERO
                 if (dia>=1 & dia<=19) {
                     System.out.println("CAPRICORNIO");
                     System.out.println("(Mensaje Horóscopo)");
                 } else if (dia > 19 & dia<=31) {
                     System.out.println("ACUARIO");
                     System.out.println("(Mensaje Horóscopo)");
                 }
                 break;
            case 2: //FEBRERO
                if (dia>=1 & dia<=18) {
                    System.out.println("ACUARIO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>18 & dia<=28) {
                    System.out.println("PISCIS");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 3: //MARZO
                if (dia>=1 & dia<=20) {
                    System.out.println("PISCIS");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>20 & dia<=31) {
                    System.out.println("ARIES");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 4: //ABRIL
                if (dia>=1 & dia<=19) {
                    System.out.println("ARIES");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>19 & dia<=30) {
                    System.out.println("TAURO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 5: //MAYO
                if (dia>=1 & dia<=20) {
                    System.out.println("TAURO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia<20 & dia<=31) {
                    System.out.println("GÉMINIS");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 6: //JUNIO
                if (dia>=1 & dia<=21) {
                    System.out.println("GÉMINIS");
                    System.out.println("(Mensaje Horóscopo)");
                }else if (dia>21 & dia<=30) {
                    System.out.println("CÁNCER");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 7: //JULIO
                if (dia>=1 & dia<=22) {
                    System.out.println("CÁNCER");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>22 & dia<=31) {
                    System.out.println("LEO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 8: //AGOSTO
                if (dia>=1 & dia<=22) {
                    System.out.println("LEO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>22 & dia<=30) {
                    System.out.println("VIRGO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 9: //SEPTIEMBRE
                if (dia>=1 & dia<=22) {
                    System.out.println("VIRGO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>22 & dia<=31) {
                    System.out.println("LIBRA");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 10: //OCTUBRE
                if (dia>=1 & dia<=22) {
                    System.out.println("LIBRA");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>22 & dia<=31) {
                    System.out.println("ESCORPIO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 11: //NOVIEMBRE
                if (dia>=1 & dia<=21) {
                    System.out.println("ESCORPIO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>21 & dia<=30) {
                    System.out.println("SAGITARIO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
            case 12: //DICIEMBRE
                if (dia>=1 & dia<=21) {
                    System.out.println("SAGITARIO");
                    System.out.println("(Mensaje Horóscopo)");
                } else if (dia>21 & dia<=31) {
                    System.out.println("CAPRICORNIO");
                    System.out.println("(Mensaje Horóscopo)");
                }
                break;
        }
    }
}
