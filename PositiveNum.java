public class PositiveNum {
    // problem is ;-  find the missing positive number in the array ; 
   public static void main(String []args){
    int []arr = {-2,4,-4,6,7,3,-5,8};

    // print values
    System.out.print(MissingPositiveNum(arr));  
  }
static int MissingPositiveNum(int arr[]){
  //  if array length is not so long
  if(arr.length ==0){
    return 1;
  }
  int n = arr.length;
  int i=0;
  // while loop 
  while(i<arr.length){
    // three condition inside of if
    // arr[i] agr 0 se bada hai to.  -2,4,-4,6,7,3,-5,8 
    // arr[i] array ki length se chhota hai to.   -2, 11, 1, -3, 2, 10, 4      
    //  arr[i] agr ka agla element pichhle wale se match nhi karta , yuni equal nhi hai to 
    //  arr[i] != arr[arr[i]-1]; duplicate elements ke liye
    if((arr[i]>0 ) && (arr[i]< n)  && (arr[i] != arr[arr[i]-1])){
      //   taking indx
      int otherIdx= arr[i]-1;
      // swapint the elements
      int temp = arr[i];
      arr[i]   = arr[otherIdx];
      arr[otherIdx] = temp;
    
    }else{
      i++;
    }
}
// checking and comparing indx with element
for(int p=0; p<arr.length; p++){
  if(arr[p] != p+1){
    return p+1;
  }
}
// this return is for if array is sorted and all elements is at there specific position 
//  than return next value of the presents elements inside the array...
return arr.length+1;
}        
}
