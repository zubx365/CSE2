//DONE
//
//****************
import java.util.Scanner;

public class Methods {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints: ");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);

        System.out.println("" + a + b + c);


        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");

    }

    public static int getInt(Scanner a) {
            a = new Scanner(System.in);
            int d = 0;


            if (a.hasNextInt()) {
                d = a.nextInt();
                return d;
            }

            else if (a.hasNext()) {
                System.out.println("You did not enter an int; try again-");
                while (!a.hasNextInt()) {
                    a.next();
                    d = a.nextInt();
                    return d;
                } //while
            }
            return d;
        } //end getInt method



    public static int larger(int a, int b) {
            int temp = 0;
            if (a > b) {
                temp = a;
            }
            else if (b > a) {
                temp = b;
            }
            return temp;
        } //end larger method

    public static boolean ascending(int a, int b, int c) {

            boolean ascending;

            if (a < b && b < c) {
                ascending = true;
            }
            else {
                ascending = false;

            }

            return ascending;

        } //end ascending method



}