//Matthew Chin
//Date: 9/9/2014
//Course Information: CSE002-110
//Homework Assignment 2 Arithmetic Program

/*
This program takes the number of items bought at a Walmart
in PA and calculates the...
Total Cost of each kind of item and sales tax for each respective cost
Total cost of purchases before tax
Total actually paid for the transaction including sales tax
*/

//Arithmetic Class
public class Arithmetic{
    
    //main method
    public static void main(String args[]){
        
        //Input Variables
        
        //number of socks purchased
        int nSocks=3; 
        //Cost per pair of socks
        //$ is part of the variable name
        double socksCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double drinkingGlassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //PA tax percent
        double taxPercent=0.06;
        
        //Calculations
        
        //total socks cost
        double totalSocksCost$= (nSocks * socksCost$);
        //sales tax on socks cost
        double socksTax= (totalSocksCost$ * taxPercent);
        
        //total drinking glasses cost
        double totalDrinkingGlassesCost$= (nGlasses * drinkingGlassCost$);
        //sales tax on drinking glasses cost
        double drinkingGlassTax= (totalDrinkingGlassesCost$ * taxPercent);
        
        //total box of envelopes cost
        double totalEnvelopesCost$= (nEnvelopes * envelopeCost$);
        //sales tax on envelope cost
        double envelopeTax= (totalEnvelopesCost$ * taxPercent);
        
        //total cost of purchases
        double totalCostNoTax= (totalSocksCost$ + totalEnvelopesCost$ + totalDrinkingGlassesCost$);
        
        //total Sales tax
        double totalSalesTax= (socksTax + drinkingGlassTax + envelopeTax);
        
        //total actually paid with tax
        double totalCostWithTax= (totalCostNoTax + totalSalesTax);
        
            //Output Data
            System.out.println("You have purchased the following items: ");
            
            
            //Socks Purchase Output
            System.out.println("\n" + nSocks + " pairs of socks purchased at $" + socksCost$ + " per pair." +
            "\nThis comes to the total of: $" + ((int)(totalSocksCost$*100)/100.0));
            System.out.println("Sales tax for " + nSocks + " socks purchase is: $" + ((int)(socksTax*100)/100.0));
            
            //Drinking Glasses purchase output
            System.out.println("\n" + nGlasses + " drinking glasses purchased at $" + drinkingGlassCost$ + " per glass." +
            "\nThis comes to the total of: $" + ((int)(totalDrinkingGlassesCost$*100)/100.0));
            System.out.println("Sales tax for " + nGlasses + " drinking glasses is: $" + ((int)(drinkingGlassTax*100)/100.0));
            
            //Box of Envelopes purchase output
            System.out.println("\n" + nEnvelopes + " box(es) of envelopes purchased at $" + envelopeCost$ + " per box." +
            "\nThis comes to the total of: $" + ((int)(totalEnvelopesCost$*100)/100.0));
            System.out.println("Sales tax for " + nEnvelopes + " box of envelopes is: $" + ((int)(envelopeTax*100)/100.0));
            
            //total before Tax output
            System.out.println("\nYour total before tax is: $" + ((int)(totalCostNoTax*100)/100.0 + "."));
            
            //total tax output
            System.out.println("\nYour total tax is: $" + ((int)(totalSalesTax*100)/100.0 + "."));
            
            //total purchase with tax output
            System.out.println("\nYour total cost with tax is: $" + ((int)(totalCostWithTax*100)/100.0 + "."));
            
            //goodbye
            System.out.println("\nThank you for shopping at Walmart.");
            
    }//end main method
    
}//end of Class
