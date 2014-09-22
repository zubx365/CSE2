//Matthew Chin
//Date: 9/23/2014
//Course Information: CSE002-110
//Homework 04 Month Program

/*
This program  prompts the user to enter an integer for the month (1 for January, 2 for February, etc.)  
and then displays the number of days in the month). 
If the number 2 is entered (February) the user is then asked to enter the year.
*/

//import Scanner class
import java.util.Scanner;

//Month class
public class Month{
    
    //main method
    public static void main(String args[]){
        
        //initialize scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        //variables
        //integer month value 1-12
        int month=0;
        
        //get input from user for month
        System.out.print("Enter an int giving the number of the month (1-12) ");
        if(myScanner.hasNextInt()){ //test input for int value
            
        month = myScanner.nextInt(); //assigns month to user input
        
        }//end if 
        
        //switch statement
        //test cases for 1-12 for each month
        //positive lists the number of days in each month
        switch(month){
            
            case 1:                     //1-January
                System.out.println("January has 31 days.");
                break;
            
            case 2:                     //special case calculate leap year 
                System.out.print("Please enter the year: ");
                if(myScanner.hasNextInt()){ //test for int value
                int year = myScanner.nextInt(); //set year to input
                
                    //leap year algorithm 
                    if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)){
                        System.out.println("February has 29 days in " + year + '.');
                    }//end leap year if   
                     
                        else
                            System.out.println("February has 28 days in " + year + '.');
                    
                }//end if in case 2
                
                break;
            
            case 3:                     //3-March
                System.out.println("March has 31 days.");
                break;
            
            case 4:                     //4-April
                System.out.println("April has 30 days.");
                break;
            
            case 5:                     //5-May
                System.out.println("May has 31 days.");
                break;
            
            case 6:                     //6-June
                System.out.println("June has 30 days.");
                break;
            
            case 7:                     //7-July
                System.out.println("July has 31 days.");
                break;
            
            case 8:                     //8-Auguts
                System.out.println("August has 31 days.");
                break;
                
            case 9:                     //9-September
                System.out.println("September has 30 days.");
                break;
            
            case 10:                    //10-October
                System.out.println("October has 31 days.");
                break;
            
            case 11:                    //11-November
                System.out.println("November has 30 days.");
                break;
            
            case 12:                    //12-December
                System.out.println("December has 31 days.");
                break;
            
            default :               //default if all else fails
                System.out.println("-ERROR- You did not enter a positive int (1-12)");
                
        }//end switch
        
    }//end main method
    
}//end class