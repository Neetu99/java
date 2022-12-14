/*public class Binary_Letter {
        public static void main(String[]args){
          char[]arr ={'c','e','g','j','k'};
          char ceilingOf= 'f';
          char pong = CeilingOfLetter(arr, ceilingOf);
           System.out.println(pong);    
        }
        static char CeilingOfLetter(char[]arr, char ceilingOf){
            int start =0;
            int end= arr.length-1;
            while(start<=end){
                int mid= start+(end-start)/2;
                
                if(arr[mid] <= ceilingOf ){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }
            // start % arr.length kr ke wapis se start jaha hai wohi index aa jayega.. value ko wrap kiya hai.. Kunaal kuswaha ka 2nd binary lecture dekhe  
            return arr[start% arr.length];
        }
    }*/
    
