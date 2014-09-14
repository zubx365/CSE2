//Matthew Chin
//Date: 9/16/2014
//Course Information: CSE002-110
//Homework Assignment 3 Bicycle Program

/*
This program prompts the user to enter two digits, the first giving the number of 
counts on a cyclometer and the second giving the number of
seconds during which the counts occurred, and then prints out the distance 
traveled and the average miles per hour.
*/

//import Scanner
import java.util.Scanner;

//Bicycle Class
public class Bicycle{
    
    //main method
    public static void main(String args[]){
        
        //creates instance of Scanner and constructor
        Scanner myScanner = new Scanner(System.in);
    
        //variables
        double wheelDiameter = 27.0; //wheel diameter
        double PI = 3.14159; // value of PI 
        double feetPerMile=5280; // 5280 feet in 1 mile 
        double inchesPerFoot=12; // 12 inches in 1 foot 
        double secondsPerMinute=60.0; // 60 seconds in 1 minute
        double distance = 0.0; //total distance of trip 
        
            //Takes input for number of seconds during which the counts occurred
            System.out.print("Please enter the number of seconds of your trip as a whole number (XXX): ");
            int tripSeconds = myScanner.nextInt();
            
             //Takes input for counts of cyclometer
            System.out.print("Please enter the number of counts as a whole number (XXX): ");
            int nCounts = myScanner.nextInt();
            
            //calculates the distance traveled in Trip 1
            distance=(nCounts*wheelDiameter*PI);
            distance/=(inchesPerFoot*feetPerMile); // Gives distance in miles
            
            //calculates minutes
            double minutes = tripSeconds/60;
            //caluclates hours
            double hours = minutes/60;
            
            //calculates average miles per hour
            double mph = distance/hours;
            
            //Outputs information(distance, minutes, mph)
            System.out.println("The distance was " + ((int)(distance * 100)/100.0) + " miles" + " and took " + minutes + " minutes.");
            System.out.println("The average miles per hour was: " + ((int)(mph * 100)/100.0) + " mph.");
            
    }//end main method
}//end class