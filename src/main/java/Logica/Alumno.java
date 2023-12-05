package Logica;

public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;
    
    //constructor vacio
    public Alumno() {
    }
    //constructor con todos los parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //void no retorna nada
    public void mostraNombre(){
        System.out.println("Hola soy un alumno y sé decir mi nombre");
    }
    
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobe la materia");
        }else{
            System.out.println("Reprobé la materia");
        }
    }
}
