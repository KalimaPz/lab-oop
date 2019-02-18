public class Employee extends Person {
    private String empID;

    Employee(String name, int age,String eid) {
        super(name, age);
        this.empID = eid;
    } 
    
    public void print_eid(){
        System.out.println("Employee ID = "+this.empID);
    }
    public String toString()
    {
        String s = super.toString() + " " + "EID : " + this.empID; 
        return s;
    }
}