import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code her
    //taking input    
    Scanner sc= new Scanner(System.in);
    int size= sc.nextInt();
    int min=0;
    long count=0;
    // for loop for input
    int []arr= new int[size];
    for(int a=0; a<size; a++){
        arr[a]= sc.nextInt();
    }
    // for loop for output
    for(int i=0; i<size; i++){
    // if else condition for coparison 
    // if arr[i] smaller than min then print 0
         if(arr[i]>=min){
             System.out.print(0+" ");
             count+=arr[i];
             min= arr[i];
    // else if opposite than print diff of the elements
         }else if(min>arr[i]){
             int rem = min-arr[i];
             System.out.print(rem+" ");
             min = arr[i]+rem;
             count+=min;
         }
    }
System.out.println();
System.out.println(count);
    }
}