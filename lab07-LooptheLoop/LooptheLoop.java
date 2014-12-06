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
    
    //Define the main method
    public static void main(String arg[]) {


            //Declare the scanner
            Scanner myScanner; 
            
            //Construct the scanner
            myScanner = new Scanner(System.in);

            //Define the number of stars
            int nStars = 0;
            
            //Define the empty string
            String junk = "";
            
            //Define the next empty string
            String cont = "";


            //Run loop until the user breaks out
            while (true) {
                
                //Loop that controls the size
                while (nStars < 1 || nStars > 15) {
                    
                    //Prompt the user for their input
                    System.out.print("Enter an int between 1 and 15:  ");                 
                    
                    //Define when the scanner will accept the input
                    while (!myScanner.hasNextInt()) {          
                        
                        //Looks into input for stars
                        junk = myScanner.next();            
                        
                        //Prompt the user for an input
                        System.out.print("Enter an int between 1 and 15:  "); 


                    } //End the while loop inside
                    
                    //Accept the input for stars
                    nStars = myScanner.nextInt(); 
                    
                    //Error statement generator
                    if (nStars < 1 || nStars > 15) { 
                        
                        //error statement
                        System.out.println("Your int was not in the range [1 to 15]"); 
                    
                        
                    } //end the if statement
                } //end the outer while loop

                //Control the loop
                int counter = 1; 
                
                //Control the inner loop
                int lineCounter = 1; 

                //while loop that prints stars
                while (counter <= nStars) { 
                    
                    //Print the star
                    System.out.print("*"); 
                    
                    //Add 1 to the counter
                    counter++; 
                    
                } //end the loop
                System.out.println(""); //moves to next row for output   
                
                //Reset the count
                counter = 1; 
                
                //Prints out stars with loop
                while (counter <= nStars) { 
                    
                    //while loop that prints the right amount of stars
                    while (lineCounter <= counter) { 
                        
                        //Print a star
                        System.out.print("*"); 
                        
                        //add one to the count
                        lineCounter++; 
                        
                    
                    } //end the inside loop
                    
                    //reset the count
                    lineCounter = 1; 
                    
                    //print a row
                    System.out.println(); 
                    
                    //add to the count
                    counter++;

                } //end of while loop
                
                //Ask the user if they want to go again
                System.out.print("Would you like to continue? If so, enter y or Y");
                
                //accept the user's input 
                cont = myScanner.next(); 
                
                //conditions for continuing
                if ((cont.equals("Y")) || (cont.equals("y"))) {}
                
                //default case
                else {
                    
                    //break from the largest loop
                    break;
                }

                //reset the stars counter
                nStars = 0;




            } //end of while true loop

        } //end main method   
} //end class
