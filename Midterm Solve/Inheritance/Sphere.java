public class Sphere extends Shape3D {
    private double radius;

    public Sphere(String name,
                  double radius){
    super(name);
    this.radius = radius;
    }
    public double getVolume(){
        return 4.0/3 * Math.PI * radius * radius *radius;
    }
}