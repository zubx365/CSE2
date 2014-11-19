import java.util.Scanner; //import Scanner class

//FindDuplicates class
public class FindDuplicates {
    //main method
    public static void main(String[] arg) {
            //Scanner constructor
            Scanner scan = new Scanner(System.in);

            //creates, initializes, and allocates memory for an integer array of size 10
            int num[] = new int[10];
            //empty String variable answer to store user input later on
            String answer = "";
            //do while loop execute at least once the prompts to get 10 ints from the user and print out the array with inputs
            //then prompts user to continue or not
            do {
                System.out.print("Enter 10 ints- "); //prompt user for 10 ints
                for (int j = 0; j < 10; j++) { //for loop to loop through all 10 empty spots in the array and fill them with user input
                    num[j] = scan.nextInt(); //take user input and input them in spot, j of num[] array
                }
                String out = "The array "; //control the specific output with String out variable
                out += listArray(num); //return a string of the form "{2, 3, -9}"       
                if (hasDups(num)) { //if statement checks boolean return value of hasDups method, if true prints has
                    out += "has ";
                }
                else { //else prints does not have
                    out += "does not have ";
                }
                out += "duplicates."; //follows after if statement 
                System.out.println(out); //prints out all elements of 'out' after the hasDups() method as run
                out = "The array "; //control the specific output with String out variable again as above
                out += listArray(num); //return a string of the form "{2, 3, -9}"
                if (exactlyOneDup(num)) { //if statement checks if array has exactylyOneDup, exactly one duplicate of an element, prints "has " if returns true
                    out += "has ";
                }
                else { //else prints does no have
                    out += "does not have ";
                }
                out += "exactly one duplicate."; //part of 'out' output 
                System.out.println(out); //prints out all parts of 'out' String variable for user
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //prompts user to continue or not and run again
                answer = scan.next(); //takes input into answer variable
            } while (answer.equals("Y") || answer.equals("y")); //while condition for do while loop, runs as long as user enters either y, or Y

        } //end main

    //listArray method to print out stored array elements in order
    public static String listArray(int num[]) {
            String out = "{"; //prints out { for beginingg output of an array output
            for (int j = 0; j < num.length; j++) { //loops through array 
                if (j > 0) { //if the indice is greater than 0, print a comma to seperate the array elements neatly
                    out += ", ";
                }
                out += num[j]; //assigns the value of the array at num[j] to out
            }
            out += "} "; //ending part of 'out' String
            return out; //return out string 
        } //end listArray method

    //hasDups method, returns true if and only if the input array has at least one repeated entry
    public static boolean hasDups(int num[]) {

            //boolean value to trigger while loop, intially false, set to true when a duplicate is found
            boolean found = false;

            //int i initialized to 0
            int i = 0;

/*
            //while loop to search through array 
            while (found != true) {
            */
                //for loop to loop through array elements after the first one
                //compares the first array element to each successive one for a duplicate

                for (int k = 1; k < num.length - 1; k++) {

                    if (num[i] == num[k]) { //if statement that checks the adjacent values until the end of the array

                        found = true; //flag for found to be set to true which will end while loop and return result 

                    } //end if

                    else if (num[i] != num[k]) { //if statement that checks if te adjacent values are not equal to ensure found is false, and continue while loop

                        found = false; //flag for found to be set to false which will contineu while loop to search through array

                    } //end else if 
                    i++; //increments i so it is 1 less than k to check adjacent values in the array
                } //end for

            //} //end while
            return found; //retun value
        } //end hasDups method

    //exactlyOneDup method, returns true if and only if there is exactly one repeated entry true for {2, 7, 2}
    public static boolean exactlyOneDup(int num[]) {

            //boolean value to trigger while loop, intially false, set to true when a duplicate is found
            boolean found = false;

            //int dup to keep count of duplicates found in the array
            int dup = 0;
            //int i initialized to 0
            int i = 0;

            //while loop to search through array elements
            //while condition to continue do while loop until found is true

            while (found != true) {

                //for loop to loop through array elements after the first one
                //compares the first array element to each successive one for a duplicate\

                for (int k = 1; k < num.length - 1; k++) {

                    if (num[i] == num[k]) { //if statement that checks the adjacent values until the end of the array
                        dup++; //counter for duplicates, increments if adjacent values match

                    } //end if

                    if (dup == 1) { //if statement to check if dup is 1, if it is there is exactly one duplicate return true
                        found = true;

                    } //end if

                    if (dup > 1) { //if statemet to check if dup is greater tan 1, if it is there is more than one dupblicate, return false
                        found = false;
                    }
                } //end for

                i++; //increments i to be 1 less than the k value, thus comparing adjacent values until the end of the array

            } //end while loop

            return found; //return value

        } //end exactlyOneDup method

} //end class
