import java.util.*;
import java.io.*;
public class main {
    public static void main(String args[]){
        Student [] StudentList = new Student[3] ; // Intialize Object
            StudentList[0] = new Student("001","Donnukrit"); 
            StudentList[1] = new Student("002","Teerapong");
            StudentList[2] = new Student("003","Kantapong");
                StudentList[0].setGPA( 4.00);
                StudentList[1].setGPA( 3.30);
                StudentList[2].setGPA( 2.80);
       for(int i = 0 ; i < 3 ;i ++ ){
            System.out.println(StudentList[i].toString());
        }

    }   
}