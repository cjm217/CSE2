///////////////////////////////////////////////////////////////////////
//Chris Mueller
//CSE 002
//Month Program
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class Month {
    
    //Create a main method
    public static void main(String[] args) {
        
    //Declare the Scanner
    Scanner myScanner;
    
    //Declare another Scanner
    Scanner myScanner2;
    
    //Construct the scanner
    myScanner = new Scanner( System.in );   
    
    //Prompt the user for the number of Big Macs
    System.out.print("Enter the month of the year (1-12): ");
        
    //Check if the input is correct
    myScanner.hasNextInt();
        
        
    //Check the integer for validity
    if (myScanner.hasNextInt())
    {
        
        //Create an int for the month
        int nMonth = myScanner.nextInt();
        
        //Result based on the int
        if(nMonth==1 || nMonth==3 || nMonth==5 || nMonth==7 || nMonth==8 || nMonth==10 || nMonth==12)
        {
            //Print the result
            System.out.println("The month has 31 days");
        }
        
        //month results
        else if(nMonth==2)
        {
            //Construct the scanner
            myScanner2 = new Scanner( System.in );
            
            //Prompt the user for the year
            System.out.print("Enter the year (int>0):");
            
            //Check if the input is correct
            myScanner2.hasNextInt();
        
        
            //Check the integer for validity
            if (myScanner2.hasNextInt())
            {
                
                //Create a new int for the next value    
                int nYear = myScanner2.nextInt();   
            
                if(nYear>0)            
                {
                    
                    //Create a boolean
                    boolean isLeapYear = (nYear % 4 == 0 && nYear %100  != 0) || (nYear % 400 == 0);
                
                    //Print result
                    System.out.println(+nYear+ " is a leap year? " +isLeapYear+"");
                    
                }
            
            
                else
                {
                    //Print an error message
                    System.out.println("You did not enter a valid year");
                }
            
            }
            
        }    
        
        //results for the months with 30 days
        else if(nMonth==4 || nMonth==9 || nMonth==6 || nMonth==11)
        {
            //Print the result
            System.out.println("The month has 30 days");
        }
        
        else
        {
            //Print an error message
            System.out.println("You did not enter a valid month within the range of 1-12");
        }
        
        
        
    }
    
    }
}