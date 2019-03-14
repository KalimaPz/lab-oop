import java.util.ArrayList;

public class PokemonCenter {
    private ArrayList<Pokemon> List;

    public void addPokemon(Pokemon P){
        List.add(P);
    }
    public void feed(){
        
        for(Pokemon P : List){
            P.eat();
        }
    }
    public void printPokemon(){
        for(int i = 0 ; i < List.size(); i++){
            System.out.println(List.get(i));
        }
    }
    public PokemonCenter(){
        List  = new ArrayList<Pokemon>();
    }
}