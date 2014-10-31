//////////////////////////////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//Lab10 - Method Calls
//

//Define the class
public class MethodCalls{
    
    
    //Create a method for adding digits
    public static int addDigit(int number,int digit){
        
        //declare c
        int c;
        
        //Do this if digit it within range of the parameters
        if(digit => 0 || digit =< 9){
        
            //return the value of c
            return c;
        
        }
        
        //Do this if the digit is not in the range of 0 to 9
        else{
            
            //equate c to the value of the number
            c=number; 
        
            //return the value of c
            return c;
        }
    }
    
    //Create a method for joining digits
    public static int join(int join1,int join2){
       
       
        //return the value of c    
        return c; 
    }
    
    //Start the main method
    public static void main(String []  arg){
        
        //Define a, b, c
        int a=784,b=22,c;
        
        //Call addDigit to add 3 to a
        c=addDigit(a,3);
        
        //Print the result of c given 3 and a
        System.out.println("Add 3 to "+a+" to get "+c);
        
        //call addDigit to add 3, 4, 5 to c
        c=addDigit(addDigit(c,4),5);
        
        //Print the result of adding 3, 4, 5 to c
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        
        //Print the result of adding 3 to -98
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        //Use the join method to join a and b
        c=join(a,b);
        
        //Print the result of joing a and b
        System.out.println("Join "+a+" to "+b+" to get "+c);
        
        //Print the result of joing 87, 42, 83
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        
        //Printt eh result of joing -9 and -90
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  


/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/