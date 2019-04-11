import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounter extends JFrame implements ActionListener {

   JButton SUM_BTN;
   JLabel ADD_LABLE,RESULT_LABEL;
   JTextField VALUE1 , VALUE2, RESULT;
   int result;

public SwingCounter(){
   result = 0 ;
   SUM_BTN = new JButton("SUM");
   ADD_LABLE = new JLabel("+");
   RESULT_LABEL = new JLabel("=");
   VALUE1 = new JTextField("0",10);
   VALUE2 = new JTextField("0",10);
   RESULT = new JTextField("0",10);
   

   this.add(VALUE1);
   this.add(ADD_LABLE);
   this.add(VALUE2);
   this.add(RESULT_LABEL);
   this.add(RESULT);
   this.add(SUM_BTN);
   SUM_BTN.addActionListener(this);

   this.setLocation(500, 500);                             
   this.setSize(280, 90);                                   
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   this.getContentPane().setLayout(new FlowLayout());      
   this.setVisible(true);     
  }
  public void actionPerformed(ActionEvent ae)
  {
     ActionListener numListener = new NumListener();

      if(ae.getSource() == SUM_BTN) {
       //  text.setText(String.valueOf(count));
       //  this.repaint();
      }
  }

   public static void main(String[] args) {                    
      new SwingCounter();
   }
}

/*
public SwingCounter() {

       
   this.setLocation(500, 500);                             
   this.setSize(280, 90);                                   
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   this.getContentPane().setLayout(new FlowLayout());      
   this.setVisible(true);                                   
}
*/
