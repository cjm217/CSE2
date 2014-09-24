///////////////////////////////////////////////////////////////////////
//Chris Mueller
//CSE 002
//Month Program
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class CourseNumber {
    
    //Create a main method
    public static void main(String[] args) {
        
    //Declare the Scanner
    Scanner myScanner;
    
    //Declare another Scanner
    
    //Construct the scanner
    myScanner = new Scanner( System.in ); 
    
    //Prompt the user for a number
    System.out.print("Enter a six digit course number giving the course semester-");
    
    //Check the integer for validity
    if (myScanner.hasNextInt())
    {
        
        //Create an int for the month
        int nCourse = myScanner.nextInt();
    
        if(nCourse>=186510&&NCourse=<201440)
        {
            
            
            
            
        }
        
        else
        {
            
            //Print an error message
            System.out.println("You did not enter an integer within the range [186510-201440]");
            
        }
    }
    
    }
}    