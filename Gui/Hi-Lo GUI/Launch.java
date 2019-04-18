
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Launch extends JFrame implements ActionListener {
    JButton DiceRoll = new JButton("Roll");
    JLabel  Score = new JLabel("Score : ");
    JLabel Point = new JLabel("NULL");
    JLabel PointClass = new JLabel("Type (Hi , Lo , Mid) : ");
    JLabel PointShow = new JLabel("NULL");
    DiceBox Box;

    Launch() {
        CreateDiceBox();
        setTitle("My High-Low DNK-DEV");
        setSize(600,200);
        setLayout(new GridLayout(3,2,2,2));
        add(Score);
        add(Point);
        add(PointClass);
        add(PointShow);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        add(DiceRoll);
        DiceRoll.addActionListener(this);
        this.setVisible(true);
    }
public void CreateDiceBox(){
    Box = new DiceBox();
    Dice d1,d2,d3;
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
    Box.addDice(d1);
    Box.addDice(d2);
    Box.addDice(d3);
}
public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == DiceRoll){
        Box.shake();
        Point.setText(String.valueOf(Box.TotalFace()));
        if(Box.TotalFace() == 11)
        {
            System.out.println("Middle");
            PointShow.setText("Middle");
        }
            
        else if(Box.TotalFace() >= 3 && Box.TotalFace() < 11)
        {
            System.out.println("Low");
            PointShow.setText("Low");
        }
        else
        {
            System.out.println("High");
            PointShow.setText("High");
        }
    }
}


}