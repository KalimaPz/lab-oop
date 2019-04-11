public class Person{
    private String name;
    private String lastname;

    Person(){}
    Person(String n, String l) {
        this.name = n;
        this.lastname = l;
    }
    @Override
        public String toString(){
            return String.format("First Name : %s Last Name : %s", this.name,this.lastname);
        }
}