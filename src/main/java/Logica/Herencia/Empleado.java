package Logica.Herencia;

public class Empleado extends Persona{
    int num_empleado;
    String departamento;

    public Empleado() {
    }

    public Empleado(int num_empleado, String departamento, int id, String curp, String nombre, String apellido, String domicilio, int telefono) {
        super(id, curp, nombre, apellido, domicilio, telefono);
        this.num_empleado = num_empleado;
        this.departamento = departamento;
    }

    public int getNum_empleado() {
        return num_empleado;
    }
    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
