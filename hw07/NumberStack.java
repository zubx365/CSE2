//import Scanner class
import java.util.Scanner;

//Number Stack class
public class NumberStack{
    
    //main method
    public static void main(String args[]){
        
        //Scanner constructor
        Scanner myScanner = new Scanner(System.in);
        
        //get input from user if next input is an int
        System.out.print("Please enter a number between 1 and 9: ");
        int input = 0;
        int rowNum = 0;
        int numPattern = 0;
        int dashPattern = 0;
        //checks if next input is an int
        if(myScanner.hasNextInt()){
    
            //assign input to the user input value
            input = myScanner.nextInt();
            
            if(input >= 1 && input <= 9){
                
            for(rowNum = 1 ; rowNum <= input; rowNum++){
                
                for(numPattern = 1; numPattern <= rowNum; numPattern++){
                    
                    System.out.print(numPattern);
                
                    for(dashPattern = 1; dashPattern <= rowNum; dashPattern++){
                    
                    //System.out.print('-');    
                    
                    }//end middle loop
                    
                }//end inner loop
            System.out.println();    

            }//endouterloop
            
            
            }//end if
            
            else{
                System.out.println("Error!!");
            }//end else
            
        }//end if
        
        else if(!myScanner.hasNextInt()){
                System.out.println("Invalid input!!");
                return;
        
        }//end else if
    }//end main
}//end class