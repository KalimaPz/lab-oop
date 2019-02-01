class AirCon{

private int temp;
private int FanSpeed;
private Boolean Swing;

    public void setTemp(int newTemp) {
        this.temp = newTemp;
    }
    public void setSpeed(int newSpeed){
            this.FanSpeed = newSpeed;
    }
    public void setSwingOn(){
        this.Swing = true;
    }
    public void setSwingOFF(){
        this.Swing = false;
    }
    public int getTemp(){
        return this.temp;
    }
    public int getSpeed(){
        return this.FanSpeed;
    }
    public Boolean getSwing(){
        return this.Swing;
    }
    public void FanUp(){            // Fanspeed +
        this.FanSpeed += 1;
    }
    public void FanDown(){          // FanSpedd -
        this.FanSpeed -= 1;
    }

    public void tempUp(){           // Temp +
        this.temp += 1;
    }
    public void tempDown(){         //Temp -
        this.temp -= 1;
    }

    AirCon(){                       // Default Constructor 

    }
   
    AirCon(int newTemp,int newSpeed,Boolean Swing){
        this.temp = newTemp;
        this.FanSpeed = newSpeed;
        this.Swing = Swing;
    }
}
    