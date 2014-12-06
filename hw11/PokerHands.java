////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//HW 11 - Poker Hands

//import scanner
import java.util.Scanner;

//define class
public class PokerHands{
    
    //define main method
    public static void main(String [] arg){
        
    //declare the scanner
    Scanner myScanner;   
    
    //construct the scanner
    myScanner = new Scanner(System.in);
    
    //Prompt the user for their card input
    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
    
    //Prompt the user for a suit
    System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
    
    }
    
    //declare the showOneHand method 
    public static void showOneHand(int hand[]){
	
	//Define the array for suits
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	
	//define the value array
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
  	
  	//what comes out
	String out="";
	
	//loop to print it out
	for(int s=0;s<4;s++){
	    
	//add on the suit    
  	out+=suit[s];
  	
  	//for loop for the value of the card
  	for(int rank=0;rank<13;rank++)
  	
  	    //for loop for the position of the card
    	for(int card=0;card<5;card++)
    	
    	//test for the rank of the card
     	if(hand[card]/13==s && hand[card]%13==rank)
      	
      	//adds on the value of the card
      	out+=face[rank];
    
    //adds a new line  	
  	out+='\n';
	}
	
	//print the out result
	System.out.println(out);
  }
    
}