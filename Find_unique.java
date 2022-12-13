  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr[] = new int[n];

for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
}

 HashMap<Integer, Integer> myMap = new HashMap<>();
 for(int j=0; j<n; j++){

     int k = arr[j];
     if(!myMap.containsKey(k)){
         myMap.put(k, 1);
     }else{
         int count = myMap.get(k);
         myMap.put(k, count+1);
     }
 }  

for(Map.Entry<Integer, Integer> ent : myMap.entrySet()){
    int c = ent.getValue();
    int l= ent.getKey();
    if(c==1){
        System.out.println(l);
    }
}
    
    }
}
