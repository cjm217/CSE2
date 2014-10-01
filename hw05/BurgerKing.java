///////////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//Burger King Program
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class BurgerKing {
    
    //Create a main method
    public static void main(String[] args) {
        
        //Declare the scanner
        Scanner myScanner;
        Scanner myScannerB;
        Scanner myScannerS;
        Scanner myScannerF;
        
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Prompt the user for input
        System.out.print("Enter B or b for a burger, S or s for a soda, F or f for fries:");
        
        //Accept the input
        String answer=myScanner.next();
        
        //Check if the input is the correct length
        if(answer.length()>1 || answer.length()<1)
        {
            System.out.println("Single character expected.");
        }
        
        else{
        
            //Response based on input
            if(answer.equals("B") || answer.equals("b"))
                {
                    
                    //Construct the scanner
                    myScannerB = new Scanner( System.in );
                    
                    //Prompt the user for the input
                    System.out.print("Enter A or a for 'all the fixins,' C or c for cheese, N or n for none of the above:");
                    
                    //Accept the input
                    String answerB=myScannerB.next();
                    
                    //Dictate response
                    if(answerB.equals("A") || answerB.equals("a"))
                    {
                        //print out the result
                        System.out.println("You ordered a burger with all the fixins.");
                    }
                    
                    //dictate respons
                    else if(answerB.equals("C") || answerB.equals("c"))
                    {
                        //print the result
                        System.out.println("You ordered a burger with cheese.");
                    }
                    
                    //dictate response
                    else if(answerB.equals("N") || answerB.equals("n"))
                    {
                        //Print out the result
                        System.out.println("You ordered a burger with none of the above.");
                    }
                    
                    //dictate response
                    else
                    {
                        //print an error message
                        System.out.println("You did not enter A, a, C, c, N, or n");
                    }
                }
        
            //Response based on input
            else if(answer.equals("S") || answer.equals("s"))
                {
            
                    //Construct the scanner
                    myScannerS = new Scanner( System.in );
                
                    //Prompt the user for the input
                    System.out.print("Do you want Pepsi (p or P), Coke (c or C), Sprite(s or S), or Mountain Dew(m or M):");
                
                    //Accept the input
                    String answerS=myScannerS.next();
                    
                    //dictate response                
                    if(answerS.equals("p") || answerS.equals("P"))
                    {
                        //print the order
                        System.out.println("You ordered a Pepsi");
                    }
                    
                    //dictate response
                    else if(answerS.equals("C") || answerS.equals("c"))
                    {
                        //print results
                        System.out.println("You ordered a Coke");
                    }
                    
                    //dictate response
                    else if(answerS.equals("s") || answerS.equals("S"))
                    {
                        //print the results
                        System.out.println("You ordered a Sprite");
                    }
                    
                    //dictate response
                    else if(answerS.equals("M") || answerS.equals("m"))
                    {
                        //print results
                        System.out.println("You ordered a Mountain Dew");
                    }
                    
                    //print error result
                    else
                    {
                        //error result
                        System.out.println("You did not enter one of p, P, c, C, s, S, m, M");
                    }
                }
        
            //Response based on input    
            else if(answer.equals("F") || answer.equals("f"))
                {
                
                    //Construct the scanner        
                    myScannerF = new Scanner( System.in );
                
                    //Prompt the user for the input
                    System.out.print("Do you want a large or small order of fries(l, L, s, or S):");
                
                    //Accept the input
                    String answerF=myScannerF.next();
                
                    //dictate response  
                    if(answerF.equals("l") || answerF.equals("L"))
                    {
                        //print result
                        System.out.println("You ordered a large fry");
                    }
                
                    //dictate result
                    else if(answerF.equals("s") || answerF.equals("S"))
                    {
                        //print result
                        System.out.println("You ordered a small fry");
                    }
                
                    //dicate response
                    else
                    {
                        //print result
                        System.out.println("You did not enter one of l, L, s, or S");
                    }
                
                }
        
            //Response based on input    
            else
                {
                
                    //Print out the error message    
                    System.out.println("You did not enter any of B, b, S, s, F, f");    
                
                }
                
        }    
    }
}