/*import java.util.HashMap;
//import java.util.*;
public class SubArry {
    public static void main(String []args){
       int []arr = {10,15,-5,15,-10,5};
     //  int sum = 5;
       int n = arr.length;
        subArray(arr, 5, n);

    }
    static void subArray(int []arr, int sum, int n){
       int curSum = 0;
       int start=0;
       int end = -1;
       HashMap<Integer, Integer> ved = new HashMap<>(); 
       for(int i=0; i<n ; i++){
        
        curSum += arr[i];
        
        if(curSum - sum == 0){
            start =0 ;  end = i;
            break;
         }
        //  10,15,-5,15,-10,5
        if(ved.containsKey(curSum - sum)){
           start = ved.get(curSum - sum)+1;
           end = i ; break;
        }

        ved.put(curSum , i);
    }
        if(end == -1){
            System.out.println(" not found");
        }else{
            System.out.println(start + " , "+ end);
        }
    }
    
}*/
