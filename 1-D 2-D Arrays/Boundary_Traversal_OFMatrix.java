import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    while(testcase >0){
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
      
      for(int i=0; i<row;  i++){
          for(int j=0; j<col; j++){
              arr[i][j]= sc.nextInt();
          }
      }
      if(row==1){
          for(int i=0; i<col; i++){
              System.out.print(arr[0][i]+" ");
          }
      }else if(col ==1){
          for(int i=0; i<row; i++){
              System.out.print(arr[i][0]+" "); 
          }
      }else{
// first row
      for(int i=0; i<col; i++){
          System.out.print(arr[0][i]+" ");
      }
// right col 
      for(int i =1; i<row-1; i++){
           System.out.print(arr[i][col-1]+" ");
      }
// last row
     for(int i=col-1; i>=0 ; i--){
          System.out.print(arr[row-1][i]+" ");
     }
// last col
     for(int i= row-2; i>=1; i--){
          System.out.print(arr[i][0]+" ");
      }
    } 
    System.out.println();
    testcase--;
    }
}
}
