/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
      System.out.println("1  " + n + " " + k);
          n/=3;
          k-=7;
          System.out.println("2  " + n + " " + k);
    }
    if(n*k%12< 12){
        System.out.println("3  " + n + " " + k);
      n-=20;
      out+=n;
      System.out.println("4  " + n + " " + k);
    }
    if(n*n>k){
        System.out.println("5  " + n + " " + k);
      n=42;
      out+=n+k;
      System.out.println("6  " + n + " " + k);
    }
    else {
        System.out.println("7  " + n + " " + k);
      n=45;
      out+=n+k;
      System.out.println("8  " + n + " " + k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        
        System.out.println("9  " + n + " " + k);
        break;
      case 97:
        n-=14;
        k-=2;
        
        System.out.println("10  " + n + " " + k);
        break;
      case 98:
        n/=5;
        k/=9;
        
        System.out.println("11  " + n + " " + k);
      default:
        n-=3;
        k-=5;
        System.out.println("12  " + n + " " + k);
    }
    k=k+1;
     out+=1/n + 1/k; 
     System.out.println("13  " + n + " " + k);
    System.out.println(out);
  }
}

/*
 * Error report:
 * at line 60 when the switch statement goes to the default option and subtracts 5 from k it is now 0
 * then at line 64, out cannot be calculated because 1/k here is 1/0 which causes a / by zero runtime error
 * 
 * 
 */
