public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Tom",200);
        System.out.println("s1 Student Name = "+s1.getName());
        System.out.println("s1 Student ID = "+s1.getID());

        System.out.println("s2 Student Name = "+s2.getName());
        System.out.println("s2 Student ID = "+s2.getID());
    }
}