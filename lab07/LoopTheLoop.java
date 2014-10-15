//impot Scanner class
import java.util.Scanner;

//LoopTheLoop class
public class LoopTheLoop{
    
    //main method
    public static void main(String args[]){
    
    //create scanner object
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many stars do you want?:");
    int starsIn=0;
    if(scan.hasNextInt()){
    starsIn = scan.nextInt();
    //declare int var to control number of stars
    for (int rowNum=1; rowNum<= starsIn; rowNum++){
            for (int nStars = 1; starsIn<= rowNum; starsIn++){
            System.out.print("*");
        }//end while
    System.out.println();
    }//end while1 
    }//end if
    else{
        System.out.println("error");
    }
    System.out.println(starsIn);
    }//end main
    
}//end class