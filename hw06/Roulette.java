//Matthew Chin
//Date: 10/14/2014
//Course Information: CSE002-110
//Homework 06 Roulette Program
/*
This program carrise out a Monte Carlo simluation for a series of roulette spins.
The user picks a random number to place a bet on for 100 spins. This is repeated 1000 times. 
3 or more wins results in a profit.
The program counts the number of times I lose everything, total winnings across all spins, 
and number of times I walked away with a profit in one session of 100 spins. 
*/
//Roulette Class
public class Roulette{
    
    //main method
    public static void main(String args[]){
        
        //variables
        int winCount = 0; //counter for number of times won
        int lossAll = 0; //variabel to count how many times you lose everything (number never comes up)
        int winnings = 0;
        int totalWinnings = 0; //varible to track total of all winnings across all spins
        int numProfit = 0; //variable to track number of times you walk away with a profit (win 3 or more times) 
        int myNum = 0; //(int)(Math.random()*37) + 1; //gets a random number for your bet to compare to what the roulette spins (rouletteNum).
        int rouletteNum = 0; //(int)(Math.random()*37) + 1; // gets a random number from 1-38 for roulette spin result 
                                                 // will use special ifs for 0 and 00
                                                 
        //for loop nested in a for loop for first 1000 iterations of 100 spins
        for(int k = 0; k <=999; k++){   //outer loop to iterate the 100 spins 1000 times
            
        for(int i = 0; i <= 100; i++){  //inner loop to iterate the spin 100 times
            
            myNum = (int)(Math.random()*39);    // sets myNum to some random integer between 0-38
            rouletteNum = (int)(Math.random()*38);  //sets roulette num to some random integer between 0-38 
            
            if(myNum == rouletteNum){   //checks to see if the random int assigned as the bet matche the random int assigned to the number spun
                winCount++;             //increments the counter for number of times you have won, myNum matches rouletteNum
            }//end if
        }//end for1
    }//end for2
    
        //calculations and output section:
        
        winnings = (winCount * 36); //calculates total winnings based on fact that getting a single number yields $36 multiplied by the winCount(times won)
        lossAll = (100000-winCount); // calculates the total amount of times your number did not match out of 100,000 total spins
        
        //calculates the number of times you walked away with a profit after 100 spins which is >= 3
        numProfit = ((winCount / 3)/100);
        
        if(numProfit >= 3){ //hecks if numProfit is greater than or equal to 3 and out how many times you walked away with a profit in 100 spins
            System.out.println("Number of times making a profit(won 3 or more times): " + numProfit + '.'); //otuputs the number of times you walked away with profit
        }//end if
        
        //outputs the rest of the data: number of times you won, total winnings you earned over all the spins, and number of times your number did not match the 
        //roulette number.
        System.out.println("Number of times won: " + winCount + "\n" + "Total Winnings: $" + winnings + "\n" + "Number of times losing everything: " + lossAll);
        
    }//end main
}//end class