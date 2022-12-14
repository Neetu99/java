/*public class Infinite_Binary {
    public static void main(String []args){
    int []arr = {2,4,6,8,10,13,15,17,19,20,27,29,30,33,36,39,42,47,53,58,60,64,67,69,75,88};
     int target = 20;    
      rangeOfArray(arr, target);
      // print
      System.out.println(rangeOfArray(arr, target));
    }
    static int rangeOfArray(int []arr, int target){
    //     two size chunk of array 
        int start = 0;
       int end =1; 
      //   condition

       while(target > arr[end]){
        //  temp is our new start
        // temp ko start is liye nhi likha kyo ke jo (end-start+1) wala fomula hai is me bhi 
        //  wohi new start aa jata is liye . or fir humara ans wrong aata. 
        int temp = end+1;


        // end is our new end
        // double the size of the array 
        // previous end + (previous end-previous start+1)*2;
         end = end +(end-start+1)*2;
          start= temp;
       }
       return binarySearch(arr, target, start, end);
       
    }
    public static int binarySearch(int []arr, int target, int start, int end){
      while(start<= end){
        //   find midlle element 
        int mid= start +(end-start)/2;

        // for checking left side
        if(target < arr[mid]){
          end = mid-1;
        }else if(target > arr[mid]){
          start = mid+1;
        }else{
          //  found ans
          return mid;
        }
      }
      return -1;
    }    
} */
