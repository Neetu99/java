/*import java.util.*;
public class Squred {
    
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("put n here");
        int n= sc.nextInt();
        int []arr = new int[n];

        // puting elements 
        System.out.println("put arry elements");
           for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
          }   


       int pos =0;
       while(pos<n  && arr[pos] <0){
              pos +=1;
        }
     
        int neg = pos-1;
       int []sortSqr = new int [n];
       int count=0;

while(neg>=0  && pos <n){
    if(arr[neg]*arr[neg]  < arr{[pos]*arr[pos]){
        sortSqr[count] = arr[neg]*arr[neg];
        neg -=1;
    }else{
        sortSqr[count] = arr[pos]*arr[pos];
        pos+=1;
    }
    count+=1;
}

while(neg>=0){
    sortSqr[count] = arr[neg]*arr[neg];
    neg -=1;
    count+=1;
}

    while(pos<n){
    sortSqr[count] = arr[pos]*arr[pos];
    pos+=1;
    count+=1;
}

for(int j=0; j<n; j++){
    System.out.print(sortSqr[j]+" ");
*/


    
    

