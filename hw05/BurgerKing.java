//Matthew Chin
//Date: 9/30/2014
//Course Information: CSE002-110
//Homework 05 Burger King Program

/*
This program  prompts the user
to enter a choice of a burger, a soda, or fries. 
Then the program prompts the users for
details of their choices. 
*/

//import Scanner class
import java.util.Scanner;

//Burger King class
public class BurgerKing{
    
    //main method
    public static void main(String args[]){
        //new instance of Scanner object
        Scanner myScanner;
        
        //Scanner constructor
        myScanner = new Scanner(System.in);
        
        //ask input for burgers, soda or fries
        System.out.println("Enter a letter to indicate a choice of " + 
        "\nBurger (B or b)" + "\n" +
        "Soda (S or s)"  + "\n" + 
        "Fries (F or f): ");
        
        if(myScanner.hasNext()){ //check input is string
            
            String choice = myScanner.next();   //create choice var of type String to be taken in by myScanner for next option
            
        
        if(choice.toUpperCase().equals("B")){   //checks choice inut is B for burger
            
            System.out.println("Enter A for \"for all the fixins\".\n" +    //if it is B for burger gives option for toppings
            "C or c for cheese\n" +                     //options are A for all the fixins, C for cheese, N for none of the above
            "N or n for none of the above c: ");
            
            if(myScanner.hasNext()){    //checks input for topping choice to ensure it is a String
                
            String toppings = myScanner.next(); //creates toppings var of type String to be taken in by myScanner for next option
            
            //checks for multiple entry of similar characters matching the first letter options of the switch
            //e.g AA so it does not read the A and interpret it as "all the fixins" /"SS for a spirte"/ "LL for large fries" good up to 3 chars repeated
            if(toppings.toUpperCase().equals("AAA") || toppings.toUpperCase().equals("CCC") || toppings.toUpperCase().equals("NNN") || 
            toppings.toUpperCase().equals("AA") || toppings.toUpperCase().equals("CC") || toppings.toUpperCase().equals("NN")){
                
                System.out.println("A single character expected...");   //error message output
                return;
                
            }//end double character input if
            
                switch(toppings.toUpperCase().charAt(0)){   //switch statement allowing for choice of toppings C(cheese), A(all the fixins), N(no toppings)
                        
                    case 'C':{  //case burger with cheese
                        
                        System.out.println("Your ordered a burger with cheese.");
                        break;
                        
                    }//end case Cheese
                    
                    case 'A':{  //case burger with all the fixins
                        
                        System.out.println("You ordered a burger with \"all the fixins\".");
                        break;
                    
                    }//end case all the fixins
                    
                    case 'N':{  //case burger with no toppings
                        
                        System.out.println("Your ordered a burger with NO toppings.");
                        break;
                        
                    }//end no topping case
                    
                    default:    //default output if all above fails
                        System.out.println("You did not enter a valid option (A,a C,c or N,n).");
                        break;
                        
                }//end topping switch
                
                if(toppings.length() > 1){
                    
                System.out.println("A single character expected...");
                return;
                
                }//end if choice input length is greater than 1 within Burger option nest
           
            }//end toppings if
    
         }//end burger if
         
        else if(choice.toUpperCase().equals("S")){  //else if initial choice is S or s for soda
            
            System.out.println("Do you want \nPepsi (P or p), \n" + //asks for choice of soda to choose, pepsi, coke, sprite, or mountain dew
            "Coke (C or c), \n" +
            "Sprite (S or s), \n" +
            "or Mountain Dew (M or m).");
            
            if(myScanner.hasNext()){    //checks input is a string
            
            String drink = myScanner.next();    //creates drink variable of type String and passed to myScanner
            
            //checks for multiple entry of similar characters matching the first letter options of the switch
            //e.g AA so it does not read the A and interpret it as "all the fixins"/ "SS for sprite"/ ""LL for large fries" good up to 3 chars repeated
            if(drink.toUpperCase().equals("PPP") || drink.toUpperCase().equals("CCC") || drink.toUpperCase().equals("SSS") || drink.toUpperCase().equals("MMM") ||
            drink.toUpperCase().equals("PP") || drink.toUpperCase().equals("CC") || drink.toUpperCase().equals("SS") || drink.toUpperCase().equals("MM")){
                
                System.out.println("A single character expected...");   //output error message
                return;
                
            }//end double character input if
                
                switch(drink.toUpperCase().charAt(0)){  //switch for cases of different drinks Pepsi, Coke, Sprite, or Mountain Dew, or default is an error 
                    
                    case 'P':{  //case drink choice is a pepsi
                        
                        System.out.println("You ordered a Pepsi.");
                        break;
                        
                    }//end pepsi case
                    
                    case 'C':{  //case drink choice is coke
                        
                        System.out.println("You ordered a Coke.");
                        break;
                        
                    }//end coke case
                    
                    case 'S':{  //choice drink choice is sprite
                        
                        System.out.println("You ordered a Sprite.");
                        break;
                        
                    }//end sprite case
                    
                    case 'M':{  //choice drink choice is mountain dew
                        
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                        
                    }//end mountain dew case
                    
                    default:    //default if input does not match any of the above, print error message 
                    
                        System.out.println("You did not enter a valid option (P,p C,c S,s M,m).");  //output error message 
                        break;
                        
                }//end drink switch
                
                if(drink.length() > 1){ //checks regular input not including double input, that is handled by first if statement
                    
                System.out.println("A single character expected...");
                return;
            
                }//end if choice input length is greater than 1 within drink if nest   
           
            }//end drink check if
    
        }//end drink if 
        
        else if(choice.toUpperCase().equals("F")){  //if nest if input is an F or f for an order of fries
            
            System.out.println("Do you want a large or small order of fries (L,l S,s)?");   //asks user if they want a Large or Small fries
            
            if(myScanner.hasNext()){    //checks input is a String
            
            String fries = myScanner.next();    //creates var fries of type String passed to myScanner
            
            //checks for multiple entry of similar characters matching the first letter options of the switch
            //e.g AA so it does not read the A and interpret it as "all the fixins"/ "SS for a spirte"/ "LL for large fries" good up to 3 chars repeated
            if(fries.toUpperCase().equals("LLL") || fries.toUpperCase().equals("SSS") || 
            fries.toUpperCase().equals("LL") || fries.toUpperCase().equals("SS")){
                
                System.out.println("A single character expected...");
                return;
                
            }//end double character input if
            
                switch(fries.toUpperCase().charAt(0)){  //switch statement to check cases of input L, l, S, or s for order of fries
                
                    case 'L':{  //Large fries order case
                        
                        System.out.println("You ordered a large fries.");
                        break;
                        
                    }//end case Large fries
                    
                    case 'S':{  //case small fries order case 
                        
                        System.out.println("You ordered a small fries.");
                        break;
                        
                    }//end case small fries
                    
                    default:    //default output if input does not match the above, does not include double char input, that is handled by the first if statement
                        System.out.println("You did not enter a valid option (L,l or S,s).");
                        break;
                }//end fries switch
               
                if(fries.length() > 1){  //checks regular input not accounting for double char input, that is handled by first if statement
               
                System.out.println("A single character expected...");
                return;
                
                }//end if choice input length is greater than 1 within choice if nest       
            
            }//end fries check if
                
        }//end fries if
        
        else if(choice.length() > 1){   //checks for multiple char input for initial choice burger, soda, or fries
            
            System.out.println("A single character expected...");   //output error message
            return;
            
        }//end else if check length of input
        
        else if (choice.toUpperCase() != "B" || choice.toUpperCase() != "S" || choice.toUpperCase() != "F"){    //checks if input does not equal any of the inital choices to produce error message
            
            System.out.println("You did not enter (B,b S,s or F,f).");  //output error message input does not equal choices
            return;
            
        }//end else if no matching beginning option
        
       }//end if
       
    }//end main
    
}//end class