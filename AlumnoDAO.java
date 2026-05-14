import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// DAO = Data Access Object
public class AlumnoDAO {
    private String nombreArchivo;

    public AlumnoDAO(String nombreArchivo)  {
        this.nombreArchivo = nombreArchivo;
    }

    public List<Alumno> obtenerTodos()  {
        List<Alumno> listaAlumnos = new ArrayList<>();
        Scanner entrada = null;
        File archivo = new File(nombreArchivo);
        String linea = null;
        String [] arreglo = null;

        try{
            entrada = new Scanner(archivo);
            while (entrada.hasNext())   {
                linea = entrada.nextLine();
                arreglo = linea.split(",");
                int clave = Integer.parseInt(arreglo[0]);
                double calificacion = Double.parseDouble(arreglo[2]);
                Alumno alumno = new Alumno(clave, arreglo[1], calificacion);
                listaAlumnos.add(alumno);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombreArchivo);
        }
        finally {
            if (entrada != null)    {
                entrada.close();
            }
        }

        return listaAlumnos;
    }
}
