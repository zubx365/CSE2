//Matthew Chin
//Date: 9/16/2014
//Course Information: CSE002-110
//Homework Assignment 3 Root Program

/*
This program prompts the user to enter a double and  
then prints out the first four digits to the right of the decimal point.
*/

//import Scanner
import java.util.Scanner;

//Four Digits Class
public class FourDigits{
    
    //main method
    public static void main(String args[]){
        
        //creates instance of Scanner and constructor
        Scanner myScanner = new Scanner(System.in);
        
        //variables
        double deci=0.0;
        
        //gets input from user for the double number to use
        System.out.print("Enter a double (XX.XXXX) and I display the four digits to the right of the decimal point: ");
        double num1 = myScanner.nextDouble();
        
        //manipulates the input to get 4 digits after the deicmal point
        
        deci = (num1 * 10000) % ((int)num1 * 10000);
        
        //output 4 decimal digits
        System.out.println("The four digits are: " + (int)deci + '.');
        
    }//end main method
}//end class