import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class SwingCounter extends JFrame implements ActionListener {
   JLabel label;       
   JTextField text;     
   JButton button;      
   private int count;           
   public SwingCounter() { 
      this.setTitle("Swing Counter");                         
      count = 0;                                               
      label = new JLabel("Counter");                           
      text = new JTextField("0", 10);                          
      button = new JButton("Count");                           
      button.addActionListener(this);                          
      this.add(label);                                         
      this.add(text);                                          
      this.add(button);                                       
      this.setLocation(500, 500);                              
      this.setSize(280, 90);                                   
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
      this.getContentPane().setLayout(new FlowLayout());       
      this.setVisible(true);                                   
   }
   public void actionPerformed(ActionEvent ae) {               
      if (ae.getSource() == button) {
         count++;
         text.setText(String.valueOf(count));
         this.repaint();
      } 
   }
   public static void main(String[] args) {            // Method main of program

      new SwingCounter();
      System.out.println();

   }
}