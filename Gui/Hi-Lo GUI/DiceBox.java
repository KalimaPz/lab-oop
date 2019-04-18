import java.util.*;
import java.io.*;

class DiceBox {
    private ArrayList<Dice>  dices;
    
    public void addDice(Dice d){
        this.dices.add(d);
    }
    DiceBox(){
        this.dices = new ArrayList<Dice>();
    }
    public int TotalFace(){
        int total=0; 
        for(Dice d:  dices){
           total+=d.getFace();
        }
        return total;
}
    public void shake(){
        Dice d;
        for(int i = 0; i < dices.size(); i++){
            d = dices.get(i);
            d.roll();
        }
    }
    public void printDice(){
        Dice d;
        for(int i = 0; i < dices.size(); i++){
            d = dices.get(i);
            System.out.println("Dice "+(i+1)+" = "+d.getFace());
        }
    }
}