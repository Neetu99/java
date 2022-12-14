/*public class Floor_Binary {
   // finding floor number 
 public static void main(String []args){
    int []arr= {2,4,6,8,10,15,28};
    int target=7; 
    System.out.println(floor(arr, target));

 }  
 public static int floor(int []arr, int target){
    // if target is greates then arr length
    if(target >= arr[arr.length-1]){
        return -1;
    }
      int start =0;
      int end = arr.length-1;
      while(start<=end){
         int mid =start+(end-start)/2;

         if(arr[mid]<= target){
             start=mid+1;

         }else {
            end =mid-1;
         }
      }
      return end;
 }  
}*/
