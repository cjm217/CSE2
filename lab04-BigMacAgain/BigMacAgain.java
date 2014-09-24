//////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//
//Lab 04 - Big Mac Again
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class BigMacAgain {
    
    //Create a main method
    public static void main(String[] args) {
        
        //Define the cost of Big Macs and fries
        double macCost$=2.22;
        double fryCost$=2.15;
        
        //Declare the Scanner
        Scanner myScanner;
        
        //Declare the second Scanner
        Scanner myScanner2;
        
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Prompt the user for the number of Big Macs
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        
        //Check if the input is correct
        myScanner.hasNextInt();
        
        
        //Check the integer for validity
        if (myScanner.hasNextInt())
        
        {
            int nBigMacs = myScanner.nextInt();
            
            if(nBigMacs>0)
            {
                //Define the total cost of Big Macs
                double macTotal$=macCost$*nBigMacs;
                
                //Define the meal total
                double mealTotal$=macTotal$+fryCost$;
                    
                //Define the meal total
                double mealTotal1$=macTotal$+fryCost$;
                
                //Print out the result
                System.out.print("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"*"+macCost$+" = ");
                
                //Print out the total cost of Big Macs
                System.out.printf("%4.2f", macTotal$);
                
                //Move to the next line
                System.out.println();
                
                //Use the scanner for fries next
                myScanner2 = new Scanner (System.in);
                
                //Prompt the user for fries
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                
                String answer=myScanner2.next();
                
                //create if statement based on the answer to the question
                if(answer.equals("Y"))
                
                {
                    //Print the results of the boolean
                    System.out.print("You ordered fries at a cost of $"+fryCost$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                    
                    //Print the meal cost total
                    System.out.print("The total cost of the meal was $"+mealTotal1$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                }    
                
                
                else if(answer.equals("y"))
                
                {
                    //Print the results of the boolean
                    System.out.print("You ordered fries at a cost of $"+fryCost$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                    
                    //Print the meal cost total
                    System.out.print("The total cost of the meal was $"+mealTotal$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                }
                
                else if(answer.equals("N"))
                
                {
                    //Print the results
                    System.out.print("You turned down the offer for fries");
                    
                    //Keep the terminal clean
                    System.out.println();
                    
                    //Print the meal cost total
                    System.out.print("The total cost of the meal was $"+macTotal$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                }
                
                else if(answer.equals("n"))
                
                {
                    //Print the results of the boolean
                    System.out.print("You turned down the offer for fries");
                    
                    //Keep the terminal clean
                    System.out.println();
                    
                    //Print the meal cost total
                    System.out.print("The total cost of the meal was $"+macTotal$+"");
                    
                    //Keep the terminal clean
                    System.out.println();
                    
                }
                
                //Print an error statement
                else{
                        System.out.println("You did not enter a valid answer");
                        return; //leave the program
                    }
                    
                
                
            }
            
            
            //Print out the error statement if the integer is <0
            else{
            System.out.println("You did not enter an int >0");
            return;    //leaves the program, i.e.
                   //the program terminates
            }
                        
       
       
        }
        
        else{
        System.out.println("You did not enter an int >0");
        return;    //leaves the program, i.e.
                   //the program terminates
        }
        
        //Print the next statement on a new line
        System.out.println();
        
    }    
}