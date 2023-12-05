package Logica.Herencia;

public class Consultor extends Persona {
    int num_consultor;
    String consultora;

    public Consultor() {
    }

    public Consultor(int num_consultor, String consultora, int id, String curp, String nombre, String apellido, String domicilio, int telefono) {
        super(id, curp, nombre, apellido, domicilio, telefono);
        this.num_consultor = num_consultor;
        this.consultora = consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }
    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    public String getConsultora() {
        return consultora;
    }
    public void setConsultora(String consultora) {
        this.consultora = consultora;
    }
}
