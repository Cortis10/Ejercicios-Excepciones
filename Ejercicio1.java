import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String [] args) {
        Scanner entrada = null;
        int a, b;

        try {
            entrada = new Scanner(System.in);
            System.out.print("Escribe 1er numero: ");
            a = entrada.nextInt();
            System.out.print("Escribe 2do numero: ");
            b = entrada.nextInt();
            System.out.println("La division es: " + a/b);
        }
        catch (InputMismatchException e)    {
            System.out.println("Entrada no valida");
        }
        catch (ArithmeticException e)   {
            System.out.print("Division por cero");
        }
        finally {
            if (entrada != null)    {
                entrada.close();
            }
        }
    }
}