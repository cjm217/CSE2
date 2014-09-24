//////////////////////////////////////////////////
//Chris Mueller
//CSE 02
//Income Tax program
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class IncomeTax {
    
    //Create a main method
    public static void main(String[] args) {
        
    //Declare the Scanner
    Scanner myScanner;
    
    //Construct the scanner
    myScanner = new Scanner( System.in );   
    
    //Prompt the user for their income
    System.out.print("Enter an int giving the number of thousands (an integer > 0): ");
        
    //Check if the input is correct
    myScanner.hasNextInt();
        
        
    //Check the integer for validity
    if (myScanner.hasNextInt())
    {
        //Create an integer from the scanner
        int nIncome = myScanner.nextInt();
            
        if(nIncome>0&&nIncome<20)
        {
            
            //Define the int as a variable
            double printIncome$=nIncome*1000;
            
            //Define the tax on the income
            double taxRate$=.05;
                
            //Find the total tax on the income
            double printTax$=printIncome$*taxRate$;
            
            System.out.print("The tax rate on $"+printIncome$+" is 5.0%, and the tax is $"+printTax$+"");
            
            //Keep the terminal clean
            System.out.println();
        }
        
        else if(nIncome>=20&&nIncome<40)
        {
            //Define the int as a variable
            double printIncome1$=nIncome*1000;
            
            //Define the tax on the income
            double taxRate1$=.07;
                
            //Find the total tax on the income
            double printTax1$=printIncome1$*taxRate1$;
            
            //Print the result
            System.out.print("The tax rate on $"+printIncome1$+" is 7.0%, and the tax is $"+printTax1$+"");    
            
            //Keep the terminal clean
            System.out.println();
        }
        
        else if(nIncome>=40&&nIncome<78)
        {
            //Define the int as a variable
            double printIncome2$=nIncome*1000;
            
            //Define the tax on the income
            double taxRate2$=.12;
                
            //Find the total tax on the income
            double printTax2$=printIncome2$*taxRate2$;
            
            //Print the result
            System.out.print("The tax rate on $"+printIncome2$+" is 12.0%, and the tax is $"+printTax2$+"");
            
            //Keep the terminal clean
            System.out.println();
        }
        
        else if(nIncome>=78)
        {
            //Define the int as a variable
            double printIncome3$=nIncome*1000;
            
            //Define the tax on the income
            double taxRate3$=.14;
                
            //Find the total tax on the income
            double printTax3$=printIncome3$*taxRate3$;
            
            //Print the result
            System.out.print("The tax rate on $"+printIncome3$+" is 14.0%, and the tax is $"+printTax3$+"");
            
            //Keep the terminal clean
            System.out.println();
        }
        
        else
        {
            //Print an error statement
            System.out.print("You did not enter a valid integer >0");
            
            
            //Keep the terminal clean
            System.out.println();
        }
        
    }
}
}