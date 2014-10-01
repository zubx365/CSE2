//Matthew Chin
//Date: 9/30/2014
//Course Information: CSE002-110
//Homework 05 Boolean Program

/*
This program  has three boolean variables to each of which the value of true or false is randomly assigned. 
Then, at random, combine the three variables with random choices of && 
and || and stores the result. For example, one might have the expression true && false || true 
(there are 32 possible expressions, so I will not list all the possibilities). 
The program should then present the expression to the user and ask the user to state the result of of the expression.
*/

//import Scanner class
import java.util.Scanner;

//import Math class
import java.lang.Math;

//BoolaBoola class
public class BoolaBoola{
    
    //main method
    public static void main(String args[]){
        
        //new instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner(System.in);
        
        //3 boolean variables to have randomized results
        boolean a = true;
        boolean b = true;
        boolean c = true;
        
        //4th boolean will be a combination of the results from Math.random() resulting in another boolean value,
        //this result will be asked of the user
        boolean d = true;
        
        
        //get random results for true and false using Math.random to either get 0 = True, or 1= false then assign the results to the 3 boolean vars a, b, c
        //gets random results for && or || using Math.random for comparison of the random values assigned from first 3 runs of Math.random 
        //0 is || and 1 is &&
        int result = (int)(Math.random()*2);
        int result2 = (int)(Math.random()*2);
        int result3 = (int)(Math.random()*2);
        int result4 = (int)(Math.random()*2);
        int result5 = (int)(Math.random()*2);
        
        if(result == 0){    //if result is 0 set boolean a to 'true'
            a = true;
        }//end boolean a if a is true
        
        else if(result == 1){ //else if result is 1 set boolean a to 'false'
            a = false;
        }//end boolean else if a is false
        
        
        
        if(result2 == 0){    //if result2 is 0 set boolean b to 'true'
            b = true;
        }//end boolean b if b is true
        
        else if(result2 == 1){ //else if result2 is 1 set boolean b to 'false'
            b = false;
        }//end boolean else if b is false
        
        
        
        if(result3 == 0){    //if result3 is 0 set boolean c to 'true'
            c = true;
        }//end boolean c if c is true
        
        else if(result3 == 1){ //else if result3 is 1 set boolean c to 'false'
            c = false;
        }//end boolean else if c is false
        
        //these if statements alter the expression of d = (a ||/&& b ||/&&  c) depending on the value of
        //result4 and result5
        if(result4 == 0 && result5 == 0){   //if statement to check what the value of result4 and 5 are corresponding to whether the comparison
                                            //operators will be || for 0 or && for 1
            d = (a  ||  b  ||  c);
            //output question in format (a + result4 + b + result5 + c) where result4 and result5 is either || or &&
            System.out.println("Does " + a + " " + "||" +  " " + b + " " + "||" + " " + c + ": have the value of True(T/t) or False(F/f)?");
        }//end if result4 == 0 && result5 == 0
        
        if(result4 == 0 && result5 == 1){   //if statement to check what the value of result4 and 5 are corresponding to whether the comparison
                                            //operators will be || for 0 or && for 1
            d = (a || b && c);
            //output question in format (a + result4 + b + result5 + c) where result4 and result5 is either || or &&
            System.out.println("Does " + a + " " + "||" +  " " + b + " " + "&&" + " " + c + ": have the value of True(T/t) or False(F/f)?");
        }//end if result4 == 0 && result 5 == 1
        
        if(result4 == 1 && result5 == 0){   //if statement to check what the value of result4 and 5 are corresponding to whether the comparison
                                            //operators will be || for 0 or && for 1
            d = (a && b || c);
            //output question in format (a + result4 + b + result5 + c) where result4 and result5 is either || or &&
            System.out.println("Does " + a + " " + "&&" +  " " + b + " " + "||" + " " + c + ": have the value of True(T/t) or False(F/f)?");
        }//end if result4 == 1 && result5 == 0
        
        if(result4 == 1 && result5 == 1){   //if statement to check what the value of result4 and 5 are corresponding to whether the comparison
                                            //operators will be || for 0 or && for 1
            d = (a && b && c);
            //output question in format (a + result4 + b + result5 + c) where result4 and result5 is either || or &&
            System.out.println("Does " + a + " " + "&&" +  " " + b + " " + "&&" + " " + c + ": have the value of True(T/t) or False(F/f)?");
        }//end if result 4 == 1 && result5 == 1
        
        if(myScanner.hasNext()){    //checks if Scanner input is a String
        
        String answer = myScanner.next();   //creates var answer of String as the next input for myScanner
          
          //checks the value of true and compares what he user answers with that to determine if they chose correctly
          //if not, output is Wrong. Try Again.
          //if correct output is Correct.
          //if none of the options match input, output is still Wrong. Try Again.
          if(d==true){
            if(answer.toUpperCase().equals("T")){
                System.out.println("Correct!");
                return;
            }//end if answer is T/t for true
            
            else{   //occurs if the user enters the wrong answer
                System.out.println("Wrong. Try Again.");
                return;
            }//end else if the answer is wrong outputs Wrong Try again
            
          }//end if answer is actually True
          
          if(d==false){
              if(answer.toUpperCase().equals("F")){
                  System.out.println("Correct!");
                  return;
            }//end if answer is F/f for false
            
            else{   //occurs if the user enters the wrong answer
                System.out.println("Wrong. Try Again.");
                return;
            }//end else if the answer is wrong outputs Wrong try again
            
          }//end if answer is actually False
         
        }//end checker if
        
    }//end main method
    
}//end class