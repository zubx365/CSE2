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
            
            if(input >= 1 && input <= 9){ //checks if the input is within [1,9] otherwise it prints out an error message
                
        System.out.println();
        System.out.println("Using For Loops.");
        System.out.println();
        
        //for(int group = 1; group <= input; group++){ //splits the output into groups of stacks        
              
            for(rowNum = 1 ; rowNum <= input; rowNum++){    //controls number of rows that is outputted per stack
                
                for(numPattern = input; numPattern > rowNum; numPattern--){ //controls the number pattern hence printing out the row number with each run
                    
                    System.out.print(" ");
                }//end inner loop   
                
                    for(int column =1; column < (2*rowNum); column++){
                    
                    System.out.print(rowNum);

                    }//end column loop
                    
                    System.out.println();

            }//endouterloop
        //}//end grouploop    
            
            }//end if
            
            else{
                System.out.println("Error!!");
            }//end else
            
        }//end if
        
        else if(!myScanner.hasNextInt()){
                System.out.println("Invalid input!!");
                return;
        
        }//end else if
    
    //while loop number stack
    
    System.out.println();
    System.out.println("Using While Loops");
    System.out.println();
    
    int whileGroup = 1;
    
    while(whileGroup <= input){
    
    int whileRowNum = 1;
    
    while(whileRowNum <= input){
        
        int whileCounter = 1;
        
        while(whileCounter <= whileRowNum){
            System.out.print(whileRowNum);  
            whileCounter++;
        }
        System.out.println();
        whileRowNum++;
        
    }//end while row
    whileGroup++;
    }//end while group
    
    
    //do while loop number stack
    
    System.out.println();
    System.out.println("Using Do While Loops");
    System.out.println();
    
    int doRow = 1;
    int doNum = 1;
    do{
        System.out.print(doNum);
        System.out.println();
        doNum++;
    }while(doNum <= doRow); //end do while
    doRow++;
    }//end main
}//end class