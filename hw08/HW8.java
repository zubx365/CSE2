//Matthew Chin
//Date: 10/28/2014
//Course Information: CSE002-110
//Homework 08 Overloaded Methods Program
/*
This program uses three overloaded methods to get various input from the user and outputs what they entered
if it meets the criteria of being one character long, and matches one of the predefined characters.
Standard input is provided initially for tests
NoteToSelf: added loops that should handle any length of string input and still reliably
test each character..
*/

//import Scanner class
import java.util.Scanner;
//HW8 class
public class HW8 {
    //main method
    public static void main(String[] arg) {
            //variable for input takes char value
            char input;
            //constructor for Scanner class
            Scanner scan = new Scanner(System.in);
            //prompt user to enter C or c, else quit
            System.out.print("Enter 'C' or 'c' to continue.");
            //forces user to enter a string from the keyboard that is exactly one char long and
            //is one of the characters in the string 
            input = getInput(scan, "Cc");
            //output for first getInput method, if it comes out true
            //outputs what user entered
            System.out.println("You entered '" + input + "'");
            //prompts user for y/Y/n/N 
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
            //forces user to enter a string from the keyboard that is exactly one char long and
            //is one of the characters in the string
            //if the user guesses more than the number indicated
            //returns a ' '
            input = getInput(scan, "yYnN", 5); //give up after 5 attempts
            //checks if the input returns a blank character, if it does not
            //prints out what the user entered from the previous(2nd) getInput method
            if (input != ' ') {
                System.out.println("You entered '" + input + "'");
            } //end if
            //forces user to enter a string from the keyboard that is exactly one char long and
            //is one of the characters in the string
            //prompts the user using the second string
            input = getInput(scan, "Choose a digit.", "0123456789");
            //outputs what the user entered
            System.out.println("You entered '" + input + "'");

        } //end main

    //first getInput method takes a scanner and a string
    public static char getInput(Scanner scan1, String a) {

            //constructor for scanner class in getInput(scan,String) method
            scan1 = new Scanner(System.in);

            //test value for while loop contiuation condition
            int test = 0;
            //while loop for method to continue processing inputs from the user
            //until one of the desired characters is entered, in test case 'C' or 'c'.
            while (test == 0) {
                //checks if user input is a string or char value
                if (scan1.hasNext()) {
                    //creates new String var to hold the input the user enters
                    String check = scan1.next();

                    //var to hold the length of the String input
                    int l = a.length() - 1;
                    //checks the length of the string input
                    //ensures it is only 1 character long
                    if (check.length() > 1) {
                        System.out.println("You should enter exactly one character.");
                        test = 0; //sets test to 0 to continue while loop 
                    } //end if

                    char check2 = check.charAt(0); //creates var to hold first letter of string input

                    //checks if isolated character from the entered string is a correct match 
                    //for one of the characters in the String a (given a is only 2 chars long).
                    //loops through input and compares to String a to check for correct input
                    for (int k = 0; k <= l; k++) {
                        if (check2 == (a.charAt(k))) {
                            test = 1; //sets test to 1 to terminate the while loop and continue program
                            return check2; //return value for method in first if statement
                        } //end if
                    } //end for loop

                    //else if to check the input against the true value, 'String a'
                    //outputs error message if it does not match the first or second value
                    //loops through input and compares to String a to check for incorrect input
                    for (int m = 0; m <= l; m++) {
                        if (check2 != (a.charAt(m))) {
                            System.out.println("You did not enter " + a + '.' + " Try again.");
                            break;

                        } //end if
                    } //end for 

                    test = 0; //ensures while loop continues after if statement finishes,
                    //test is still 0, thus continue loop

                } //end if
            } //end while

            return 1; //method return value
        } //end getInput(scan, String) method

    //second getInput method takes a scanner, string, and integer
    public static char getInput(Scanner scan2, String b, int n) {

            //creats new constructor for scan2 in the second getInput method
            scan2 = new Scanner(System.in);
            //loops through the specified number of times (n)
            //taking input from user, if it reaches n, program terminates and outputs error
            for (int i = 1; i <= n; i++) {

                //checks if user input is a string or char value
                if (scan2.hasNext()) {
                    //creates new String var to hold the input the user enters
                    String check = scan2.next();

                    //var to hold the length of the String input
                    int l = b.length() - 1;
                    //checks the length of the string input
                    //ensures it is only 1 character long
                    if (check.length() > 1) {
                        System.out.println("You should enter exactly one character.");
                    } //end if

                    char check2 = check.charAt(0); //creates var to hold first letter of string input

                    //checks if isolated character from the entered string is a correct match 
                    //for one of the characters in the String a (given a is only 2 chars long).
                    //loop through input and compares to input until it reaches end
                    for (int k = 0; k <= l; k++) {
                        if (check2 == (b.charAt(k))) {
                            return check2; //return value for method in first if statement
                        } //end if
                    } //end for loop     

                    //checks when the count reaches n, the limit to the number of attempts the user has 
                    //to input correct value
                    //terminates upon reaching n
                    if (i == n) {
                        System.out.println("You failed after " + n + " tries.");
                        break;
                    } //end if

                    //else if to check the input against the true value, 'String a'
                    //outputs error message if it does not match the first or second value
                    //loop through length of input and checks if input matches any characters
                    //if it DOES NOT outputs error message stating such
                    for (int m = 0; m <= l; m++) {
                        if (check2 != (b.charAt(m))) {
                            System.out.println("You did not enter " + b + '.' + " Try again.");
                            break;
                        } //end else if
                    } //end for loop
                } //end if 
            } //end for loop

            return 2; //return value for method
        } //end getInput(scan2, String b, int n) method

    //third getInput method takes a scanner, string, string
    public static char getInput(Scanner scan3, String c, String d) {

            //constructor for scanner object 3
            scan3 = new Scanner(System.in);

            //test value for while loop contiuation condition
            int test = 0;
            //while loop for method to continue processing inputs from the user
            //until one of the desired characters is entered, in test case 'C' or 'c'.
            while (test == 0) {
                //output prompt String c "Choose a Digit" in this test case
                System.out.println(c);
                //output second prompt to enter one of the following characters in String d
                System.out.print("Enter one of: ");
                //loop outputs all the characters located in String d seperated by ' '_
                for (int i = 0; i <= d.length() - 1; i++) {
                    System.out.print("'" + d.charAt(i) + "' "); //output characters 
                } //end for loop
                //checks if user input is a string or char value
                if (scan3.hasNext()) {
                    //creates new String var to hold the input the user enters
                    String check = scan3.next();

                    //var to hold the length of the String input
                    int l = d.length() - 1;
                    //checks the length of the string input
                    //ensures it is only 1 character long
                    if (check.length() > 1) {
                        System.out.println("You should enter exactly one character.");
                        test = 0; //sets test to 0 to continue while loop 
                    } //end if

                    char check2 = check.charAt(0); //creates var to hold first letter of string input

                    //checks if isolated character from the entered string is a correct match 
                    //for one of the characters in the String a (given a is only 2 chars long).
                    //loops through characters of input and compares to String d to check for validity
                    for (int k = 0; k <= l; k++) {
                        if (check2 == (d.charAt(k))) {
                            test = 1; //sets test to 1 to terminate the while loop and continue program
                            return check2; //return value for method in first if statement
                        } //end if
                    } //end for loop

                    //else if to check the input against the true value, 'String a'
                    //outputs error message if it does not match the first or second value
                    //loops through characters of input and compares to String d to check for wrong input
                    for (int m = 0; m <= l; m++) {
                        if (check2 != (d.charAt(m))) {
                            System.out.println("You did not enter " + d + '.' + " Try again.");
                            break;
                        } //end if
                    } //end for 

                    test = 0; //ensures while loop continues after if statement finishes,
                    //test is still 0, thus continue loop

                } //end if

            } //end while

            return 3; //return value for method
        } //end getInput(scan3, Stringc, String d) method

} //end HW8 class