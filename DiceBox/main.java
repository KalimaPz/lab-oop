import java.io.*;
class main {
    public static void main(String args[]) throws IOException
    {
        Dice d1 = new Dice();
        System.out.println(d1.toString());

        DiceBox box = new DiceBox();
         box.addDice(d1);
        box.addDice(new Dice());
        box.addDice(new Dice());

  System.out.println("Before shaking: total = " + box.TotalFace());
  box.shake();
  System.out.println("After shaking: total = " + box.TotalFace());

  box.printDice();
    }
}