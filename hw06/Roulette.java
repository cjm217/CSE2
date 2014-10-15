////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//
//Roulette Program

//Define the class
public class Roulette {

    //Create a main method
    public static void main(String [] args){
    
    //Set a limit for the larger loop
    double sessionsCount = 0;
    
    //Set a counter for the number of games profited from
    double gamesProfited = 0;
    
    //Set a counter for the number of games where they lost everything
    double gamesLost = 0;
    
    //Set a counter for profit
    double profitNumber = 0;
    
//Begin the outer while loop
while(sessionsCount < 1000){
    
    //Generate his bet number for the session
    //Generate a random roulette number
        int betNumber = (int)(Math.random() * ((38 - 0) + 1));
    
    //Set a limit for the loop    
    double spinCount = 0;
    
    //Set a counter for the amount of wins
    double winNumber = 0;
    
    //Begin the inner while loop
    while(spinCount < 100){
        
        
        //Generate a random roulette number
        int rand = (int)(Math.random() * ((38 - 0) + 1));
    
        if(rand == betNumber){
            
            //Add one to the total wins
            winNumber = winNumber + 1;
            
            //Add one to the profit number
            profitNumber = profitNumber + 1;
            
            }
        
        //Add one to the spin counter
        spinCount = spinCount + 1;
        
        }
        
    //If statement that creates a profited game data collector     
    if(winNumber > 2){
        
        //Add one to the counter
        gamesProfited = gamesProfited + 1;
        
        }    
    
    else if(winNumber == 0){
        
        //Add one to the games Lost counter
        gamesLost = gamesLost + 1;
        
        }
        
    //Add one to the amount of sessions completed
    sessionsCount = sessionsCount + 1;
    
    }
    
    //Set a value for the total profit made
    int totalProfit = (int)(36*profitNumber);
    
    //Print out all of the outcomes
    System.out.println("The number of games I lost everything is: " +gamesLost+"");
    
    System.out.println("The number of games I profited from is: " +gamesProfited+"");
    
    System.out.println("The total profit I made is: $" +totalProfit+"");
    
    
    
        
    }
}