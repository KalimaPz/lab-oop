import java.util.*;
import java.io.*;
class main {
    public static void main(String args[]) throws IOException {
        StudentList std = new StudentList();
        
        Student S1,S2,S3;
        S1 = new Student("001","Donnukrit",4.00);
        S2 = new Student("002","Kantapong",3.00);
        S3 = new Student("003","Suppamat",4.00);

        std.addStudent(S1);
        std.addStudent(S2);
        std.addStudent(S3);

        std.showAllStudent();
    }
}