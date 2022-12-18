import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int  esta1 = sc.nextInt();

        String estacion = null;

        switch (esta1) {
            case 1:
                estacion = "Primavera";
                break;
            case 2:
                estacion = "Verano";
                break;
            case 3:
                estacion = "Otonio";
                break;
            case 4:
                estacion = "Invierno";
                break;
            default:
                System.out.println("Ingrese un numero valido");
        }
        System.out.println("La  Estacion elegida es "+estacion);
    }

}