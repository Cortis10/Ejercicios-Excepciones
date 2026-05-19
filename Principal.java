import java.util.List;

public class Principal {
    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumnos.txt");
       
        try {
            alumnoDAO.eliminarAlumno(456123);
        }
        catch(EstudianteDuplicadoException e){
            System.out.println(e.getMessage());
        }

    }
}
