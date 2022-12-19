/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteDuplicates(Node head) {
    //complete this function
    Node temp = head;
    while(temp.next != null){
       
       if(temp.val == temp.next.val){
           temp.next = temp.next.next;
        
              if(temp.next == null){
                return head;
              }
           temp.next.prev = temp;     
       }else{
          temp = temp.next;
       }
    
    } // while end
    return head;
    }
