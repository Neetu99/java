/*public class Newton_binary {
    //   2-D array problem  me target find karna hai or but problem is stack has been Overflow ..

    public static void main(String args[]){
     int [][] arr ={{10, 20, 30, 40},{15, 25, 35, 45},{28, 29, 37, 49},{33, 34, 38, 50}};
    int target = 37;
    System.out.println(search(arr, 37));
    }
    static int [] search(int [][]arr, int target){
        //  using binary search because matrix is sorted 
        int row = 0;
        int col= arr.length-1;
        while(row < arr.length && col >=0){
          
        //  if target have found than return  
            if(arr[row][col] == target){
                return new int []{row,col};
            }
            // if target is greater than starting [row][col] which mean from [0,0] than come [1,0]
            if(arr[row][col]< target){
                 row++;
            }else{
                col --;
            }
        }
        return new int []{-1,-1};
    }
}*/