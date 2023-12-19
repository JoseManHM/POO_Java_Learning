package SobrecargaYSobrescritura;

public class Gato extends AnimalSobrescritura {
    private String nombre;
    private double peso;
    private String sexo;
    
    @Override
    public void hacerSonido(){
        System.out.println("Soy un gato y hago miau miau");
    }
}
