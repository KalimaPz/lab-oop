import javax.swing.*;
import java.awt.FlowLayout;

public class SwingCounter extends JFrame {

    public SwingCounter() { // GUI Constructor Method
        JLabel CNT_LABEL = new JLabel("Counter");
        JButton CNT_BUTTON = new JButton("Count"); // ("BNT NAME",Button Length)
        JTextField CNT_TEXT = new JTextField("0",10);
        int count = 0;

            this.setTitle("My Counter"); // Set GUI Title JFrame

            this.add(CNT_LABEL);
            this.add(CNT_TEXT);
            this.add(CNT_BUTTON);

            this.setLocation(500,500); // Set Location Line 13 - 15
            this.setSize(280,90);      // Size of JFrame
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close When Click X Button

        this.getContentPane().setLayout(new FlowLayout()); // Create FlowLayout
        this.setVisible(true);         // Set JFrame Appear
    }

    public static void main(String[] args) {
        new SwingCounter();
    }
}