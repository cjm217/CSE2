//////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//Root Program
//

//Import the scanner
import java.util.Scanner;

//Define the class
public class Root {

    //Begin the main string    
    public static void main(String [] args){
        
        //Declare the scanner    
        Scanner myScanner;
    
        //Construct the scanner
        myScanner = new Scanner( System.in );
        
        //Print what the user will see
        System.out.print("Enter a value (an integer > 0): ");
        
        //Create a variable
        double beginningNumber = myScanner.nextDouble();
        
        //find the first guess
        double guess1= beginningNumber/3;
        
        //find the second guess
        double guess2= (2*guess1*guess1*guess1+beginningNumber)/(3*guess1*guess1);
        
        //find the third guess
        double guess3= (2*guess2*guess2*guess2+beginningNumber)/(3*guess2*guess2);
        
        //find the fourth guess
        double guess4= (2*guess3*guess3*guess3+beginningNumber)/(3*guess3*guess3);
        
        //find the fifth guess
        double guess5= (2*guess4*guess4*guess4+beginningNumber)/(3*guess4*guess4);
        
        //find the sixth guess
        double guess6= (2*guess5*guess5*guess5+beginningNumber)/(3*guess5*guess5);
        
        //guess the original number
        double cubeReturn= guess6*guess6*guess6;
        
        //Print out the cube root
        System.out.println("The cube root is "+guess6+"");
        
        //Print out the cube of the crude guess
        System.out.println(""+guess6+"*"+guess6+"*"+guess6+"="+cubeReturn+"");
        
    }    
}        
        