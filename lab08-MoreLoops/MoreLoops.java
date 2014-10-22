/////////////////////////////////////////////////
//Chris Mueller
//CSE 2
//
//More Loops program

//Import the scanner
import java.util.Scanner;

//Define the class
public class MoreLoops{
    
    //Define the main method
    public static void main(String[] arg){
	
	//Construct the scanner
	Scanner myScanner=new Scanner(System.in);
	
	int n=0;
	

/////////////////////////////////////////////////////////////////////////////

    
    //Prompt the user for an int
	//System.out.print("Enter an int- ");
	
	
	//First loop
	//while(!scan.hasNextInt()){
	    
	    //Check if int is correct
	    //scan.next();
	    
	    //Print error statement
	    //System.out.print("You did not enter an int; try again- ");
	//}
	
	//COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        
    //Prompt the user for an int
    System.out.print("Enter an int- ");
    
    
    
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
  

/////////////////////////////////////////////////////////////////////////////        
    
    //Define n
    n=myScanner.nextInt();
    
	//for(int j=0;j<n && j<40;j++){
	    //for(int k=0;k<j+1;k++){
		//System.out.print('*');
	    //}
	    //System.out.println();
	//}
	
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS

    //Define j
    double j=0;
    
    //construct while statement
    while(j<n && j<40){
        
        //Define m
        double m=0;
        
        //construct while statement
        while(m<j+1){
            
            //Print out the star
            System.out.print('*');
            
            //Add one to the counter
            m++;
        }
        
        //Clear the line
        System.out.println();
        
        //Add one to the counter
        j++;
    }

////////////////////////////////////////////////////////////////////////////////      
	int k=4;

	//do{
	    //System.out.println("k="+k);
	    //k++;
	//}
         //while(k<4);
        
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

	//begin while loop
	while(k<=4){
		
		//Print out k's value
		System.out.println("k="+k);
	
		//Add one to k
		k++;
	}

////////////////////////////////////////////////////////////////////////////////////
        
        
        
        //while(true){
	    //switch(n){
	    //default: System.out.println(n + " is > 5 or <1");
		//break;
	    //case 1: 
	    //case 2: System.out.print("Case 2 "); 
		//continue;
	    //case 3: break;
	    //case 4: System.out.println("Case 4");
	    //case 5: System.out.println("Case 5");
		//break;
	    //}
	    //count++;
	    //if(count>10)
		//break;
	//}
	
	
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
	
	//begin the loop
	for(int c=0; c<10 ; c++){
		
		//default
		if(n>5 || n<1){
			
			//print result
			System.out.println(n + " is > 5 or <1");
			
		}
		
		//What to do for a 1 or 2
		else if(n==1 || n==2){
			
			//print out the statement
			System.out.print("Case 2");
			
		}
		
		//what to do for a 3
		else if(n==3){
			
			//break from loop
			break;
			
		}
		
		//What to do for a 4 or 5
		else if(n==4 || n==5){
			
			//print out the case
			System.out.println("Case 4");
			System.out.println("Case 5");
			
		}
		
		
		
	}
	
	
	
	
	
	
	
    }
}