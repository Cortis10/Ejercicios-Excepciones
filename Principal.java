import java.util.List;

public class Principal {
    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumnos.txt");
        try {
            List<Alumno> alumnos = alumnoDAO.obtenerTodos();
            System.out.println(alumnos);
        }
        catch (FormatoArchivoException e)   {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
