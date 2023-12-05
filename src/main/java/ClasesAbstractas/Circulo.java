package ClasesAbstractas;

public class Circulo implements Figura, Dibujable, Rotable {
    
    private double radio;    

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override //Sobreescritura
    public double calcularArea(){
        double area = (Math.PI * radio * radio);
        return area;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }
    
}
