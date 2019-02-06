class Student extends Person{
    private int year;
   // private float grade;

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void print_year() {
        System.out.println("Year = "+this.year);
    }

    Student (){

    }
}