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
static int countNode(Node head){
    int count =0;
    while(head != null){
        count++;
        head = head.next;
    }
    return count;
}

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
int mid;
if(head == null){
    return head;
}

if(head.next == null){
    head.val = -1;
    return head;
}
Node tempHead = head;
// calling function here 
int count =  countNode(head);
 mid= count/2;
 while(mid>1){
     
     head = head.next;
     mid--;
 }


 head.next = head.next.next;
 return tempHead;

    }