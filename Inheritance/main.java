
import java.util.*;
import java.io.*;

class main {
    public static void main(String Args[]) throws IOException {
        Student S1 = new Student();
        Scanner Reader;
        Reader = new Scanner(System.in);
        System.out.print("First Name : ");
        String Name = Reader.next();
        S1.setName(Name);
        System.out.print("Last Name : ");
        String Last = Reader.next();
        S1.setLastname(Last);
        System.out.print("Age : ");
        int age = Reader.nextInt();
        S1.setAge(age);
        System.out.print("Year : ");
        int year = Reader.nextInt();
        S1.setYear(year);
        S1.Introduce();
        S1.print_year();

    }
}