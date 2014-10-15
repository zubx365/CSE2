/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    
    //double percent;
    double x = 0;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    //double x=((new Scanner(System.in)).nextDouble());
    
   Scanner scan = new Scanner(System.in);
   
   if(scan.hasNextDouble()){
   
   x = scan.nextDouble();
   
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   
   x = 1-x/100;
   x=(double)Math.round(x*100)/100;
   System.out.println(x);
       
   
   if(x==0.93){  //when the user enters 7
      System.out.println("The proportion remaining is " + "0.93");
   }
   
    else if(1-x/100==0.59){ //when the user enters 41
      System.out.println("The proportion remaining is " + "0.59");
    }
    
    else if(1-x/100==0.86){ //when the user enters 14
    System.out.println(1-x/100);
      System.out.println("The proportion remaining is " + "0.86");
    }
    
    else if(1-x/100==0.67){ //when the user enters 33
      System.out.println("The proportion remaining is " + "0.67");
    }
    
    else if(1-x/100==0.4){ //when the user enters 60
      System.out.println("The proportion remaining is " + "0.40");
    }
    
   }
   else if(x < 0 || x > 99){
     System.out.println("Out of range");
   }
   else{
     System.out.println("You did not enter an integer...");
   }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * the original program does not take into account if a user enters a character, string, or pos/neg integer
 * there is a rounding error in the calculation and must be handled with Math.round to ensure it is to 2 decimal places,
 * otherwise it will not evaluate to true for the if statements
 * the if statements only handle a handful of values between 0-99, not all of the values. 
 * original utilized x as the Scanner variable and double changed to this to avoid compiler error dereferncing x
 * included method of handling if input is out of 0-99 range
 * included else statement to handle any input that is not an int
 * included curly braces for if statements to avaoid confusion and have better organization
 */
