import java.util.*;
import java.io.*;
class main {
    public static void main(String args[]) throws IOException {

        StudentList std = new StudentList();

        Student S1,S2,S3;
        S1 = new Student("001","Donnukrit",4.00);
        S2 = new Student("002","Kantapong",4.00);
        S3 = new Student("003","Suppamat",4.00);

        std.addStudent(S1);
        std.addStudent(S2);
        std.addStudent(S3);
<<<<<<< HEAD
        std.removeStudentBystCode("003"); // Delete
         System.out.println("Find Index = "+std.searchStudentBystCode("002"));
        std.showAllStudent();
        System.out.println("There are "+std.getNumberOfStudent() + " Students");
=======

        std.removeStudentBystCode("002"); // Delete
        System.out.println("index  = " + std.searchStudentBystCode("003")); // Search Result
        std.showAllStudent(); // Showallinfo
        System.out.println("There are "+std.getNumberOfStudent() + " Students"); // That a array size
>>>>>>> ffd4d6ed9a0f7a596e843b69b5ecebe2158d3dc3
    }
}