public class Student{
    // instance variable member variable
    private String name;
    private int id;
    // constructor
    public Student()
    {
        this.name = "Hello";
        this.id = 100;
    }
    // constructor (Overloaded)
    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setID(int newId){
        this.id = newId;
    }
}