import java.util.*;
import java.io.*;
public class main {
    public static void main(String args[]){
        Scanner Reader = new Scanner(System.in);
        System.out.print("How Many Student ? : ");
        int num = Reader.nextInt();
        String  Code , Name;
        Double gpa;
        Student [] StudentList = new Student[num] ;
        for(int i = 0; i < num ; i++)
            StudentList[i] = new Student();
        for(int i = 0; i < num; i++){
            System.out.println("Student"+(i+1) + " : ");
            System.out.print("STD CODE : ");
                Code = Reader.next();
                    StudentList[i].setCode(Code);
            System.out.print("NAME : ");
                Name = Reader.next();
                    StudentList[i].setName(Name);
            System.out.print("GPA : ");
                gpa = Reader.nextDouble();
                    StudentList[i].setGPA(gpa);
        }
        for(int i = 0 ; i < num ;i ++ ){
            System.out.println(StudentList[i].toString());
        }
    }   
}