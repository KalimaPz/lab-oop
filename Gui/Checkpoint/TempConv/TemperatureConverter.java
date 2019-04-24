import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TemperatureConverter extends JFrame {

	int callCount = 0;						
	JTextField celsius = new JTextField();	
	JTextField fahren = new JTextField();	

	DocumentListener dl = new DocumentListener() {				
		public void insertUpdate(DocumentEvent e) {Convert(e);}
		public void removeUpdate(DocumentEvent e) {}
		public void changedUpdate(DocumentEvent e) {}
	};

	public TemperatureConverter() {		

		setTitle("Temperature Converter");							
		setSize(330, 80);											
		setLayout(new GridLayout(2,2));								
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	

		JLabel l_celsius = new JLabel("Celsius:");					
		JLabel l_fahren = new JLabel("Fahrenheit:");				
		
		Container cp = getContentPane();							
		cp.add(l_celsius);											
		cp.add(celsius);											
		cp.add(l_fahren);											
		cp.add(fahren);												

		celsius.getDocument().putProperty("owner",(Object)celsius);	
		fahren.getDocument().putProperty("owner",(Object)fahren);
		celsius.getDocument().addDocumentListener(dl);
		fahren.getDocument().addDocumentListener(dl);
	}

	public void Convert(DocumentEvent de) {		

		JTextField txt = (JTextField)de.getDocument().getProperty("owner");

			try {
				if(txt.getText().equals("") == false && txt.getText() != null) {
				    float src = Float.parseFloat(txt.getText());
				    if(txt.equals(celsius)) {
				        CtoF(src);	
				    }
				    else if(txt.equals(fahren)) {
				        FtoC(src);	
				    }
				}
			} catch(Exception ex){}
	}

	public void CtoF(float c) {				
		float f = (9 * c + 160) / 5f;		
		fahren.setText(Float.toString(f));	
	}

	public void FtoC(float f) {				
		float c = (5* (f - 32)) / 9f;		
		celsius.setText(Float.toString(c));	
	}

	public static void main(String args[]) {	
		new TemperatureConverter().setVisible(true);
	}
}
