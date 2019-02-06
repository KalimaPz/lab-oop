public class Student {
private String stCode;
private String name;
private double gpa;
public Student() { }

public Student(String c,String nm) {
    this.stCode = c;
    this.name = nm;
}
public String getCode(){
    return this.stCode;
}
public String getName(){
    return this.name;
}
public double getGPA(){
    return this.gpa;
}
public void setGPA(double g) {
    this.gpa = g;
}
public String toString(){
    String s = stCode + " " + name + " " + gpa ;
    return s;
}
}