//////////////////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//hw10 - MethodsAgain
//

//import the scanner
import java.util.Scanner;

//Define the class
public class FindDuplicates{
    
  /*  //New method for the test
    public static boolean inArray(int num[], int a){
        
       //for loop determining the test
        for(int i=0; i<10; i++){
            
            //test the values
            if(num[i] == a){
                
                //return if there is a duplicate
                return true;
            }    
        } 
        
        //Default case
        return false;
        
    }
    
    
    */
    
    //Define the has Dups method
    public static boolean hasDups(int num[]){
        
        //for loop determining the test
        for(int i=0; i<10; i++){
            
            //for loop 
            for(int j=(i+1); j<10; j++){
                
                //test the values
                if(num[i]==num[j]){
                   
                   //return the result
                   return true;
                   
               }
               
            }
            
        }
        
    //default condition
    return false;
        
    }
    
    //Define exactly one dup method
    public static boolean exactlyOneDup(int num[]){
       
       //Default case
       if(!hasDups(num)){
           
           //leave the method
           return false;
       }
       
       //define the false case
       boolean dup = false;
       
       
       //for loop determining the test
        for(int i=0; i<10; i++){
            
            //for loop 
            for(int j=(i+1); j<10; j++){
                
                //test the values
                if(num[i]==num[j]){
                   
                   //Previous case for duplicates
                   if(dup == true){
                       
                       //Define if multiple duplicates exist
                       return false;
                   }
                   //return the result
                   dup = true;
                   
               }
               
            }
            
        }
       
       //return the result
       return dup;
       
        
    }
    
    //define the main method
    public static void main(String [] arg){
    
    //Define a new array
    int hasDups[]=new int[10];
    
    //Define a new array
    int exactlyOneDup[]=new int[10];
    
    
    //Declare and construct thes scanner
    Scanner scan=new Scanner(System.in);
    
    //Define the array
    int num[]=new int[10];
    
    //Define what the array will store
    String answer="";
    
    //Begin loop
    do{
        
        //Prompt the user for for ints    
        System.out.print("Enter 10 ints- ");
        
        //enter strings into the array
        for(int j=0;j<10;j++){
        
        //Define the variable in the array
        num[j]=scan.nextInt();
        }
      
        //Print out the array
        String out="The array ";
      
        //Return parts of the array
        out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      
        //print whether if there are multiple duplicates
        if(hasDups(num)){
        out+="has ";
        }
      
        //print if there are no duplicates
        else{
        out+="does not have ";
        }
      
        //print out duplicates
        out+="duplicates.";
      
        //print the results
        System.out.println(out);
        out="The array ";
        out+=listArray(num);    
      
        //print if there is one duplicate
        if(exactlyOneDup(num)){
        out+="has ";
        }
      
        //Print if there is not one duplicate
        else{
        out+="does not have ";
        }
      
        //Print the rest of the statement
        out+="exactly one duplicate.";
        
        //Print the results
        System.out.println(out);
    
        //Prompt the user to go again    
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        
        //Define answer
        answer=scan.next();
        }
        
        //Define whether to run it again
        while(answer.equals("Y") || answer.equals("y"));
    }
    
    //Define a new method
    public static String listArray(int num[]){
    
    //Print out {
    String out="{";
    
    //Loop for the number of ints in the array
    for(int j=0;j<num.length;j++){
        
        //Define what to print out
        if(j>0){
        
        //Print a comma
        out+=", ";
        }
        
        //Print the array number
        out+=num[j];
    }
    
    //Print }
    out+="} ";
    
    //return the out string
    return out;
  }
}