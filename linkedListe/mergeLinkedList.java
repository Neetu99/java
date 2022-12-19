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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
    //Enter your code her e       ___
    if(head1==null) return head2;
    if (head2 == null) return head1;
    
    Node dumy = new Node(0);  // [ | ]
    Node cur = dumy;
    
    while( head1 != null  && head2 != null ){
      // cheack and compare the values here
         if(head1.val <= head2.val){
             cur.next = head1;
              head1 = head1.next;
         }else{
             cur.next = head2;
             head2 = head2.next;
         }
    
         // increase cur here like temp
         cur = cur.next;
    }
    // for rest of the nodes 
    if(head1 != null) cur.next = head1;
    if(head2 != null ) cur.next = head2;
    
    return dumy.next;
    }