import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyProgramGUI extends JFrame {
    private JButton clearButton = new JButton("Clear");
    private JTextField textField = new JTextField(10);
    private JTextArea textArea = new JTextArea();
    private JPanel UI_PANEL = new JPanel();

    public MyProgramGUI() {

        this.setTitle("My Program");
        this.setSize(800,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,2));
        addUiPanel();
        addKeyFunc();
        addClearKey();
        this.add(textArea);
    }
    public void addUiPanel(){
        UI_PANEL.add(textField);
        UI_PANEL.add(clearButton);
        this.add(UI_PANEL);
    }

    private void addKeyFunc(){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    textArea.append(textField.getText()+"\n");
                    System.out.println("[Debug] Text Get = " + textField.getText());
            }
        });
    }
    private  void addClearKey(){
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == clearButton)
                {
                    textArea.setText("");
                    System.out.println("[Debug] Text Clear "+textArea.getText());
                }
            }
        });
    }
}
