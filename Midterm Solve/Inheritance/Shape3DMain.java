public class Shape3DMain{

	public static void main(String args[]){
		Shape3D shapes[] = new Shape3D[10];
		shapes[1] = new Sphere("Sphere 1", 10);
		shapes[3] = new Sphere("Sphere 2", 5.5);
		shapes[2] = new Cone("Cone 1", 5, 10);
		shapes[5] = new Cone("Cone 1", 7.5, 10.5);

		Shape3D longest =findLongest(shapes);
		if(longest != null)
			System.out.println("Longest = " + longest.getName() +
				" long = "+ longest.getLongest() +
				" volume = " + longest.getVolume());
		else
			System.out.println("There are empty Shape");
	}
	public static Shape3D findLongest(Shape3D[] shapes){
       
		Shape3D max = shapes[0];
		for(int i=1;i<shapes.length;i++){

			Shape3D shape =  shapes[i];
			if(shape == null){
				continue;
			}
			if( max == null || max.getVolume() < shape.getVolume()){
				max = shape;
			}
		}
		return max;
	}
}








