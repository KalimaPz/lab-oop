import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab9App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date aDate;
        int month, day , year;
        boolean done = false;
        while(!done) {

            try {
                System.out.print("Enter the month as an integer: ");
                month = scan.nextInt();
                System.out.print("Enter the day as an integer: ");
                day = scan.nextInt();
                System.out.print("Enter the year as an integer: ");
                year = scan.nextInt();
                aDate = new Date(month, day, year);
                done = true;
                System.out.println(aDate.toString());
            }

            catch (InputMismatchException ime){
                System.out.println("Invalid input entered. Enter an integer");
                scan.next();
            }
            catch (DateException ex) {
                System.out.println("DateException: " + ex.getMessage());
            }
            catch (RuntimeException re){
                System.out.println("Invalid Day");
            }
        }
    }
}
