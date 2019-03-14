public class main{
    public static void main(String[] args){
        Pokemon p1,p2,p3,p4;
            p1 = new Pokemon("Pokemon1");
            p2 = new Pokemon("Pokemon2");
            p3 = new Pokemon("Pokemon3");
            p4 = new Pokemon("Pokemon4");
        PokemonCenter PC;
            PC = new PokemonCenter();
            PC.addPokemon(p1);
            PC.addPokemon(p2);
            PC.addPokemon(p3);
            PC.addPokemon(p4);
            PC.printPokemon();
    //    System.out.println(P.toString());
    }
}