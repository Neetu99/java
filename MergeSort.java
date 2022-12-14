/*public class MergeSort{
  //  (n log n) is the time complexity 
    public static void main(String[]args){
     int []arr = {6,3,9,5,2,8}; 
     int n = arr.length;

     divide(arr, 0, n-1);  
    //  print
    for(int i=0; i< n ; i++){
       System.out.print(arr[i]+" ");
    }
    System.out.println();
    }

   public static void divide(int arr[], int s, int e){
        if(s>=e){
          return;
        }  
 
       int mid =s+(e-s)/2;
       // left side 
        divide(arr, s, mid);

        // right side 
        divide (arr, mid+1, e);

      conquer(arr, s, mid, e);
      }

    public static void conquer(int arr[], int s, int mid, int e){

      // new array creat kiya          time compexity   O(n)
      int merge[]= new int[ e - s + 1];
      int id_1=s;
      int id_2= mid+1;
      int x=0;
      while(id_1<= mid && id_2 <= e){      
        if(arr[id_1]<= arr[id_2]){
          
          merge[x++]= arr[id_1++];
         }
        else {
          merge[x++]= arr[id_2++];
          // 3
        }
      }
      
      while(id_1 <= mid){
        merge[x++]= arr[id_1++];
        
      }
      while(id_2 <= e){
        merge[x++]= arr[id_2++];
      }
      for(int i=0, j=s; i< merge.length; i++,j++){
         arr[j]=merge[i];
      }
    }
  }*/