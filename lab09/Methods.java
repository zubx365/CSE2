//import Scanner class
import java.util.Scanner;

public class Methods {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints: ");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");

    }

    public static Scanner getInt(int a) {
        Scanner myScan = new Scanner(System.in);
        int pass = 0;
        while (pass == 0) {

            if (myScan.hasNextInt()) {
                a = myScan.nextInt();
                pass = 1;
                return a;
            }
            else {
                System.out.println("Please enter an integer: ");
                pass = 0;
                return 0;
            }
            
        }
    }

    public static int larger(int a, int b) {
        int x = 0;
        if (a > b) {
            return a;
        }
        else if (b > a) {
            return b;
        }
    }

    public static boolean ascending(int a, int b, int c) {
        
        boolean ascending;
        
        
        
    }
}