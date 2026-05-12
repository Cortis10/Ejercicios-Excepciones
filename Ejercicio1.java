import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ejercicio1 {
    public static void main(String [] args) {
        Scanner entrada = null;
        PrintWriter salida = null;
        int a, b;
        File archivo = new File("entrada.txt");

        try {
            entrada = new Scanner(archivo);
            salida = new PrintWriter("salida.txt");
            a = entrada.nextInt();
            b = entrada.nextInt();
            salida.println("La division es: " + a/b);
        }
        catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");
        }
        catch (InputMismatchException e)    {
            salida.println("Entrada no valida");
        }
        catch (ArithmeticException e)   {
            salida.println("Division por cero");
        }
        finally {
            if (entrada != null)    {
                entrada.close();
            }
            if (salida != null) {
                salida.close();
            }
        }
    }
}