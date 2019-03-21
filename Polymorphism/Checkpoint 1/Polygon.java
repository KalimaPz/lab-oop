public abstract class Polygon{
    private int n; // side count
    private double[] sides; // side length
    private double area;
    abstract public void calArea();
    public double getArea() {
        return area;
    }
    public Polygon(){}
    public Polygon(int nb) {
        n = nb;
        sides = new double[n]; // array for collect n side.
    }
}