///////////////////////////////////////////////////////////////
//Christopher Mueller
//
//CSE 2
//
//Lab 11 - Arrays


//Import the scanner
import java.util.Scanner;

//Define the class
public class Arrays {
    
    //Create a main method
    public static void main(String[] args) {
    
    //declare the scanner
    Scanner myScanner;
    
    //int for list length
    final int numList=10;
    
    //declare the array
    int[] array1=new int[numList];
    
    //loop for finding all of the ints 
    for(int i=0; i<numList; i++){
    
        //Construct the scanner
        myScanner = new Scanner( System.in );
    
        //prompt the user for a new int
        System.out.print("Enter an int into the array-");
        
        //Arrange where the int will be placed in the set
        array1[i] = myScanner.hasNextInt();
        
        //Print a line so the terminal stay clean
        System.out.println();
        
        
    }
    
    
        
    
    }
}