//////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//hw10 - Poker Odds
//

//Import the random
import java.util.Random;

//Import the scanner
import java.util.Scanner;

//Define the class
public class PokerOdds{

    //define the showHands method
    public static void showHands(){
        String answer = ""; 
        do{    
        
            //Define a list of card numbers
            char[] cards={'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
            
            
            //define a spade array
            char spades[] = new char[5];
            
            //define a clubs array
            char clubs[] = new char[5];
            
            //define a heart array
            char hearts[] = new char[5];
            
            //define a diamond array
            char diamonds[] = new char[5];
            
            //Construct random generator
            Random rand = new Random();
            
            for(int i=0; i<5; i++){
            
                //Randomly generate a number
                int card = rand.nextInt(12);
                
                //new char
                char myCard = cards[card];
                
                //Randomly generate a suit
                int suit = rand.nextInt(4);
                
                //define the suit
                if(suit == 0){
                    
                    //enter a card into the suit
                    spades[i] = myCard;   
                    
                }
                
                //define the suit
                if(suit == 1){
                    
                    //enter a card into the suit
                    diamonds[i] = myCard;   
                    
                }
                
                //define the suit
                if(suit == 2){
                    
                    //enter a card into the suit
                    clubs[i] = myCard;   
                    
                }
                
                //define the suit
                if(suit == 3){
                    
                    //enter a card into the suit
                    hearts[i] = myCard;   
                    
                }
                
            }
            
            //Print the results
            System.out.print("Spades : ");
            
            //Define what to print
            for (int i = 0; i < 5; i++){
                if (spades[i] != '0'){
                    System.out.print(spades[i]);    
                }    
            }
            
            //print a clean line
            System.out.println();
            
            //Print the results
            System.out.print("Hearts : ");
            for (int i = 0; i < 5; i++){
                if (hearts[i] != '0'){
                    System.out.print(hearts[i]);    
                }    
            }
            
            //Print a space line
            System.out.println();
            
            //Print the full results for the suit
            System.out.print("Diamonds : ");
            for (int i = 0; i < 5; i++){
                if (diamonds[i] != '0'){
                    System.out.print(diamonds[i]);    
                }    
            }
            
            //Print a line
            System.out.println();
            
            //Print the results of clubs
            System.out.print("Clubs : ");
            for (int i = 0; i < 5; i++){
                if (clubs[i] != '0'){
                    System.out.print(clubs[i]);    
                }    
            }
            
            //Print a line
            System.out.println();

            //Prompt the user to go again    
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            
            // New Scanner
            Scanner scan = new Scanner(System.in);
            
            //Define answer
            answer=scan.next();
        
        }
        
        
            //Define whether to run it again
            while(answer.equals("Y") || answer.equals("y"));
    }
        
    //Define a new method    
    public static void simulateOdds(){
        
        //Define a list of card numbers
        char[] cards={'1','2','3','4','5','6','7','8','9','T','J','Q','K','A'};
        
        
        for(int i=0; i<10000; i++){
            
            showHands();
        }
        
        
    }  
    
    
    //Define the main method
    public static void main(String [] arg){
    
    
    
    //call showHands
    showHands();
    
    //call simulate Odds
    simulateOdds();
    
    
    }
}