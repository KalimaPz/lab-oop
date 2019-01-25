class AirMain{
    public static void main(String args[]) {
        AirCon Air1 = new AirCon(4,25);

        System.out.println(Air1.getSpeed()+" "+Air1.getTemp());
    }
}