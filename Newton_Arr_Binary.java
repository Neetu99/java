/*public class Newton_Arr_Binary {
    //  mountain array is also known as Bitonic array ;
    //  Mountain array find the largest element ;
   // problem is it is not giving out put ..  how to get answer

    public static void main(String []args){
   int []arr = {0,1,2,4,6,2,1,0};

   int start =0;
   int end = arr.length-1; 
//   find mid
int mid = start +(end-start)/2;

while(start< end){


if(arr[mid]> arr[mid+1]){
   //  it basically mean you are in the descending part of the array 
   // 
   end = mid;
}else {
   // it mean you are in the ascending order array
   start = mid +1;
}
}
System.out.println(start);


//  loop will break when start will point the same element.  loop will break 
//  hence you can return start or end both will point the same element;
    }
    
}*/
