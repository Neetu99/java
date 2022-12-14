import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   HashMap<String , Integer> myMap = new HashMap<>();
     for(int i=1; i<=n; i++){
     String s = sc.next();
      if(!myMap.containsKey(s)){
          myMap.put(s, 1);
      }else{
    myMap.put(s, myMap.getOrDefault(s,0)+1);

      }
     } // lop end
int count =0;
     for(Map.Entry<String, Integer> om : myMap.entrySet()){
         String k =  om.getKey();
         int val  =  om.getValue();

        if(val >1){
            count ++;     
        }
     }
        System.out.println(count);

    } 
    }
