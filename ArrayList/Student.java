class Student{
    private String StCode;
    private String Name;
    private Double GPA;
    public String GetCode(){
        return this.StCode;
    }
    public String GetName(){
        return this.Name;
    }
    public Double GetGPA(){
        return this.GPA;
    }
    public void SetGPA(double g){
        this.GPA = g;
    }
    Student(){}
    Student(String c,String n,double g){
        this.StCode = c;
        this.Name = n;
        this.GPA = g;
    }
    Student(String c,String n){
        this.StCode = c;
        this.Name = n;
    }
    public String toString() {
        String s = StCode + " " + Name + " " + GPA;
	    return s;
    }
}