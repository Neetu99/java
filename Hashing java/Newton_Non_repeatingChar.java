// First non-repeating character in a String 

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<>();

        for(int i=0; i<n; i++){
            char alpha = str.charAt(i);
            if(myMap.containsKey(alpha) == false){
                myMap.put(alpha, 1);
            }
            else {
                int count = myMap.get(alpha);
                myMap.put(alpha, count+1);
            }
        }

        char ans = '#';

        for(Map.Entry<Character, Integer> entry : myMap.entrySet()){
            if(entry.getValue() == 1){
                ans = entry.getKey();
                break;
            }
        }

        if(ans == '#')
            System.out.println(-1);
        else {
            for(int i=0; i<n; i++){
                if(str.charAt(i) == ans){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
