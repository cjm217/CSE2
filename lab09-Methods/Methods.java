////////////////////////////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//lab09 - Methods
//


//Import the scanner
import java.util.Scanner;

//Define the public class
public class Methods{

    //Define the first of the methods
    public static void getInt(int a,int b,int c){

        //Declare and construct the scanner
	    Scanner myScanner=new Scanner(System.in);
	
	    //Prompt the user for 3 ints
	    System.out.println("Enter three ints");
        
        //Begin the loop
        do{
        
            //Define what the scanner input means
            if(myScanner.hasNextInt()){
        	
        	    //get out of the while loop
        	    break;
        	
            }
        
            //Keep going through the while loop
            else{
        	
        	    //Get through the answer
        	    myScanner.next();
        
        	    //Error statement
        	    System.out.print("You did not enter an int; try again- ");
    	
            }
    
    
    	
    }
    
    //Set condition for the do while loop
    while(!myScanner.hasNextInt());
        
    }
    
    
    public static int larger(int a,int b,int c){
            
            //Determine what to do
            if(a>b){
                
                //Determine what to do after
                if(a>c){
                    
                    //Return whichever value is larger
                    return a;
                    
                }
                
                //Determine what to do if the statement is not trued
                else{
                    
                    //Return whichever value is larger
                    return c;
                }
                            
            }
            
            //Otherwise, do this
			else{
			    
			    if(b>c){
			        
			        //Return the larger value
			        return b;
			        
			    }
			    
			    else{
			        
			        //Return the alrger of the two
			        return c;
			    }
			    
			}       
    
        
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Start the main method    
    public static void main(String [] arg){
	
	//Declare the scanner
	Scanner myScanner;
	
	//Declare the ints
	int a,b,c;
	
	//Define the int a using the input
	a=getInt(myScanner);
	
	//Define the int b using the input
	b=getInt(myScanner);
	
	//Define the int c using the input
	c=getInt(myScanner);
	
	//Output giving the greater value of a or b
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	
	//Output giving the greater value between a, b, or c
	System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,(larger(b,c))));
	
	//Give the least to greatest values
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
    
        
    }
}
  
  