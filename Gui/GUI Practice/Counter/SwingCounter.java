import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SwingCounter extends JFrame implements ActionListener {

    JLabel CNT_LABLE = new JLabel("Count : ");
    JTextField CNT_TEXT = new JTextField("0",10);
    JButton CNT_BTN = new JButton("Count");
    int count;

    public SwingCounter()
    {   count = 0;
        this.setTitle("SwingCounter");
        this.setSize(600,600);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        this.add(CNT_LABLE);
        this.add(CNT_TEXT);
        this.add(CNT_BTN);

        CNT_BTN.addActionListener(this);

        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == CNT_BTN)
        {
            count++;
            this.repaint();
        }
    }
    public static void main(String[] args) {
        new SwingCounter();
    }
}