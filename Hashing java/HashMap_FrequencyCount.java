// package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_FrequencyCount {
    public static void main(String[] args) {
        int a[] = {1, 7, 10, 1, 7, 7, 9};
        int n = a.length;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = a[i];
// storing num as a key here
// num which is we take as key isn't(!) stored in our map than put it;
 //look at else part map.get() will take value against the key and give it;
            if(!myMap.containsKey(num)){
                myMap.put(num, 1);
            }

            else {
                int count = myMap.get(num);
                myMap.put(num, count+1);
            }
        }
// in Map for printing or for itration we use for each loop  
// for each loop like for(int a: arr)
           
        for(Map.Entry<Integer, Integer> entry :  myMap.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

    }
}
