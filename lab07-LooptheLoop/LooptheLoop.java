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
    
    //define n
    int n=0;
        
    //Declare the scanner
    Scanner myScanner;
    
    //Declare another scanner
    Scanner myScanner2;
    
    //Construct the scanner
	myScanner =new Scanner(System.in);
        

    //Prompt the user for an int
    System.out.print("Enter an int- ");

    //Check if n is correct
    n=myScanner.nextInt();
    
    if(n>0 && n<16){
    
        //Begin infinite loop
        while(true){
    
            //Declare an int
            int m=0;
    
            //Begin loop
            while(m<n){
        
                //define k
                int k=0;
        
                //construct the while loop
                while(k < m+1){
        
                    //Print out the statement
                    System.out.print("*");
        
                    //Add one to the counter
                    k++;
        
                }
        
            //Move to the next row
            System.out.println();
        
            //add another star to the int
            m++;
        
            }
            
            //Construct a new scanner
            myScanner2 = new Scanner( System.in );
            
            //Print out the continue statement
            System.out.print("Enter y or Y to go again: ");
            
            //Get the answer
            String answer=myScanner2.next();
            
            //Check the answer
            if(answer.equals("n") || answer.equals("N")){
                
                //Break out
                break;
            }
            
            else if(answer.equals("y") || answer.equals("Y")){
            
            }
            
            else{
                
                //Print error statement
                System.out.println("You did not print one of y, Y, n, N");
                
                //Break from the loop
                break;
            }
            
        }
    
    }
    
    else{
        
        //Print error statement
        System.out.println("You did not enter a valid int");
        
    }

    }
}