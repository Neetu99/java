import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t>0){
     int n = sc.nextInt();
     int k = sc.nextInt();

     HashMap<Integer, Integer> myMap = new HashMap<>();
     for(int i=0; i<n; i++){
         int a = sc.nextInt();
         myMap.put(i,a);
     }
      boolean flag = false;
      for(int j=0; j<n; j++){
        
        int h = k-myMap.get(j);
        if(myMap.containsValue(h) &&  h!= myMap.get(j)){ 
        flag = true;
        break;
      }
      }
      if(flag)  System.out.println(1);
      else System.out.println(0);
    t--;
    }
    
    
    }
}
