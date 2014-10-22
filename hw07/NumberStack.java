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


    System.out.println("Using While Loops:");
    
    
    int h = 1;
    
    int l; 
    
    int q;
    
    int p;
    
    
    
    //Begin loop for the rows
        while(h < (n + 1)){
            
            q=0;
            
            //Begin loop for digits
            while(q < h){

                l=0;
                
                //Begin space loop
                while(l < n - h){
                    
                    //Print space
                    System.out.print(" ");

                    l++;
                
                }
                
                p=1;
                
                //Loop for the digits
                while(p < (2 * h)){


                    //Print the value
                    System.out.print(h);

                    p++;

                }
                
                l=0;
                
                //Loop for the spaces    
                while(l < n - h){
                    
                    //Print space
                    System.out.print(" ");

                
                    l++;
                    
                }
                
                
                //Print line
                System.out.println();

                q++;
            }
            
            //Print line
            System.out.println();

            l=0;
            
            //Print space loop
            while(l < n - h){
                
                
                //Print space
                System.out.print(" ");

                l++;
                
            }
            
            p=1;
            
            //Print the dash loop
            while(p < (2 * h)){
                
                //Print the dash
                System.out.print("-");
            
                p++;

            }
            
            //Print line
            System.out.println();

            l=0;
            
            //Print the space loop
            while(l < n - h){
                
                
                //Print space
                System.out.print(" ");

                l++;
                
                
            }
            
            //Print line
            System.out.println();
            
        h++;

        }
        
    System.out.println("Using Do-While Loops:");

    

    }
}