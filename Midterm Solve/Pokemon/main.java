import java.util.ArrayList;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner Reader = new Scanner(System.in);
        Pokemon Pokeball;
        PokemonCenter pokemons;
                      pokemons = new PokemonCenter();
        String tempName;
        
        while(true){
            
            System.out.print("Enter Pokemon Name  (q/Q for Exit): ");
            tempName = Reader.nextLine();
            if(tempName.equals("q") || tempName.equals("Q"))
            {
                break;
            }
            else
            {                
                Pokeball = new Pokemon(tempName);             
                pokemons.addPokemon(Pokeball);
            }
        }
        pokemons.printPokemon();
    }
}
