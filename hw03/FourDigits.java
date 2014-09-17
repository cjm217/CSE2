//////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//Four Digits Program
//


//Import the scanner
import java.util.Scanner;

//Define the class
public class FourDigits {

    //Begin the main string    
    public static void main(String [] args){
        
        //Declare the scanner    
        Scanner myScanner;
    
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Print what the user will see
        System.out.print("Enter a value (Make sure it is > 0): ");
        
        //Create a variable
        String startNumber = myScanner.nextLine();
        
        //Create a new scanner
        Scanner myScanner2= new Scanner(startNumber);
        
        //Look for a decimal point
        myScanner2.useDelimiter("\\.");
        
        //Move to the next scanner
        myScanner2.next();
        
        //Create the number that will be printed
        String endNumber = myScanner2.next();
        
        //Print out result
        System.out.println("The first four digits after the decimal are " + endNumber.substring(0,4));
    }
}    
        
        
        
        
        
        
       
        
        