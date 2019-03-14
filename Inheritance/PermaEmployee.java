public class PermaEmployee extends Employee{
    private int Salary;
    
    PermaEmployee(String n,int a,String eid,int Sal){
        super(n,a,eid);
        this.Salary = Sal;
    }
 
    public void print_salary(){
        System.out.println("Salary = "+this.Salary);
    }
    public String toString()
    {
        String s = super.toString() + " " + "Salary : " + this.Salary + " Type : Permanent Employee";  
        return s;
    }
}