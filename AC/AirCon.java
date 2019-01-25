class AirCon{
    private int Speed;
    private int Temp;
    private boolean swing;
    
    AirCon(int NewSpeed,int NewTemp){
        this.Speed = NewSpeed;
        this.Temp = NewTemp;
    }
    
    public int getSpeed(){
        return this.Speed;
    }
    public int getTemp(){
        return this.Temp;
    }
}
