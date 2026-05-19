import java.util.List;

public class Principal {
    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumnos.txt");
       
        try {
             alumnoDAO.agregaAlumno(new Alumno(987654,"Pedro Gonzalez", 8.5));
        }
        catch(EstudianteDuplicadoException e){
            System.out.println(e.getMessage());
        }

    }
}
