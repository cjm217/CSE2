/////////////////////////////////////////////////////
//Christopher Mueller
//CSE 2
//
//Lab 7 - Loop the Loop
//

//import the scanner
import java.util.Scanner;

//Define the class
public class LooptheLoop {

    //Create a main method
    public static void main(String [] args){

    //Declare an int
    int nStars = 1;
    
    //declare an int
    int totalStars = 11;

    //Declare the int that controls the loop
    int counter = 0;
    
    while(nStars < totalStars){
    
        //construct the while loop
        while(counter < nStars){
        
            //Print out the statement
            System.out.print("*");
        
            //Add one to the counter
            counter++;
        
            }
        
        //Move to the next row
        System.out.println("");
        
        //add another star to the int
        nStars++;
        }
    
    

    }
}