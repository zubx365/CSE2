//Matthew Chin
//Date: 9/12/2014
//Course Information: CSE002-110
//Lab 3 Buying Big Macs Program

/*
This program takes user input to calculate
the cost of buying Big Macs. It uses the Scanner class
to obtain from the user how many Big Macs, the cost per 
Big Mac, and the tax percentage(dependent on state; 6% in PA, 8% in MA)
It then displays the total cost.
*/

//import Scanner Class
import java.util.Scanner;
//import DecimalFormat Class
import java.text.DecimalFormat;

//Big Mac Class
public class BigMac{
    
    //main method
    public static void main(String args[]){
    
    //new instance of Scanner object
    Scanner myScanner;
    //Scanner constructor
    myScanner = new Scanner(System.in);
    
    //DecimalFormat Constructor; format double to .XX
    DecimalFormat decF = new DecimalFormat("#.##");
    
    //Variables
    double cost$; //cost of purchase
    int dollars,    //whole dollar amount of cost
    dimes, pennies; //for storing digits
    //to the right of the decimal point
    //for the cost$
    
    //Takes input from user for number of big macs to order
    System.out.print("Enter the number of Big Macs (an integer >0): ");
    int nBigMacs = myScanner.nextInt();//takes input and places int into nBigMacs
    
    //get input cost of big macs
    System.out.print("Enter the cost per Big Mac as" + 
    " a double (in the form xx.xx): " );
    double bigMac$ = myScanner.nextDouble();//takes input and places double into bigMac$
    
    //get input tax of big mac purchase
    System.out.print("Enter the percent tax as a whole number (xx): "); 
    double taxRate = myScanner.nextDouble();//takes input and places double into taxRate
    
    taxRate/=100; //user enters a whole number percent, but I want a proportion
    
    //gets the total cost including tax, dropping decimal fraction 
    cost$ = nBigMacs * bigMac$ * (1+taxRate);
    
    dollars = (int)cost$;//cast cost to int
    
    //get dimes amount, e.g.,
    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
    // where the % (mod) operator returns the remainder
    // after the division; 583 % 100 -> 83, 27 % 5 -> 2
    dimes = (int)(cost$ * 10) % 10;
    pennies = (int)(cost$ * 100) %10; 
    
        //outputs total cost of nBigMacs at cost$, plus sales tax 
        System.out.println("The total cost of " + nBigMacs + 
        " BigMacs, at $" + decF.format(bigMac$) + " per BigMac, with a" + 
        " sales tax of " + (int)(taxRate*100) +
        "%, is $" + dollars + '.' + dimes + pennies + '.');
    
    }//end main method
}//end class