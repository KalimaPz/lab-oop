
import java.io.*;
import java.lang.*;
import java.util.*;

class AirMain{
    public static void main(String args[]) throws IOException {  
        AirCon A1,A2,A3,A4;
            
        A1 = new AirCon();
            A1.setTemp(25);
            A1.setSpeed(1);
            A1.setSwingOn();
        A2 = new AirCon(22,2,false);
        A3 = new AirCon();
            A3.setTemp(24);
            A3.setSpeed(1);
            A3.setSwingOFF();
        A4 = new AirCon(22,2,true);

    System.out.println("Air 1 : TEMP = "+A1.getTemp()+" Speed = "+A1.getSpeed()+" Swing is "+A1.getSwing());
    System.out.println("Air 2 : TEMP = "+A2.getTemp()+" Speed = "+A2.getSpeed()+" Swing is "+A2.getSwing());
    System.out.println("Air 3 : TEMP = "+A3.getTemp()+" Speed = "+A3.getSpeed()+" Swing is "+A3.getSwing());
    System.out.println("Air 4 : TEMP = "+A4.getTemp()+" Speed = "+A4.getSpeed()+" Swing is "+A4.getSwing());

    System.out.println("NEW SETTING");
        A1.setSwingOFF();
        A1.tempDown();
        A1.tempDown();

        A2.tempUp();
        A3.tempUp();
        A3.tempUp();
        A3.tempUp();
        A3.setSwingOn();

        System.out.println("Air 1 : TEMP = "+A1.getTemp()+" Speed = "+A1.getSpeed()+" Swing is "+A1.getSwing());
        System.out.println("Air 2 : TEMP = "+A2.getTemp()+" Speed = "+A2.getSpeed()+" Swing is "+A2.getSwing());
        System.out.println("Air 3 : TEMP = "+A3.getTemp()+" Speed = "+A3.getSpeed()+" Swing is "+A3.getSwing());
        System.out.println("Air 4 : TEMP = "+A4.getTemp()+" Speed = "+A4.getSpeed()+" Swing is "+A4.getSwing());
    }
}