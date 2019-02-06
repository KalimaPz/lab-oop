class Person {
    private String FirstName,Lastname;
    private int Age;
 
    public void setName(String newName)
    {
        this.FirstName = newName;
    }
    public void setLastname(String newLastname)
    {
        this.Lastname = newLastname;
    }
    public void setAge(int setAge)
    {
        this.Age = setAge;
    }
    public void Introduce()
    {
        System.out.println("My Name is " + this.FirstName + " " + this.Lastname + " " + this.Age);
    }
    Person(){

    }
    Person(String Name,String Lastname,int Age){
        this.FirstName = Name;
        this.Lastname = Lastname;
        this.Age = Age;
    }
}