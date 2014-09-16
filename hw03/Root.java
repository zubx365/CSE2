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
        double guess = 0.0; //estimated cube root of user input
        
        //takes input for number whos root is to be estimated
        System.out.print("Please enter your number as a double (xx.xx) to take the cube root of: ");
        double myVal = myScanner.nextDouble();
        
        //calculate guess
        guess = myVal/3;
        
        //calculate guess 4 times to increase accuracy
        double root = (2*(guess * guess * guess) + myVal)/(3 * (guess * guess));
        guess = root;
        
        root = (2*(guess * guess * guess) + myVal)/(3 * (guess * guess));
        guess = root;
        
        root = (2*(guess * guess * guess) + myVal)/(3 * (guess * guess));
        guess = root;
        
        root = (2*(guess * guess * guess) + myVal)/(3 * (guess * guess));
        guess = root;
        
        root = (2*(guess * guess * guess) + myVal)/(3 * (guess * guess));
        guess = root;
        //output guess
        System.out.println("The cube root of " + myVal + " is " + root + '.');
        System.out.println(root + " cubed is " + (root*root*root) + '.');
        
    }//end main method
}//end class