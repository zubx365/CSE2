//impot Scanner class
import java.util.Scanner;

//LoopTheLoop class
public class LoopTheLoop{
    
    //main method
    public static void main(String args[]){
    
    //create scanner object
    Scanner scan = new Scanner(System.in);
    
   
    
    int starsIn=0;
    
    String choice = "0";
    
    while(choice.equals("0")){
        
    System.out.println("How many stars do you want?:");    
    
    if(scan.hasNextInt()){
        
    starsIn = scan.nextInt();
    
    if(starsIn <= 15 && starsIn >= 1){
    for(int rowNum = 1; rowNum <=starsIn; rowNum++){
        System.out.print("*");
    }
    
    System.out.println();
    
    //declare int var to control number of stars
    for (int rowNum=1; rowNum<= starsIn; rowNum++){
            for (int nStars = 1; nStars<= rowNum; nStars++){
                
            System.out.print("*");
            
        }//end for
    
    System.out.println();
    
    }//end for
    
    }//end if
    else{
        System.out.println("Input out of range (1-15)");
    }
    }//end if2
    else{
        System.out.println("error");
    }
    
    System.out.println("Enter a -1 to exit or anyother character to continue.");
    choice = scan.next();
    
    if(choice.equals("-1")){
    break;
    }
    choice = "0";
    continue;
    }//end while
    }//end main
    
}//end class