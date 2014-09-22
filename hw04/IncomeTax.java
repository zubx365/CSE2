//Matthew Chin
//Date: 9/23/2014
//Course Information: CSE002-110
//Homework 04 Income Tax Program

/*
This program  prompts the user to enter an int that gives the thousands of dollars of income 
and then writes out the amount of tax on the income, 
given the following (progressive) schedule:  
<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.
*/

//import Scanner class
import java.util.Scanner;
//import DecimalFormat Class
import java.text.DecimalFormat;

//Income Tax class
public class IncomeTax{
    
    //main method
    public static void main(String args[]){
        
        //initialize scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        //DecimalFormat Constructor; format double to .XX
        DecimalFormat decF = new DecimalFormat("$###,###,###.0#");
        
        //variables
        int income=0;
        double taxedIncome=0;
        
        //get input for income
        System.out.print("Enter an int giving income in number of thousands: ");
        if(myScanner.hasNextInt()){         //checks input is int
            income =  myScanner.nextInt(); //assigns income value of user input
        }//end scanner if
        
            if(income > 0 && income < 20){                //test income entered is greater than 0 < 20,000

                taxedIncome = income * 1000 * .05;        //calculate taxed Income at respective 5%
                System.out.println("The tax rate on $" + income + ',' + "000.0" + " is 5%, and the tax is: " + decF.format(taxedIncome) + '.');
                return;
            }//end first if
            
            if(income >=20 && income < 40){         // tax bracket income >=20,000 and < 40,000
                taxedIncome = income * 1000 *.07;     //calculate taxed Income at respective 7%
                System.out.println("The tax rate on $" + income + ',' + "000.0" + " is 7%, and the tax is: " + decF.format(taxedIncome) + '.');
                return;
            }//end second if
            
            if(income >=40 && income < 78){     //tax bracket income >=40,000 and <78,000
                taxedIncome = income * 1000 * .12;    //calculate taxed Income at respective 12%
                System.out.println("The tax rate on $" + income + ',' + "000.0" + " is 12%, and the tax is: " + decF.format(taxedIncome) + '.');
                return;
            }//end third if
                        
            if (income >= 78){           //tax bracket income >= 78,000
                taxedIncome = income * 1000 *.14;     //calculate taxed Income at respective 14%
                System.out.println("The tax rate on $" + income + ',' + "000.0" + " is 14%, and the tax is: " + decF.format(taxedIncome) + '.');
                return;
            }// end fourth if
            
                else if(income <= 0 || !myScanner.hasNextInt()) //ERROR input was less than or equal to 0 OR input was not an integer value(hi)
                    System.out.println("-ERROR- You did not enter a positve integer.");
                    return;
    }//end main 
    
}//end class