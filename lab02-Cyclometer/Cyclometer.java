//Matthew Chin
//Date:9/5/2014
//Course Information: CSE002-110
//Cyclometer Program

/*
My bicycle cyclometer (meant to measure speed, distance, etc.)
records two kinds of data, the time elapsed in seconds, and the number of rotations
of the front wheel during that time. For two trips, given time and rotation count, your
program should...

print the number of minutes for each trip
print the number of counts for each trip
print the distance of each trip in miles
print the distance for the two trips combined.

*/

//Cyclometer Class
public class Cyclometer{
    
    //main method
    public static void main(String args[]){
        
        //Input Data
        int secsTrip1=480; //Trip 1 time of 480 seconds
        int secsTrip2=3220; //Trip 2 time of 3220 seconds
        int countsTrip1=1561; //Trip 1 front wheel rotations of 1561 times
        int countsTrip2=9037; //Trip 2 front wheel rotations of 9037 times
        
        // Intermediate Variables and Output Data.
        
        double wheelDiameter=27.0; // wheel diameter 
        double PI = 3.14159; // value of PI 
        double feetPerMile=5280; // 5280 feet in 1 mile 
        double inchesPerFoot=12; // 12 inches in 1 foot 
        double secondsPerMinute=60.0; // 60 seconds in 1 minute 
        double distanceTrip1, distanceTrip2, totalDistance=0; // variables for distance of trip1, trip2 and total
        
            // Prints out time for Trip 1 in minutes and number of wheel rotations.
            System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + 
            countsTrip1 + " counts.");
            // Prints out time for Trip 2 in minutes and number of wheel rotations.
            System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " +
            countsTrip2 + " counts.");
            
            //calculates the distance traveled in Trip 1
            distanceTrip1=(countsTrip1*wheelDiameter*PI);
            //Above gives distance  in inches
            //For each count, a rotaion of the wheel travels
            //the diameter in inches multiplied by PI
            distanceTrip1/=(inchesPerFoot*feetPerMile); // Gives distance in miles
            //calcualtes the distance traveled in Trip 2
            distanceTrip2=(countsTrip2*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
            //Calculates total distance for Trip 1 + Trip 2
            totalDistance= distanceTrip1+distanceTrip2;
            
            //Print out the output data.
            
            //Distance of Trip 1
            System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
            //Distance of Trip 2
            System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
            //Total Distance for Trip 1 and Trip 2
            System.out.println("The total distance was " + totalDistance + " miles.");
        
    }//end of main method
}//end of Cyclometer Class