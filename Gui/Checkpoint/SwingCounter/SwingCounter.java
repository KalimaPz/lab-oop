import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SwingCounter extends JFrame 
    implements ActionListener {

    JButton CNT_BUTTON = new JButton("Count");
    JTextField CNT_TEXT = new JTextField("0",10);
    JLabel CNT_LABEL = new JLabel("Count : ");
        int count = 0 ;

    SwingCounter(){

        setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setTitle("SwingCounter");
        setSize(600,100);

        add(CNT_LABEL);
        add(CNT_TEXT);
        add(CNT_BUTTON);
        CNT_BUTTON.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == CNT_BUTTON) {
            count++;
            CNT_TEXT.setText(Integer.toString(count));
            System.out.println(count);
        }

    }
    
    public static void main(String[] args)
    {
        new SwingCounter();
    }
}