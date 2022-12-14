/*class Node{
    int data;
    Node next;
    // constructer banaya ki data main se consturer me sidha fillkiya ja ske
    Node(int data){
        this.data = data;
    }
}
class CircularLinkedList{
    private Node head;

    //1st check if list is empty or not 
    boolean isEmpty(){
     return head == null;
    }
    
    //2 push begin Method 
    void pushBegin(int data){
// creat new Node 
   Node newNode = new Node(data);
    if(isEmpty()){
        head = newNode;
        head.next = head;
    }else{
      Node temp = head;
      while(temp.next != head){
         temp = temp.next;
      }
      temp.next = newNode;
      newNode.next = head;
      head = newNode;

    }

    } // push begin end


    int poplast(){
     if(isEmpty()){
        System.out.println("Error !! ");
        return -1;
     }
// if list has only one 
    
    while(head.next == head){
        int delVal = head.data;
        head = null;
        return delVal;
    }
 // 

    }
}
public class practicCirculer{
  
  
    public static void main(String[] args) {
        

    }
}*/