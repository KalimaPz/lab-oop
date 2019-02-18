public class PermaEmployee extends Employee{
    private int Salary;
    
    PermaEmployee(String n,int a,String eid,int Sal){
        super(n,a,eid);
        this.Salary = Sal;
    }
 
    public void print_salary(){
        System.out.println("Salary = "+this.Salary);
    }
}