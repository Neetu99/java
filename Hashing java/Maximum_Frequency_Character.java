import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    String S = sc.next();
    HashMap<Character, Integer> myMap = new HashMap<>();
    for(int i=0; i<S.length(); i++){

        if(!myMap.containsKey(S.charAt(i))){
            myMap.put(S.charAt(i), 1);
        }else{
       int count = myMap.get(S.charAt(i));
           myMap.put(S.charAt(i), count+1);
        }
    }
    int val =0;
    int max = Integer.MIN_VALUE;
    char ch='0';
    
    
for(Map.Entry<Character, Integer> om : myMap.entrySet()){
    val = om.getValue();
   
    if(val >max){
         ch = om.getKey();        
         max = val;

      }
}

 if(max > val){
    System.out.println(ch);
}else{
    System.out.println(-1);
}

}
}