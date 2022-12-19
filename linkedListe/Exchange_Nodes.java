/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static Node exchangeNodes(Node head) {
    //Enter your code here
     // list has two elements 
     if(head.next.next == head){
         head.next = head;
         return head;
     }
    
    Node tm = head;
    while(tm.next.next !=head){
      tm = tm.next;
    }
    
    //exchange 1st and last node
    // tm and head
    tm.next.next = head.next;
      head.next = tm.next;
    
      tm.next = head;
      head = head.next;
    
      return head;
    }
