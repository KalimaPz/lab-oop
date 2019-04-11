
import javax.swing.*;
import java.awt.*;

public class SwingGUI extends JFrame {

    JButton BTN_1 = new JButton("OK");
    JLabel LABEL_1 = new JLabel("Enter Your Name : ") ;
    JTextField TF_1 = new JTextField("Type Name Here",20);
    JCheckBox CHECK_1 = new JCheckBox("Bold");
    JRadioButton RADIO_1 = new JRadioButton("Red");
    // JComboBox COMBO_1 = new JComboBox(new String[] {"Red","Green","Blue"});  // Optional Combobox

    public void FlowFrameCreate(){ // <------- FlowLayout

    //JFrame frame = new JFrame("JAVA GUI Components");
        this.setTitle("Layout manager : FlowLayout");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(800,100);
        this.add(BTN_1);
        this.add(LABEL_1);
        this.add(TF_1);
        this.add(CHECK_1);
        this.add(RADIO_1);
    // this.add(COMBO_1); // Optional Combobox
        setVisible(true);
    }
    
    public void GridFrameCreate(){ // <------- GridLayout 

        this.setTitle("Layout manager : GridLayout");
        setLayout(new GridLayout(5,1,2,2));
        this.setSize(800,600);
        this.add(BTN_1);
        this.add(LABEL_1);
        this.add(TF_1);
        this.add(CHECK_1);
        this.add(RADIO_1);
        setVisible(true);
    }
    public void BorderFrameCreate(){ // <------- Border Layout

        this.setTitle("Layout manager : BorderLayout");
        this.setSize(600,600);
    JButton North , East , South , West , Center;
        North = new JButton("North");
        East = new JButton("East");
        South = new JButton("South");
        West = new JButton("West");
        Center = new JButton("Center");

        setLayout(new BorderLayout(3,3));
        this.add(North,BorderLayout.NORTH);
        this.add(East,BorderLayout.EAST);
        this.add(South,BorderLayout.SOUTH);
        this.add(West,BorderLayout.WEST);
        this.add(Center,BorderLayout.CENTER);

        this.setVisible(true);
    }
    public SwingGUI(){ // This class Constructor

    //   FlowFrameCreate();
    //   GridFrameCreate();
         BorderFrameCreate();
    }
    
    public static void main(String[] args) {

        new SwingGUI(); // Static Runs
    }
}