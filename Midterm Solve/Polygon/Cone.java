public class Cone extends Shape3D {
    private double radius;
    private double height;
    public Cone(String name,
                double radius,
                double height){
    super(name);
    this.radius = radius;
    this.height = height;
    }
    public double getVolume(){
        return 1.0/3 * Math.PI * radius * radius * height;
    }
}