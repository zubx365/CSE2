//Matthew Chin
//Date: 9/16/2014
//Course Information: CSE002-110
//Homework Assignment 3 Root Program

/*
This program prompts the user to enter a double and then prints out a crude 
estimate of the cube root of the number and the value of this crude guess when cubed.
This program will improve the guess up to 6 times. 
*/

//import Scanner Class
import java.util.Scanner;

//Root class
public class Root{
    
    //main method
    public static void main(String args[]){
        
        //creates instance of Scanner and constructor
        Scanner myScanner = new Scanner(System.in);
        
        //variables
        double root = 0.0;
        
        //takes input for number whos root is to be estimated
        System.out.print("Please enter your number as a double (xx.xx) to take the cube root of: ");
        double myVal = myScanner.nextDouble();
        
        //calculate root
        root = myVal/3;
        
        //calculate guess
        double guess = (6*(root * root * root) + myVal)/(18.1 * (root * root));
        
        //output guess
        System.out.println("The cube root of " + myVal + " is " + guess + '.');
        System.out.println(guess + " cubed is " + (guess*guess*guess) + '.');
        
    }//end main method
}//end class