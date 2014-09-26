//Matthew Chin
//Date: 9/26/2014
//Course Information: CSE002-110
//Lab 05 Time Random Games Program

/*
This program utilizes the Math.random() and the Scanner class to obtain
from the user 1 of 3 choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
card from a deck of playing cards. The user should enter one of the Strings “R” , “r”,
“C”, “c”, “P”, “p”. If the string is not of length one, an error message should be
displayed. If the string has any other character than ‘R’, ‘r’, ‘C’, ‘c’, ‘P’, or ‘p’ an error
message should be displayed. If the user enters “R” or “r” then the program will print
the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
and a blue 00). If the user enters “C” or “c”, then the program should display the
random outcome of two rolls of a die (each roll in the range 1, 2, …, 6). If the user
enters “P” or “p”, then the program should display a random draw from a deck of
cards. Notice the use of “should” in the previous two sentences. For this
assignment, the Craps and Picking options need not be implemented. If you don’t
implement the option, the program should display a message to the effect that the
option has yet to be implemented.
*/

//import Scanner class
import java.util.Scanner;

//import Math class
import java.lang.Math;

//Random Games class
public class RandomGames{
    
    //main method
    public static void main(String args[]){
        
        //initialize scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");   //get input for game type, only R,r is implemented
        
        if(myScanner.hasNext()){    //check input for a string
            
            String choice = myScanner.next();   //get input from user put in choice variable

            if(choice.toUpperCase().equals("R")){ //check that letter is correct for roulette option R,r
                
                int rouletteNum = (int)(Math.random()*37) + 1;  //set roulete num to some random value [0, 38)
                
                switch(rouletteNum){    //switch statement for different outcomes 00 is 1, where 0 is 0, all other values to be printed as default condition
                    
                    case 0:
                        {
                            System.out.println("Roulette: 0"); //output
                            break;
                        }//end case 1 value of 0
                    
                    case 1:
                        {
                            System.out.println("Roulette: 00"); //output
                            break;
                        }//end case 2 value of 00
                        
                    default: // all other values after 0 and 00 are that value plus 1.
                        
                            System.out.println("Roulete: " + ((int)rouletteNum + 1) ); //print output
                            break;
                        
                }//end switch
                
            }//end roulette if
            
            if(choice.toUpperCase().equals("C")){
                System.out.println("This option to play Craps will be implemented later.");
                return;
            }//end Craps if
            
            if(choice.toUpperCase().equals("P")){
                System.out.println("This option to pick a card will be implemented later.");
                return;
            }//end pick a card if
        
            if(choice.length() > 1){    //input is more than 1 character length error
                
                System.out.println("A single character expected...");
                return;
            }
        else if(choice.toUpperCase().charAt(0) != 'R' && choice.toUpperCase().charAt(0) != 'C' && choice.toUpperCase().charAt(0) != 'P'){ //error character does not match R,r for roulette,craps, or pick a card option
            
            System.out.println(choice + " is not a valid option (R,r, C,c, P,p)");
            return;
        
        }//end else if
        
        }//end if
        
    }//end main method
    
}//end class