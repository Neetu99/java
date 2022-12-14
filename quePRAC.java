/*import java.util.*;
// import java.util.PriorityQueue;
public class quePRAC{ // 4 5 1 2 3 
static void solve(int []arr){
    int reqDisk = arr.length;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
    for(int i =0; i<arr.length; i++){
        pq.offer(arr[i]);

// BUILDING TOWER
        int ori=reqDisk;
        int chaankna = pq.peek();
        while(!pq.isEmpty() && reqDisk == pq.peek()){
            System.out.print(pq.poll()+" ");
           reqDisk--;
        }
        System.out.println();
    }
    } // method end
    
    public static void main (String[] args) {
        // Your code here
     Scanner sc = new Scanner(System.in);
     int n = 5;

     int arr[] = {4,5,1,2,3};

     solve(arr);
    }
}*/