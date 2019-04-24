import java.util.Scanner;

public class SafeDivide {
    static int safeDivide(int x , int y) throws ArithmeticException { // this method maybe threw an exception
        if(y == 0) {
            throw new ArithmeticException("Attempt to Divide by Zero!");
        }
        else
        return x/y;
    }
    public static void main(String[] args) {
        int x = 1 ,y = 1, z = 1;
        boolean isFinish = false; // when it finish it'll breaking a while-loop

        while(!isFinish){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter X Value & Y : ");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println("result = " + safeDivide(x,y));
                isFinish = true;
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Try Again! Cannot divide by Zero!");
            }

        }

    }
}
