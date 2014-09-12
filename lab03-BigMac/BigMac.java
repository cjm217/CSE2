//////////////////////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//Lab03-BigMac
//September 12, 2014
//Calculates the cost and tax of Big Macs

//Import the scanner
import java.util.Scanner;

//Create a class
public class BigMac {
    
    //Create a main method
    public static void main(String[] args) {
    
    //Declare the scanner    
    Scanner myScanner;
    
    //Construct the scanner
    myScanner = new Scanner( System.in );
    
    //Print what the user will see
    System.out.print("Enter the number of Big Macs(an integer > 0): ");
    
    //Accept the user input
    int nBigMacs = myScanner.nextInt();
    
    //Print the statement asking for user input
    System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): " );
    
    //Create a variable
    double bigMac$ = myScanner.nextDouble();
    
    //Prompt the user for a tax value
    System.out.print("Enter the percent tax as a whole number (xx): ");
    
    //Create a variable for the tax rate
    double taxRate = myScanner.nextDouble();
    
    //Turn the tax rate into a proportion
    taxRate/=100;
    
    //Create a new variable
    double cost$;
    
    int dollars,   //whole dollar amount of cost 
      dimes, pennies; 
    //for storing digits      
    //to the right of the decimal point 
    //for the cost$ 
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    
    //convert to dimes
    dimes=(int)(cost$*10)%10;
    
    //connvert to pennies
    pennies=(int)(cost$*100)%10;
    
    //Print final statement
    System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+"."+dimes+pennies);
    
    }
}    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    