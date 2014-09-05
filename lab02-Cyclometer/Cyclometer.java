/////////////////////////////////////////////////
//Chris Mueller
//Cyclometer program
//Version 1.0
//
//Define the class
public class Cyclometer {
//Begin the main string    
    public static void main(String [] args){
        //input the data for the trips
        int secsTrip1=480; //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561; //wheel rotations for trip 1
        int countsTrip2=9037; //wheel rotations for trip 2
        double wheelDiameter=27.0, //wheel size
        PI=3.14159, //define pi
        feetPerMile=5280, //unit conversions of feet to miles
        inchesPerFoot=12, //unit conversions of inches to feet
        secondsPerMinute=60; //unit conversions seconds to minutes
        double distanceTrip1, distanceTrip2, totalDistance;
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");//print the results for trip 1
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");//print the results for trip 2
        distanceTrip1=countsTrip1*wheelDiameter*PI; //calculates the distance of trip 1 by using rotation amounts times diameter times pi
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates the distance of trip 2 by using rotation amounts times diameter times pi
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //print the distance of trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //print the distance of trip 2
        System.out.println("The total distance was "+totalDistance+" miles"); //print the total distance
        
    }
}
