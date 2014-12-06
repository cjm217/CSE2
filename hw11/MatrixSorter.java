/////////////////////////////////
//Chris Mueller
//
//CSE 2
//
//HW 11 - Matrix Sorter

//define class
public class MatrixSorter{
    
    //define main method
    public static void main(String arg[]){
        
    //initialize a 3d array
    int mat3d[][][];
    
    //declare what the mat will be
    mat3d=buildMat3d();
    
    //method for show
    show(mat3d);
    
    //Print out the smallest min in the entry
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
    
  	//Print out the sort statement		
    System.out.println("After sorting the 3rd matrix we get");
    
    //sort the mat
    sort(mat3d[2]);
    
    //display the mat
    show(mat3d);
   
        
    }
    
    //define the sort method
    public static int sort(mat3d[][][]){
        
    }
    
    //define the show method
    public static int show(mat3d[][][]){
        
    }
    
    
    
    
    
    )
}