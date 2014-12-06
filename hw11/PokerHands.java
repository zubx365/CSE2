//Matthew Chin
//Date: 12/5/2014
//Course Information: CSE002-110
//Homework 11, Program 1 Poker Hands Program
/*
This program simulates the evaluation of a poker hand. The user is prompted to enter their hand, create
the hand is then evaluated compared to the ranking system i.e. straight, flush, straight flush etc.

*/


//import scanner class
import java.util.Scanner;

//PokerHands class
public class PokerHands {

    //main method
    public static void main(String args[]) {

            Scanner myScanner = new Scanner(System.in); //declare, construct Scanner object

            //array holds 10 elements in order of suit, face, suit, face...
            //will it work?
            int[] hand = new int[10]; //initalizes and allocates memory for an array called hand, holds 5 cards

            char answer = 'y'; //char var to hold control value for while loop
            char suitC = ' '; //char var to hold value for user entered suit value
            char faceC = ' '; //char var to hold value for user entered face value
            String suit = " "; //string var to hold value for user entered suit value
            String face = " "; //string var to hold value for user entered face value
            
            
            
            while (answer == 'y') { //while loop to keep block running until the for loop is completed through and hand array is filled

                for (int i = 0; i < 5; i++) { //for loop to loop through prompts and take user input for 5 cards

            
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //prompts user to enter the suit of the card
            
                    suit = myScanner.next(); //passes char entered into suit var
                    suitC = suit.charAt(0); //takes the char from the string entered, so it can be passed to the array and cast
                    //if to check if the suit entered is NOT one of the valid inputs, informs user
                    //informs user and sets answer to y to repeat loop

                    if (myScanner.next().charAt(0) != 'c' && myScanner.next().charAt(0) != 'd' && myScanner.next().charAt(0) != 'h' && myScanner.next().charAt(0) != 's') {
                        System.out.println("That is an invalid response");
                        answer = 'n'; //continues while
                        break;
                    } //end if

                    else { //if the above passes, passes the suit into the proper element in the array 
                        hand[i] = suitC; //this should work, despite being a char entered will implicitly cast into an int for array?? maybe??
                        System.out.println("Enter another hand?");
                        answer = myScanner.next().charAt(0);
                        if (answer == 'y') {

                            continue;

                            //answer = 'y'; //continues while


                        } //end if
                    } //end else
                    break;//breaks out of the for loop to continue to next iteration for faces
                } //end for loop

                for (int i = 1; i < 9; i += 2) {
                    //prompts user for face of the card ace, king, queen...etc.
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
                    face = myScanner.next(); //passes value entered to face var
                    faceC = face.charAt(0); //although face is a string, takes the char at 0th position, only char and will cast when passed
                    //to the array?
                    myScanner.next(); //clears input buffer i think

                    //if checks that the input matches the correct faces that are possible        
                    if (myScanner.next().charAt(0) != 'a' && myScanner.next().charAt(0) != 'k' && myScanner.next().charAt(0) != 'q' && myScanner.next().charAt(0) != 'j' && myScanner.next() != "10" &&
                        myScanner.next().charAt(0) != '9' && myScanner.next().charAt(0) != '8' && myScanner.next().charAt(0) != '7' && myScanner.next().charAt(0) != '6' &&
                        myScanner.next().charAt(0) != '5' && myScanner.next().charAt(0) != '4' && myScanner.next().charAt(0) != '3' && myScanner.next().charAt(0) != '2') {

                        //output if invalid input is entered
                        System.out.println("That is an invalid response");
                        answer = 'y'; //continues while loop
                    } //end if
                    else { //else if the input is valid, 
                        hand[i + 1] = faceC; //next index in hand[] array will take on the face of the card
                        System.out.println("Continue? enter y to continue");
                        answer = myScanner.next().charAt(0);
                        if (answer == 'y') {

                            continue;

                            //answer = 'y'; //continues while
                        } //end if
                        //maintaining {suit, face, suit, face,...,etc.}

                    } //end else
                    if (i == 9) { //end of for loop, breaks out of for loop
                        break;
                    } //end if

            } //end for

        } //end while loop

    showOneHand(hand);  //displays the array hand 

} //end main

//showOneHand method
//this method handles the formatting output for displaying the hand
//suit is held in an array, face is held in an array
//***
public static void showOneHand(int hand[]) {
        String suit[] = { //array to store strings for the suits of cards
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = { //array to hold the face value of the card
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = ""; //string out variable to hold eventual output
        for (int s = 0; s < 4; s++) { //this for loop loops through the 
            out += suit[s]; //each suit is passed to output to be displayed suit[0] = "clubs" etc.
            for (int rank = 0; rank < 13; rank++) //for loop to iterate over the 13 ranks of cards, faces, Ace king...etc.    
                for (int card = 0; card < 5; card++) //loops through the 5 cards in hand[]
                    if (hand[card] / 13 == s && hand[card] % 13 == rank) //if statement matches the card in the hand to the possible suit and face,
                        out += face[rank]; //then passes the result to out for display
            out += '\n'; //display each suit and card on a new line
        }
        System.out.println(out); //print output
    } //end showOneHand method



//rank method, evaluates the hand[] and evaluates the elements to see if it is a 
//royal flush(in order and same suit a, k, q, j, 10*)...straight flush(all suit match and some order)...
//four of a kind(6,6,6,6,3)...full house(6,6,6,3,3)...flush(all same suit)...straight(1,2,3,4,5)
//...two pairs(5,5,3,3,2)...one pair(2,2,3,4,5), high card(no matches in face or suit)

public static String rank(int hand[]) {

        String ranking = " "; //string to store the ranking that is returned after evaluated

        //royal flush check

        //straight fluch check

        //four of a kind check

        //full house check

        //flush check

        //straight check

        //two pairs check

        //one pair check

        //no match check

        if (hand[0] != hand[2] && hand[4] != hand[6] && hand[8] != hand[10] && hand[2] != hand[8] && hand[2] != hand[10]) { //checks to see if all suits are mismatching
            if (hand[1] != hand[3] && hand[5] != hand[7] && hand[7] != hand[9]) {   //checks to see if the faces are mismatching

                ranking = " High Card"; //returns high card if above are true

            } //end inner if
        } //end if

        return ranking;
    } //end rank method

} //end poker hands class