/////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//hw09 - Blocked Again

//import the scanner
import java.util.Scanner;

//Define the class
public class BlockedAgain{
    
    //Define the first of the methods
    public static getInt(int m){

        //Declare and construct the scanner
	    Scanner myScanner=new Scanner(System.in);
	
	    //Prompt the user for 3 ints
	    System.out.println("Enter an int between 1 and 9");
     
        //Call the checkInt method 
        checkInt();
    
        //Call the check range method
        checkRange(); 
     
        return m;
    }
    
    //Define teh checkInt method
    public static void checkInt(int m){
        
        //Begin the loop
        do{
        
            //Define what the scanner input means
            if(myScanner.hasNextInt()){
        	
        	    //get out of the while loop
        	    break;
        	
            }
        
            //Keep going through the while loop
            else{
        	
        	    //Get through the answer
        	    myScanner.next();
        
        	    //Error statement
        	    System.out.print("You did not enter an int; try again- ");
    	
            }
    	
    }
    
        //Set condition for the do while loop
        while(!myScanner.hasNextInt());
        
    }
        
    //Create the checkRange method
    public static void checkRange(int m){
    
    //Set conditions for running through the loop    
    while(m < 1 || m > 9){
        
    //Get through to the answer
    myScanner.next();
    
    //print out an error message    
    System.out.print("You did not enter an int within 1 and 9; try again- ");    
        
        
    }    
    
    //define m as the scanner choice    
    m = myScanner.hasNextInt();    
        
        
    }
    
    //create a method for building the blocks
    public static void allBlocks(int m){
        
        //call the block method
        block();
        
        //call the line method
        line();
    }
    
    public static block(){
        
        //Begin loop for the rows
        for (int i = 1; i < (m + 1); i++) {


            //Begin loop for digits
            for (int k = 0; k < i; k++) {

                //Begin space loop
                for (int w = 0; w < m - i; w++) {
                    
                    //Print space
                    System.out.print(" ");

                }
                
                //Loop for the digits
                for (int j = 1; j < (2 * i); j++) {


                    //Print the value
                    System.out.print(i);



                }
                
                //Loop for the spaces    
                for (int w = 0; w < m - i; w++) {
                    
                    //Print space
                    System.out.print(" ");

                }
                
                
                //Print line
                System.out.println();

            }
            
            //Print line
            System.out.println();


            //Print space loop
            for (int w = 0; w < m - i; w++) {
                
                
                //Print space
                System.out.print(" ");

            }
            
            
            //Print the dash loop
            for (int j = 1; j < (2 * i); j++) {
                
                //Print the dash
                System.out.print("-");


            }
            
            //Print line
            System.out.println();

            //Print the space loop
            for (int w = 0; w < m - i; w++) {
                
                
                //Print space
                System.out.print(" ");

            }
            
            //Print line
            System.out.println();
            


        }
        
    }
    
    public static line(){
        
        
        
    }
    
    //Create the main method
    public static void main(String []s){
    
        //Define m
        int m;
    
    
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        
        //Call method all blocks
        allBlocks(m);
        
        
    }
}