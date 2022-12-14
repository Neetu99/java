public class prass {
    public static void main(String []args){
        int a[] = {4,7,2,8,4};
        int n=a.length;

        divide(a, 0, n-1);
    }
    static void divide(int []a, int st, int ed){
        int piv_idx = partition(a, st, ed);
    
    if(st<= piv_idx-1){

        // left
        divide(a, st, piv_idx-1);
    }
    if(piv_idx < ed){
        // rigth
        divide(a, piv_idx, ed);
    }

    prin(a);
    
    }
    static int partition(int a[], int st, int ed){
  
        int i=st ;
        int j=ed;
        int pivot  = a[(st+ed)/2];
        
        while(i<j){
        while(a[i] < pivot){
            i++;
        }
        while(a[j] > pivot){
            j--;
        }
     
      if(i<j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      }
    }
     return i;
    }

static void prin(int []a){
    for(int l=0; l<a.length; l++){
        System.out.print(a[l] +" ");
    }
}

}
