//import Scanner class
import java.util.Scanner;
//Blocked Again class
public class BlockedAgain {
    //main method
    public static void main(String[] s) {
            //variable to hold user input after getInt() call
            int m;
            //force user to enter int in range 1-9, inclusive.
            m = getInt(); //assigns value of getInt() to m'
            //prints out block design based on int
            //allBlocks(m);
        }
        //getInt() method
        //while loop structure that continues to run until acceptable input is taken
        //this is done by running checkRange(), which calls checkInt() which takes the input confirms its an int, 
        //then passes this value to checkRange() to check if it is in [1,9]
    public static int getInt() {

        int done = 0; //control for while loop

        while (done == 0) { //while loop continues until done is set to 1

            boolean rangeCheck = checkRange(); //sets rangeCheck to have the value returned by checkRange() method to avoid
            //pass by value error

            if (rangeCheck == false) { //if statment checks return value of rangeCheck, if false continues
                //while loop

                done = 0; //ensures while loop continues with value of 0
                
                return 0;
                
            } //end else if

            if (rangeCheck == true) { //ensures while loop ends if rangeCheck returns a true value, done = 1
                done = 1;
            }
        } //end while
        return 0;
    }

    //checkInt() method that takes user input and then confirms input is an int
    public static int checkInt() {

        Scanner myScanner = new Scanner(System.in); //create new scanner object

        System.out.println("Please enter an integer between 1 and 9, [1,9]."); //prompt for input
        if (myScanner.hasNextInt()) { //if statement to check input is an int

            int a = myScanner.nextInt(); //assigns int a to the value of taken input

            return a; //return a, for if segment
        }

        else if (!myScanner.hasNextInt()) { //else if to output statement if the input is not an int
            System.out.println("Input not an integer!!"); //output message
            return 0; //return value of 0 for else if segment
        }

        return 1; //return value of 1 for overall checkInt() method
    }

    //method checkRange() that calls checkInt() to get the input and then checks if the input is in the range of [1,9]
    public static boolean checkRange() {

        int rangeCheck = checkInt(); //assigns int rangeCheck to the value returned by checkInt() method

        if (rangeCheck >= 1 && rangeCheck <= 9) { //if statement to check range is between [1,9].
            System.out.println(rangeCheck + " is in the valid range"); //output mesage verifying above if statement is true
            return true; //return boolean value to be used in getInt() to end while loop or continue while loop
        }

        else { //else statement returns boolean value to be used in getInt() to end while or continue it
            System.out.println("You did not enter an integer in the range of [1,9]"); //output message
            return false; //returns boolean value to be used in getInt() to end while or continue it
        }

    }
    /*
    //allBlocks() method that will take the int value from user input and output a block of numbers and dashes 
    //based on int
    public static void allBlocks(int x) {
        
        String out = "";
        for (int i = 1; i <= x; i ++){
            
            out = out + 1;
            
            for(int k = 1; k <= i; k ++){
                System.out.print(out);
            }
            System.out.println();
        }
        return;
    }

    public static void block(){
        
        return;
    }
    
    public static void line(){
    
        return;
    }
    */
    
}
