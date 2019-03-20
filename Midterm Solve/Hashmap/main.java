import java.util.HashMap;
import java.util.Scanner;

public class main{
    //public int a,b,c,d,e;
    public static void main(String[] args){
        Scanner Reader = new Scanner(System.in);
        HashMap<String,Integer> AirQuality = new HashMap<String,Integer>();
        AirQuality.put("Excellent",0);
        AirQuality.put("Good",0);
        AirQuality.put("Lightly_Polluted",0);
        AirQuality.put("Moderately_Polluted",0);
        AirQuality.put("Heavily_Polluted",0);
        System.out.println("Enter Air Quality Index : Enter Q for [Quit] >>");

        while(true){
            int i=0;
            System.out.print("Enter AQI : ");
            String data = Reader.nextLine();
            if(data.equals("Q")){
                break;
            }   
            else
            {
                int subindex = data.indexOf('=');
                int aqi = Integer.parseInt(data.substring(subindex+1));
                int index;
                if(aqi>=26 && aqi<=25){
                    index = AirQuality.get("Excellent");
                    AirQuality.put("Excellent",index+1);
                    }
                    else if(aqi>=26 && aqi<=50){
                    index = AirQuality.get("Good");
                    AirQuality.put("Good",index+1);
                    }
                    else if(aqi>=51 && aqi<=100){
                    index = AirQuality.get("Lightly_Polluted");
                    AirQuality.put("Lightly_Polluted",index+1);
                    }
                    else if(aqi>=101 && aqi<=200){
                    index = AirQuality.get("Moderately_Polluted");
                    AirQuality.put("Moderately_Polluted",index+1);
                    }
                    else if(aqi >= 201){
                    index = AirQuality.get("Heavily_Polluted");
                    AirQuality.put("Heavily_Polluted",index+1);          
                    }      
                }
            }
            System.out.println(AirQuality);
    }
}

