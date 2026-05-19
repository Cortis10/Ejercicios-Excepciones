public class Alumno {
    private int clave;
    private String nombre;
    private double calificacion;

    public Alumno(int clave, String nombre, double calificacion)    {
        this.clave = clave;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString()    {
        return clave + ", " + nombre + ", " + calificacion;
    }

    @Override
    public boolean equals(Object obj){
        if(obj== null || this.getClass() != obj.getClass()){
            return false;
        }
        Alumno otroAlumno = (Alumno)obj;
        if(this.clave == otroAlumno.getClave()){
            return true;
        }
        else{
            return false;
        }

    }
    public void setCalificacion(double calificacion){
        if(calificacion > 10 || calificacion<0){
                throw new CalificacionInvalidaException("La calificacion es invalida");
            }
        this.calificacion=calificacion;
    }
    
    public int getClave(){
        return clave;
    }
}
