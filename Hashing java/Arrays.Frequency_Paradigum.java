import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
 Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
 int []a = new int[n];
 for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
 } 

 HashMap<Integer, Integer> map = new HashMap<>();
  for(int i=0; i<n; i++){
      if(!map.containsKey(a[i]))
         map.put(a[i],1);

        else
            map.put(a[i], map.get(a[i])+1);
        
    }

    for(int i=0; i<n; i++){
        int freqI = map.get(a[i]);
        int j=0;
        for(j=i+1; j<n; j++){
            int freqJ = map.get(a[j]);
            if(freqI  <= freqJ){
                break;
            }
        }
       if(j >=n)
        System.out.print(-1+" ");
      else
        System.out.print(++j+" ");

    }

}
}