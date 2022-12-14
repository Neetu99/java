/*import java.util.*;
public class basic{
    public static void main(String []arg){
       Scanner sc = new Scanner(System.in);
    System.out.println("Put n here");
        int n= sc.nextInt();                          
    System.out.println("Put m here");
        int m= sc.nextInt();
// 3 4
// 1 4 7
// 1 3 3 9   
                                                
                                                

        int arr1[] = new int[n];
        int arr2[]= new int[m];
    
    System.out.println("Put elements of arr1 here");
        for(int e=0; e< n; e++){
            arr1[e]= sc.nextInt();

        }

    System.out.println("Put elements of arr2 here");
        for(int k=0; k<m; k++){
            arr2[k]=sc.nextInt();
        }

    // creating temp array
        int temp[]= new int[n+m];

// calling function
        merge(arr1, arr2, temp, n, m);
// printing temp array
        for(int p=0; p<temp.length; p++){
            System.out.print( temp[p]);
        }
    }
    public static void merge(int arr1[], int arr2[], int temp[], int n, int m){
    //   initializing 
    int i=0;
    int j=0;
    int x=0;
// ye he  i<=n pe aya tha array out of bound exception
    while(i < n &&  j < m){
        if(arr1[i] < arr2[j]){
            temp[x] = arr1[i];
            x++;
            i++;
        }else{
            temp[x] = arr2[j];
            x++;
            j++;
        }
    }
while(i < n){
    temp[x] = arr1[i];
    x++;
    i++;
}

while(j < m){
    temp[x] = arr2[j];
    x++;
    j++;
}

 }
}*/