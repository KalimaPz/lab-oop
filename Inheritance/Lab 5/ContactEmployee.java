public class ContactEmployee extends Employee{
    private int Payment;

    ContactEmployee(String n,int a,String e,int pay){
        super(n,a,e);
        this.Payment = pay;
    }
    
    public void print_payment(){
        System.out.println("Payment = "+this.Payment);
    }
}