import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio1 {
    public static void main(String [] args) {
        Scanner entrada = null;
        int a, b;
        File archivo = new File("entrada.txt");

        try {
            entrada = new Scanner(archivo);
            a = entrada.nextInt();
            b = entrada.nextInt();
            System.out.println("La division es: " + a/b);
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
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