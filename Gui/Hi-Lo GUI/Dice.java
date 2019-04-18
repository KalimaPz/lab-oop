class Dice {
    private int face;
    
    public Dice(){
        this.face = 1;
    }
    public Dice(int newFace){
        if(newFace >= 1 && newFace <= 6)
            this.face = newFace;
        else
            System.out.println("Wrong Face Number");
    }
    public void setFace(int newFace){
        if(newFace >= 1 && newFace <= 6)
            this.face  = newFace;
        else 
            System.out.println("Wrong Face Number");
    }
    public int getFace(){
        return this.face;
    }
    public void roll(){
        this.face=1+(int)(Math.random() * 6);
    }
    
    @Override
        public String toString(){
            String returnString;
            returnString="F = "+this.face ;
            return returnString;
    }  
}