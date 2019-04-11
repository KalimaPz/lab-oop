import java.awt.*;
import javax.swing.*;

public class SwingPanel {

    public void PanelCrate(){
        JPanel p1 = new JPanel();
            p1.setLayout(new FlowLayout(FlowLayout.CENTER));
            for(int i = 0 ; i <= 2; i++){
                p1.add(new JButton(""+i));
            }
        JPanel p2 = new JPanel();
            p2.setLayout(new FlowLayout(FlowLayout.CENTER));
            for(int j = 0; j <= 2; j++){
                p2.add(new JButton(""+j));
            }
         
    }
    SwingPanel(){
        PanelCrate();
    }
    public static void main(String[] args) {
        new SwingPanel();
    }
}
