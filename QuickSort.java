/*public class QuickSort{
 public static void main(String args []){
    int arr[] = {5,9,11,3,1,4,7,0,9};
    int n = arr.length;
    // quick Sort calling
    quickRecursion(arr, 0, n-1);
    // print
    for(int i: arr){
        System.out.print(i+" ");
    }

 }*/
 /*public static void quickRecursion(int arr[], int start, int end){
  int pivot, i, j, temp;

  if(start<end){
    pivot = start;
    i= start;
    j=end;

    while(i<j){
        while(arr[i] <= arr[pivot] && i<end)
        i++;

        while(arr[j] > arr[pivot] && j>0)
        j--;
    
    if(i<j){
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
  } 
   temp = arr[pivot];
   arr[pivot] = arr[j];
   arr[j]= temp; 

quickRecursion( arr, start, j-1);

quickRecursion(arr, j+1, end);
}
}

}*/   