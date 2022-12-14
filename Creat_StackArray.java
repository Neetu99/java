/*package LinkedLList;

class Staack{
     int Stack[];
     int size;
     int top;
// creating constructuer
     Staack(int size){
       this.size = size;
       Stack = new int[size];
       top = -1;
     }


     void push(int value){
  // 1st check if stack is empty or not
    if(size+1 == top){
        System.out.println("stack is overflow");
        return;
    }else{
   
// in STACK FIRST WE INCRESE TH INDEX THAN PUT VALUE IN IT BECOZ IN BEGINING WE SET TOP AS -1;
      top = top+1;
      Stack[top] = value;
   } 
}
 // push end



// POP KE CONSTRUCTOR ME KOI VALUE NHI DALENGE BAS ISKO CALL KRNE SE HI YE VALUE KO POP YANI TOP KI VALUE KO DELETE KR DEGA
 
int pop(){
    // check if STACK IS EMPTY OR NOT
    // STACK SHOULDN'T EMPTY
    if(top ==-1){
        System.out.println("Stack is underFlow  can't pop");
        return -1;   
    }
    

    int delVal = Stack[top];
    --top;
    return delVal;
 }


int peek(){
    if(top ==-1){
        System.out.println("Stack is underFlow  , nothing is here");
        return -1;   
    }
    else{
        int delVal = Stack[top];
        return delVal;
    }
}

void printt(){
    if(top ==-1){
        System.out.println("Stack is underFlow  , nothing is here");
        return ;   
    }
    else{
        for(int i=top; i>=0; i--){
            System.out.println( Stack[i]);
        }
    }


}
}
public class Creat_Stack {

    public static void main(String[] args) {
     Staack myStack = new Staack(5);
       myStack.push(10);
       myStack.push(20);
       myStack.push(30);

       myStack.push(40);
       myStack.push(50);
       System.out.println( "poped elements");
      System.out.println( myStack.pop());
      System.out.println( myStack.pop());
      System.out.println("\n"+"rest elemets");
       myStack.printt(); 


    }
}
*/