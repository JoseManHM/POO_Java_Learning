package SobrecargaYSobrescritura;

public class Perro extends AnimalSobrescritura{
    private String nombre;
    private double peso;
    private String sexo;
    //Constructor
    //Getters y Setters
    //Otros métodos
    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y hago guau guau");
    }
}
