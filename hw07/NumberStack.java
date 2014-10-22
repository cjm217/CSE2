//////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//hw 07 - NumberStack
//

//import scanner
import java.util.Scanner;

//Define the class
public class NumberStack {

    //Define the main method
    public static void main(String[] arg) {

        //Construct the scanner
        Scanner myScanner = new Scanner(System.in);

        //Prompt the user for their input
        System.out.print("Enter an int between 1 and 9-");

        //Define the number of rows
        int n = myScanner.nextInt();
        
        
        //Print out the type of loop
        System.out.println("Using for loops:");
        

        //Begin loop for the rows
        for (int i = 1; i < (n + 1); i++) {


            //Begin loop for digits
            for (int k = 0; k < i; k++) {

                //Begin space loop
                for (int m = 0; m < n - i; m++) {
                    
                    //Print space
                    System.out.print(" ");

                }
                
                //Loop for the digits
                for (int j = 1; j < (2 * i); j++) {


                    //Print the value
                    System.out.print(i);



                }
                
                //Loop for the spaces    
                for (int m = 0; m < n - i; m++) {
                    
                    //Print space
                    System.out.print(" ");

                }
                
                
                //Print line
                System.out.println();

            }
            
            //Print line
            System.out.println();


            //Print space loop
            for (int m = 0; m < n - i; m++) {
                
                
                //Print space
                System.out.print(" ");

            }
            
            
            //Print the dash loop
            for (int j = 1; j < (2 * i); j++) {
                
                //Print the dash
                System.out.print("-");


            }
            
            //Print line
            System.out.println();

            //Print the space loop
            for (int m = 0; m < n - i; m++) {
                
                
                //Print space
                System.out.print(" ");

            }
            
            //Print line
            System.out.println();
            


        }

    //Print out clarity statement
    System.out.println("Using While Loops:");
    
    //Initialize all integers
    int h = 1;
    
    int l; 
    
    int q;
    
    int p;
    
    
    
    //Begin loop for the rows
        while(h < (n + 1)){
            
            //Set beginning value
            q=0;
            
            //Begin loop for digits
            while(q < h){

                //Set beginning value
                l=0;
                
                //Begin space loop
                while(l < n - h){
                    
                    //Print space
                    System.out.print(" ");
                    
                    
                    //Add to counter
                    l++;
                
                }
                
                //Set initial value
                p=1;
                
                //Loop for the digits
                while(p < (2 * h)){


                    //Print the value
                    System.out.print(h);

                    //Add to counter
                    p++;

                }
                
                //Set initial value
                l=0;
                
                //Loop for the spaces    
                while(l < n - h){
                    
                    //Print space
                    System.out.print(" ");

                    //Add one to counter
                    l++;
                    
                }
                
                
                //Print line
                System.out.println();

                //Add to counter
                q++;
            }
            
            //Print line
            System.out.println();

            //Set initial value
            l=0;
            
            //Print space loop
            while(l < n - h){
                
                
                //Print space
                System.out.print(" ");

                //Add to counter
                l++;
                
            }
            
            //Set initial value
            p=1;
            
            //Print the dash loop
            while(p < (2 * h)){
                
                //Print the dash
                System.out.print("-");
            
                //Add to counter
                p++;

            }
            
            //Print line
            System.out.println();

            //Set initial value
            l=0;
            
            //Print the space loop
            while(l < n - h){
                
                
                //Print space
                System.out.print(" ");
                
                
                //Add to counter
                l++;
                
                
            }
            
            //Print line
            System.out.println();
            
        //Add to counter    
        h++;

        }
    
    //Print out final clarity statement    
    System.out.println("Using Do-While Loops:");
    
    //initial value
    h=1;
    
    //Begin loop for the rows
        do{
            
            //Set beginning value
            q=0;
            
            //Begin loop for digits
            do{

                //Set beginning value
                l=0;
                
                //Begin space loop
                do{
                    
                    //Print space
                    System.out.print(" ");
                    
                    
                    //Add to counter
                    l++;
                
                }
                
                //Set constraint
                while(l < n - h);
                
                //Set initial value
                p=1;
                
                //Loop for the digits
                do{


                    //Print the value
                    System.out.print(h);

                    //Add to counter
                    p++;

                }
                
                //Parameters
                while(p < (2 * h));
                
                //Set initial value
                l=0;
                
                //Loop for the spaces    
                do{
                    
                    //Print space
                    System.out.print(" ");

                    //Add one to counter
                    l++;
                    
                }
                
                //Guidelines to follow
                while(l < n - h);
                
                //Print line
                System.out.println();

                //Add to counter
                q++;
            }
            
            //Set the constraints
            while(q < h);
            
            //Print line
            System.out.println();

            //Set initial value
            l=0;
            
            //Print space loop
            do{
                
                
                //Print space
                System.out.print(" ");

                //Add to counter
                l++;
                
            }
            
            //Check the boundaries
            while(l < n - h);
            
            //Set initial value
            p=1;
            
            //Print the dash loop
            do{
                
                //Print the dash
                System.out.print("-");
            
                //Add to counter
                p++;

            }
            
            //Set the borders
            while(p < (2 * h));
            
            //Print line
            System.out.println();

            //Set initial value
            l=0;
            
            //Print the space loop
            do{
                
                
                //Print space
                System.out.print(" ");
                
                
                //Add to counter
                l++;
                
                
            }
            
            //Set the loop's bounds
            while(l < n - h);
            
            //Print line
            System.out.println();
            
        //Add to counter    
        h++;

        }
        
        //Constraints
        while(h < (n + 1));

    

    }
}