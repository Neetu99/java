//Increasing Frequency Sort

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Increasing_Frequency_Sort {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Num --> Count Pair
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(!freq.containsKey(num)){
                freq.put(num, 1);
            }
            else {
                int count = freq.get(num);
                freq.put(num, count+1);
            }
        }

//tree set will give will store the value in ascending order
        //Count --> Numbers(List<Num>) Pair
        TreeMap<Integer, ArrayList<Integer>> freqRev = new TreeMap<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){

            int count = entry.getValue();
            int num = entry.getKey();

            if(!freqRev.containsKey(count)){
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(num);
                freqRev.put(count, nums);
            }
            else {
                ArrayList<Integer> nums = freqRev.get(count);
                nums.add(num);
                freqRev.put(count, nums);
            }
        }

        //Print freRev
        
        for(Map.Entry<Integer, ArrayList<Integer>> entry : freqRev.entrySet()) {
            int count = entry.getKey();
            ArrayList<Integer> nums = entry.getValue();
             Collections.sort(nums, Collections.reverseOrder());
            for(int i=0; i<nums.size(); i++){
                int num = nums.get(i);
                for(int j=0; j<count; j++)
                    System.out.print(num + " ");
            }
        }
    }
}
