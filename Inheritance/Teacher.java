public class Teacher extends Person {
  private String Faculty;
  
  Teacher(String name , int age ,String faculty) {
    super(name,age); 
    this.Faculty = faculty;
  }
  public void print_faculty() {
      System.out.println("Faculty : "+this.Faculty);
  }
  public String toString()
  {
    return super.toString()+" "+Faculty+" Type : Teacher";
  }
}