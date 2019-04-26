// @Author : Donnukrit Satirakul
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame {
   private final JLabel CelciusLabel = new JLabel("Celcius : ");
   private final JLabel FarenheitLabel = new JLabel("Farenheit : ");
   private JTextField  C_Text = new JTextField("0");
   private JTextField F_Text = new JTextField("0");
   private  JOptionPane alert = new JOptionPane();

    public TempConverter() {
        CreateFrame();
        addListener();
    }

    private void CreateFrame() {
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,100);
        setTitle("Temperature Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        add(CelciusLabel);
        add(C_Text);
        add(FarenheitLabel);
        add(F_Text);
    }
    private void addListener() {
        C_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(e.getSource() == C_Text)
                    {
                        double value;
                        value = CtoF(Double.parseDouble(C_Text.getText()));
                        F_Text.setText(Double.toString(value));
                        System.out.println("C = "+Double.parseDouble(C_Text.getText()));
                        System.out.println("F (Converted) = "+value);
                    }
                }
                catch(NumberFormatException nfe) {
                    System.out.println("ERROR! Please Enter Only Number");
                    showError();
                }
            }
        });

        F_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(e.getSource() == F_Text)
                    {
                        double value;
                        value = FtoC(Double.parseDouble(F_Text.getText()));
                        C_Text.setText(Double.toString(value));
                        System.out.println("F = "+Double.parseDouble(F_Text.getText()));
                        System.out.println("C (Converted)= "+value);
                    }
                }
                catch (NumberFormatException nfe){
                    System.out.println("Error Enter Only Number");
                    showError();
                }
            }
        });
    }
    private void showError(){
        alert.createDialog("Error!");
        alert.showMessageDialog(null,"Error Enter Only Number");
    }
    private double CtoF(double C){
        double result = C * 1.8 + 32;
        return result;
    }
    private  double FtoC(double F) {
        double result = (F-32)/1.8;
        return result;
    }
    public static void main(String[] args) {
        new TempConverter();
    }
}
