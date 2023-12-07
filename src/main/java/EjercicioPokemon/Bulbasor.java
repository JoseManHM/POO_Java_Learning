package EjercicioPokemon;

public class Bulbasor extends Pokemon implements IPlanta {
    
    public Bulbasor(){
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi atacque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasur y este es mi ataque paralizar");
    }
    
}
