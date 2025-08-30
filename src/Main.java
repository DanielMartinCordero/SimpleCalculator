import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        double numero1 = 0;
        double numero2 = 0;
        boolean bucle= true;
        while (bucle) {
            boolean bucle1 = true;
            boolean bucle2 = true;
            boolean bucle3 = true;
            boolean bucle4 = true;
            boolean bucle5 = true;
            System.out.println("¡Bienvenido a la calculadora! Podrá sumar, restar, multiplicar y dividir");
            while (bucle1) {
                try {
                    System.out.println("Elija el primer número de la operación (puede usar decimales con .)");
                    numero1 = sc.nextDouble();
                    bucle1 = false;
                }
                catch (InputMismatchException e) {
                    System.out.println("Por favor escriba un número válido");
                    sc.nextLine();
                    continue;
                }
            }
            while (bucle2) {
                try {
                    System.out.println("¡Perfecto! ¿Y el segundo?");
                    numero2 = sc.nextDouble();
                    sc.nextLine();
                    bucle2 = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, elija un número válido");

                    sc.nextLine();
                    continue;
                }
            }
            while (bucle3) {
                System.out.println("¡De acuerdo! ¿Que operación quiere hacer con " + numero1 + " y " + numero2 + "? Escriba el nombre de la operación (resta, suma...)");
                String operacion = sc.nextLine().toLowerCase();
                switch (operacion) {
                    case "suma":
                        fsuma(numero1, numero2);
                        break;
                    case "resta":
                        fresta(numero1, numero2);
                        break;
                    case "multiplicar":
                        fmultiplicacion(numero1, numero2);
                        break;
                    case "dividir":
                        fdivision(numero1, numero2);
                        break;
                    default:
                        System.out.println("Operación no válida");
                }
                bucle4 = true;
                while (bucle4) {
                    System.out.println("¿Desea utilizar estos mismos números("+numero1+", "+numero2+") para otra operación?");
                    String repetir = sc.nextLine();
                    if (repetir.equalsIgnoreCase("si") || repetir.equalsIgnoreCase("sí")) {
                        System.out.println("¡Perfecto!");
                        bucle4 = false;
                        continue;
                    }
                    else if (repetir.equalsIgnoreCase("no")) {
                        bucle3 = false;
                        bucle4 = false;
                    }
                    else {
                        System.out.println("Por favor, responda con si o no");
                        continue;
                    }
                }
            }
            while (bucle5) {
                System.out.println("¿Desea realizar otra operación?");
                String end = sc.nextLine().toLowerCase();
                switch (end) {
                    case "si":
                    case "sí":
                        System.out.println ("¡Perfecto! Volviendo al inicio...");
                        bucle5 = false;
                        continue;
                    case "no":
                        System.out.println("Perfecto, ¡Muchas gracias por usar nuestros servicios!");
                        bucle5 = false;
                        bucle = false;
                        break;
                    default:
                        System.out.println("Por favor, responda con si o no");
                        continue;
                }
            }
        }

    }
    public static void fsuma(double numero1, double numero2) {
        double suma = numero1 + numero2;
        System.out.println("El resultado de la suma es de "+suma+"!");
    }

    public static void fresta(double numero1, double numero2) {
        double resta = numero1 - numero2;
        System.out.println("El resultado de la resta es de "+resta+"!");
    }
    public static void fmultiplicacion(double numero1, double numero2) {
        double multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es de "+multiplicacion);
    }
    public static void fdivision(double numero1, double numero2) {
        double division = numero1 / numero2;
        System.out.println("El resultado de la división es de "+division);
    }
}
