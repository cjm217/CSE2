///////////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//Random Games Program
//

//Import the Random number generator
import java.util.Random;

//Import the scanner
import java.util.Scanner;

//Define the class
public class RandomGames {
    
    //Create a main method
    public static void main(String[] args) {
        
        //Declare the scanner
        Scanner myScanner;
        
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Prompt the user for input
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        
        //Accept the input
        String answer=myScanner.next();
        
        //Check if the input is the correct length
        if(answer.length()>1 || answer.length()<1)
        {
            System.out.println("Single character expected.");
        }
        
        else{
        
            //Response based on input
            if(answer.equals("R") || answer.equals("r"))
                {
                    
                    //Construst the random generator
                    Random randomGenerator = new Random();
                    
                    //Generate a random number
                    int randomInt = randomGenerator.nextInt(39);
                    
                    
                    
                    //Switch statement with all of the cases listed
                    switch (randomInt % 38){
                    case 0: System.out.println("Roulette: 00"); break;
                    case 1: System.out.println("Roulette: "+randomInt+""); break;
                    case 2: System.out.println("Roulette: "+randomInt+""); break;
                    case 3: System.out.println("Roulette: "+randomInt+""); break;
                    case 4: System.out.println("Roulette: "+randomInt+""); break;
                    case 5: System.out.println("Roulette: "+randomInt+""); break;
                    case 6: System.out.println("Roulette: "+randomInt+""); break;
                    case 7: System.out.println("Roulette: "+randomInt+""); break;
                    case 8: System.out.println("Roulette: "+randomInt+""); break;
                    case 9: System.out.println("Roulette: "+randomInt+""); break;
                    case 10: System.out.println("Roulette: "+randomInt+""); break;
                    case 11: System.out.println("Roulette: "+randomInt+""); break;
                    case 12: System.out.println("Roulette: "+randomInt+""); break;
                    case 13: System.out.println("Roulette: "+randomInt+""); break;
                    case 14: System.out.println("Roulette: "+randomInt+""); break;
                    case 15: System.out.println("Roulette: "+randomInt+""); break;
                    case 16: System.out.println("Roulette: "+randomInt+""); break;
                    case 17: System.out.println("Roulette: "+randomInt+""); break;
                    case 18: System.out.println("Roulette: "+randomInt+""); break;
                    case 19: System.out.println("Roulette: "+randomInt+""); break;
                    case 20: System.out.println("Roulette: "+randomInt+""); break;
                    case 21: System.out.println("Roulette: "+randomInt+""); break;
                    case 22: System.out.println("Roulette: "+randomInt+""); break;
                    case 23: System.out.println("Roulette: "+randomInt+""); break;
                    case 24: System.out.println("Roulette: "+randomInt+""); break;
                    case 25: System.out.println("Roulette: "+randomInt+""); break;
                    case 26: System.out.println("Roulette: "+randomInt+""); break;
                    case 27: System.out.println("Roulette: "+randomInt+""); break;
                    case 28: System.out.println("Roulette: "+randomInt+""); break;
                    case 29: System.out.println("Roulette: "+randomInt+""); break;
                    case 30: System.out.println("Roulette: "+randomInt+""); break;
                    case 31: System.out.println("Roulette: "+randomInt+""); break;
                    case 32: System.out.println("Roulette: "+randomInt+""); break;
                    case 33: System.out.println("Roulette: "+randomInt+""); break;
                    case 34: System.out.println("Roulette: "+randomInt+""); break;
                    case 35: System.out.println("Roulette: "+randomInt+""); break;
                    case 36: System.out.println("Roulette: "+randomInt+""); break;
                    case 37: System.out.println("Roulette: "+randomInt+""); 
                    }
                    
                }
        
            //Response based on input
            else if(answer.equals("C") || answer.equals("c"))
                {
            
                //Print a statement saying this option is not available yet
                System.out.println("This option has yet to be implemented");    
                
                
                }
        
            //Response based on input    
            else if(answer.equals("P") || answer.equals("p"))
                {
            
                //Print a statement saying this option is not available yet
                System.out.println("This option has yet to be implemented");
                
                }
        
            //Response based on input    
            else
                {
                
                //Print out the error message    
                System.out.println("You did not enter a valid game type");    
                
                }
                
        }    
    }
}