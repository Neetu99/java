import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long sum=0;
    int j=1;
      long []arr = new long[n];  
      
      for(int i=0; i<n; i++){
          arr[i]= sc.nextLong();
          sum += (n-j)^arr[i];
        j++;  
      } 
      System.out.print(sum);

    }
}
