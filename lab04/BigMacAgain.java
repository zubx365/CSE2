//Matthew Chin
//Date: 9/19/2014
//Course Information: CSE002-110
//Lab 03 Big Mac Again Program

/*
This program  uses the Scanner class to obtain from users 
how many Big Macs they want and whether 
they want an order of fries. 
It then prints out the total cost of the meal. 
Big Macs still cost $2.22 each,  and an 
order of fries costs $2.15.
*/

//import Scanner class
import java.util.Scanner;
//import DecimalFormat Class
import java.text.DecimalFormat;

//BigMacAgain Class
public class BigMacAgain{
    
    //main method
    public static void main(String args[]){
        
        //new instance of Scanner object
        Scanner myScanner;
        //Scanner constructor
        myScanner = new Scanner(System.in);
        
        //DecimalFormat Constructor; format double to .XX
        DecimalFormat decF = new DecimalFormat("0.00");
        
        //constants
        final double bigMacCost$=2.22;
        final double friesCost$=2.15;
        final double taxRate=.06;
        
        
        //Variables
        double cost$; //cost of purchase of big macs and tax
        double cost2$; //costof purchase plus fries and tax
        int dollars,    //whole dollar amount of cost
        dimes, pennies; //for storing digits
        //to the right of the decimal point
        //for the cost$
        int nBigMacs = 0;//number of big macs to order
        String answer = " "; //answer for fries
        
        //take user order for number of big macs
        //verifies input is an int otherwise, program will terminate
        System.out.print("Enter the number of Big Macs @$2.22 per Big Mac (an integer > 0): ");
        if(myScanner.hasNextInt()){
            nBigMacs = myScanner.nextInt();//takes number of big macs entered stored in nBigMacs
            }//end if1
            else{
                System.out.println("You did not enter an integer."); //error message not int entered terminates program
                return;
            }//end else in if1
            //checks int is > 0
            if(nBigMacs > 0){
                //calculate cost of big macs
                cost$ = nBigMacs * bigMacCost$ * (1+taxRate);
                //calculates total cost plus fries
                cost2$ = ((nBigMacs*bigMacCost$) + (friesCost$)) * (1+taxRate);
                System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of: " + nBigMacs + " * " +
                bigMacCost$ + " = $" + decF.format(cost$));                                      //output big mac order
            }//end int > 0 if
                else{
                    System.out.println("You must enter a NUMBER greater than 0!!"); //error message int <0 terminates program
                    return;
                }//end else nBigMacs if
            System.out.print("Would you like to order fries @ $2.15 per order? (Y/y/N/n) ");
            if(myScanner.hasNext()){                                   //tests for string
                answer = myScanner.next();                   //answer scanner object to take next string
                }//end fries if 2
                
                if(answer.toUpperCase().equals("N")){                        //no case
                    System.out.println("Your total comes to: $" + decF.format(cost$)); //out big mac cost first
                    }//end fries if
                    
                    else if(answer.toUpperCase().equals("Y")){                          //yes case
                        System.out.println("You ordered fries at a cost of $" + friesCost$);//output fries order and cost
                        System.out.println("Your final total is: $" + decF.format(cost2$));//total cost of bigmacs and fries
                        }//end elseif fries
                        
                 else{
                     System.out.println("You did not enter (Y/y/N/n).");//error message from wrong char input terminates program
                     return;
                 }//end fries if else   
                
                
           
            
        
        
    }//end main
    
}//end class