import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


public class TempConv extends JFrame implements TextListener{
    JLabel C_JLable , F_JLabel;     
    JTextField C_Text , F_Text;
    DocumentListener Doc_list = new DocumentListener(){
    
        @Override
        public void removeUpdate(DocumentEvent e) {
            Convert(e);
        }
    
        @Override
        public void insertUpdate(DocumentEvent e) {
            
        }
    
        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
    };
    TempConv(){

        C_JLable = new JLabel("Celcius : ");
        F_JLabel = new JLabel("Farenheit : ");
        C_Text = new JTextField("0",5);
        F_Text = new JTextField("0",5);

        setSize(600,100);
        setTitle("Temperature Converter");
        setLayout(new GridLayout(2,2,1,1));
        add(C_JLable);
            C_JLable.addKeyListener(this);
        add(F_JLabel);
        add(F_Text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    public void textValueChanged(TextEvent te){
        if(te.getSource() == C_Text)
        {
            CelciusToFarenheit(Double.parseDouble(C_Text.getText()));
        }
        else if(te.getSource() == F_Text)
        {
            FarenheitToCelcius(Double.parseDouble(F_Text.getText()));
        }
    }

    public void CelciusToFarenheit(double celcius){

        double farenheit = (9 * celcius + 160) / 5f;
        System.out.println(farenheit);
        F_Text.setText(Double.toString(farenheit));

    }
    public void FarenheitToCelcius(double farenheit){

        double celcius = (5 * (farenheit - 32)) / 9f;
        System.out.print(celcius);
        C_Text.setText(Double.toString(celcius));
    }
    public static void main(String[] args){
        new TempConv();
    }
}