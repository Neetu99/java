public class Search2_D{ 
    //  min value of each colomn  
     public static void main(String []args ){
 int [][] arr ={{10, 20, 30, 40},{15, 25, 35, 45},{28, 29, 37, 49},{33, 34, 38, 50}};
  int target = 37;
/*      for( int i =0; i<arr.length; i++){
        int min = arr[i][0];
        for(int o= 0;o<arr.length; o++){
            if(min  > arr[i][o]){
                min = arr[i][o];
            }
        }
        System.out.println(i+ " min ="+ min)
      }*/ int o =0;
       for(int i =arr.length-1; i>0; i--){
        for(o=0; o<arr.length; o++){
            if(arr[o][i] == target)
              break;
         
        }
       }
       System.out.println(o+ " taget ="+ target );

    }
}