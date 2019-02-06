public class Person {
    private String name;
    private int age;

    public Person(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void printDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}