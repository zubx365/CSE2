//Matthew Chin
//Date: 9/23/2014
//Course Information: CSE002-110
//Homework 04 Course Number Program

/*
This program takes a 6 digit input that 
corresponds to a Lehigh Course ID. The 6 digit format is
first 4 digits give the year, and last 2 digits gives the semester:
10 Spring, 20 Summer 1, 30 Summer 2, and 40 Fall.
After the 6 digit input is read in, outputs semester and year. 
*/

//import Scanner class
import java.util.Scanner;

//Course Number class
public class CourseNumber{
    
    //main method
    public static void main(String args[]){
        
        //initialize scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        //varable for courseID
        int courseID = 0;
        
        //get input from user for 6 digit course code 
        System.out.print("Enter a six digit number giving the course semester: ");
        if(myScanner.hasNextInt()){ //test if input is an int
            
        courseID = myScanner.nextInt(); //assign courseID to user input
            
        }//end Scanner if
        
        //break course ID into individual digits
        //reverse order
        //10 Spring, 20 Summer 1, 30 Summer 2, 40 Fall
        int num1 = courseID % 10;
        int num2 = (courseID /10) %10;
        int num3 = (courseID /100) %10;
        int num4 = (courseID /1000) %10;
        int num5 = (courseID /10000) %10;
        int num6 = (courseID /100000) %10;
        
        //converts all integers to String for concatenation
        String num6a = Integer.toString(num6);
        String num5a = Integer.toString(num5);
        String num4a = Integer.toString(num4);
        String num3a = Integer.toString(num3);
        String num2a = Integer.toString(num2);
        String num1a = Integer.toString(num1);
        
        String year = (num6a + num5a + num4a + num3a); //concatenates "ints" into a single "number"
        String courseCode = (num2a + num1a);    //concatenates "ints" into a single "number"
        
        int yearInt = Integer.parseInt(year); //convert the String year back to int for comparison tests
        int courseCode$ = Integer.parseInt(courseCode); //conver the String courseCode back to int for comparison tests 
        
        if (( yearInt >= 1865 && yearInt <= 2014) && (num2==1 && num1==0)){ //test for in range year and only Spring semester
            
            System.out.println("The course was offered in the Spring Semester of " + num6 + num5 + num4 + num3 + '.');
            
        }//end if spring
        
        if ((yearInt >= 1865 && yearInt <= 2014) && (num2==2 && num1==0)){  //test for in range year and only Summer 1 semester
            
            System.out.println("The course was offered in the Summer 1 Semester of " + num6 + num5 + num4 + num3 + '.');
            
        }//end if summer1
        
        if ((yearInt >= 1865 && yearInt <= 2014) && (num2==3 && num1==0)){  //test for in range year and only Summer 2 semester
            
            System.out.println("The course was offered in the Summer 2 Semester of " + num6 + num5 + num4 + num3 + '.');
            
        }//end if summer2
        
        if((yearInt >= 1865 && yearInt <= 2014) && (num2==4 && num1==0)){   //test for in range year and only Fall semester
            
            System.out.println("The course was offered in the Fall Semester of " + num6 + num5 + num4 + num3 + '.');
            
        }//end if Fall
        
        if((yearInt < 1865 || yearInt > 2014)){ //tests out of range year
            
            System.out.println("The number was outside the range of [186510,201440].");

        }//end if out of range
        
        if((courseCode$ != 10 && courseCode$ != 20 && courseCode$ != 30 && courseCode$ != 40)){ //tests for code error
                
            System.out.println("" + num2 + num1 + " is not a valid Semester.");
                                
        }//end if not matching code
            
    }//end main method
    
}//end class
