/*public class Fst_nd_Lst {
    public static void main(String[] arg){
     int []arr = {2,4,6,6,6,6,6,10,14,18};
     int target = 6;
    //  taking new array
     int [] ans =new int[2];
     ans[0] = firstOccurrance(arr, target);
     if(ans[0]!=0){
      ans[1]=  lastOccurance(arr, target);
     }
     
     System.out.println(ans);
    }
    // finding first occurrance 
    static int firstOccurrance(int []arr, int target){
      int start =0;
      int end = arr.length-1;
      // if value not found than return -1;  2,4,6,6,6,6,6,10,14,18
      int result = -1;
      while(start <= end ){
          int mid = start +(end-start)/2;
         
          if(target == arr[mid]){
            result = mid;
            end = mid-1;

          }else if(target < arr[mid]){
            end = mid-1;
          }else {
            start = mid+1;

          }
      }
      return result;
    }
    // finding last Occurrance 
    static int lastOccurrance(int []arr, int target){
      int start =0;
      int end = arr.length-1;
      // res is random variable for taking return if value will not find out than return -1
      int res = -1;
      while(start <= end ){
        // finding mid here
          int mid = start +(end-start)/2;
//  comparision if value will matched than put it in to the : - res ; and than again start+1; 
          if(target == arr[mid]){
            res= mid;
            start = mid+1;

          }else if(target < arr[mid]){
            end = mid-1;
          }else {
            start = mid+1;

          }
      }
      return res ;
    }
}*/
