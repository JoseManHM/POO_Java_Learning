package EjercicioPokemon;

public class Main {
    public static void main(String[] args){
        
        Bulbasor bulbasor = new Bulbasor();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasor.atacarAraniazo();
        bulbasor.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();
        
    }
}
