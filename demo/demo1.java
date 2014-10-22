import java.util.Scanner;
public class demo1 {
     
     public static void main(String[] args){
          Scanner in = new Scanner(System.in);      
          
          System.out.print("Input number of groups (positive integer):");
          int groups = in.nextInt();
          System.out.println();
          
          int counter = 0;
          
          for (i = 0; i <= groups; i++){
               for(j = 0; j <= counter; j++){
                    for (k = groups; k > 0; k--){
                         System.out.print(i);
                    } // ends the inner-most loop
                    
               } // ends the second loop
               
          } // ends the outer loop

     }
     
}     