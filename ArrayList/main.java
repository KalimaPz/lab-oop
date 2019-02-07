import java.util.*;
import java.io.*;

class main{
    public static void main(String args[])throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("001","Donukrit"));
        students.add(new Student("002","John"));
        students.add(new Student("003","John"));
        System.out.println(students);
    }
}