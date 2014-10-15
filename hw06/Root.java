////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//
//Roulette Program

//Import the scanner
import java.util.Scanner;


//Define the class
public class Root {

    //Create a main method
    public static void main(String [] args){
        
        //Declare the scanner
        Scanner myScanner;
        
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Prompt the user for a double > 0
        System.out.print("Enter a double > 0:");
        
        //Accept the double
        double original = myScanner.nextdouble();
    
        //Check to see if the double is greater than 0
        if(original<=0){
            
            //Print error
            System.out.println("You did not enter a valid double > 0");
            
            }
        
        //If double works, do this
        else{
            
            
            //Define the high end of the range
            double high = 1 + original;
            
            //Define the low end of the range
            double low = 0;
            
            //construct while loop
            while(high-low>.0000001*high){
                
                //Define the middle of the range
                double middle = ((high-low)/2);
                
                //Update bounds based on this
                if((middle^2) > original){
                    
                    //Change high to match the new bounds
                    double high = middle^2;
                    
                    }
                
                //Update bounds based on the value of middle squared
                else if((middle^2) < original){
                    
                    //Change low to match new bounds
                    double low = middle^2;
                    
                    }    
                }
            
            //Print out the results
            System.out.println("The square root of "+original+"is "+high);
            
            
            
        }
    
    
    
        
    }
}    