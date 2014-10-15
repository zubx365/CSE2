/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
      
    //global declaration of n
    int n =0;
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      System.out.println("You entered an invalid input (not int)...");
      return;
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *  a compiler error occurs because
 *   n was not properly initalized at line 22
 *   the original declaration and initialization of n happened within if statement scope
 *   to fix this, I declared n with global scope, and also 
 *  fixed the logic error by changing the else statement to produce an error if the user does NOT enter an integer
 * prior it would print out 4 if the user enetered anything but an int
 * line 25, n was already initialized and declared earlier in the program
 *line 30 is a logic error expected output is Again,....., but instead it said To repeat.....
 */
