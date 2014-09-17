/////////////////////////////////////////////////
//Chris Mueller
//Bicycle program
//Version 1.0
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class Bicycle {

    //Begin the main string    
    public static void main(String [] args){
    
        //Input unit conversions
        double wheelDiameter=27.0, //wheel size
        PI=3.14159, //define pi
        feetPerMile=5280, //unit conversions of feet to miles
        inchesPerFoot=12, //unit conversions of inches to feet
        secondsPerMinute=60, //unit conversions seconds to minutes
        minutesPerHour=60; //unit conversion minutes to hours
        
        //Declare the scanner    
        Scanner myScanner;
    
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Print what the user will see
        System.out.print("Enter the number of Seconds(an integer > 0): ");
    
        //Accept the user input
        int nSeconds = myScanner.nextInt();
        
        //Print what the user will see
        System.out.print("Enter the number of Counts(an integer > 0): ");
    
        //Accept the user input
        int nCounts = myScanner.nextInt();
        
        //Create variables for the printed values
        double distanceTrip, tripTime, speedAverage; 
        
        //Calculate the trip distance
        distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        
        //Calculate the time
        tripTime=nSeconds/secondsPerMinute;
        
        //Calculate the Avg. speed
        speedAverage=distanceTrip/(tripTime/minutesPerHour);
        
        //Print out the distance
        System.out.printf("The distance was %4.2f miles and took %4.2f minutes.", distanceTrip, tripTime);
        
        //Print on a new line
        System.out.printf("%n");
        
        //Print out the Avg. speed
        System.out.printf("The Average mph was %4.2f", speedAverage);
        
        //Keep the terminal looking cleaner
        System.out.println();
    }    
}   
        
        
        