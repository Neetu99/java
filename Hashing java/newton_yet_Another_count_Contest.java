import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" ---> "+entry.getValue());
        }*/
class main {
    //get list and the key whom we have to search for.
    static int search(ArrayList<Integer> list, int key){
        int left = 0;
        int right = list.size()-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(list.get(mid) == key)
                return mid;
            else if(key > list.get(mid))
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(a[i]-i)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(a[i]-i, list);
            }else{
                ArrayList<Integer> temp = map.get(a[i]-i);
                temp.add(i);
                map.put(a[i]-i, temp);
            }
        }
        //search in the maps list...
        //search using Binary Search method;
        long totalPairs = 0;
        //int count = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            int diff = a[i]-i;
            ArrayList<Integer> list = map.get(diff);
            int index = search(list, i);
            if(index != -1){
                count = list.size()-index-1;
            }
            if(count > 0)
                totalPairs += count;
        }
        System.out.println(totalPairs);

    }
}