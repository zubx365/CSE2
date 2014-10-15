//Matthew Chin
//Date: 10/14/2014
//Course Information: CSE002-110
//Homework 06 Root Program
/*
This program calculates the square root of a number utilzing the bisection method
which uses high mediums and lows to narrow the down the square root of a number. 
*/

//import Scanner
import java.util.Scanner;

//Root class
public class Root{
    
    //main method
    public static void main(String args[]){
        
        //create scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //variables
        double myNum = 0.0; //var for number entered by user must be double
        double high = 0.0;  //high interval of range from user input
        double middle = 0.0;  //middle value between high and low interval of input from user
        double low = 0.0;     //low value of range from user input
        
        System.out.println("Enter a double value: ");   //asks user for a double to get the square root of
        
        if(myScanner.hasNextDouble()){  //checks if input is a double
        
            myNum = myScanner.nextDouble(); //sets myNum to input 
            
            if(myNum == 0){                        //checks if the input is 0, if it is prints error
            System.out.println("Enter a positive int");
            return;
            }//end if
            
            
            
            high = 1 + myNum;   //sets the high interval by adding 1 to x
            middle = (high + low) / 2;  //sets the middle interval between high and low by taking average
            //System.out.println(middle);
            
            double y = (high - low); //vars to simplify while conditional expression
            double z = (0.0000001*(1+myNum)); //vars to simplify while conditional expression
            
            for(int i = 0; i <=(1*(0.0000001)); i++){  //while condition run loop until difference between high and low is less than 0.0000001*(1+myNum)
            
            middle = (high + low)/2;
            
            if(Math.pow(middle, 2.0) > myNum){  //if the middle value squared is greater than myNum that value is now the high value of the interval
                high = Math.pow(middle, 2.0); //assigns the value to the high value of the interval if it squared is greater than myNum\
            }// end if
            else{                               //else the value was less than myNum and is now the low of the interval
                low = Math.pow(middle, 2.0);
            }//end else
    
        }//end for
            
            System.out.println("The square root of: " + myNum + " is " + middle);   //output the square root of the double inputted by user
            
        }//end if
        
        else{                                       //handles all other errors such as string or char input
            System.out.println("Error not a Double");
        }//end else    
        
    }//end main
    
}//end class