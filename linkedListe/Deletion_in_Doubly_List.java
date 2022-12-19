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
public static Node deleteElement(Node head,int k) {
    //enter your code here
    Node slow = head;
    Node fast = head;
    // k ko km krte jayenge or fast ko jitna k given hai utna age 
    // badha denge k ==1 ho jayega tab loop brek kremhe or fst ko age krte jayenge
    while(k-->0){
        fast = fast.next;
    }
    // if fast == null agr fst null tak chala gya to it mean have to retun 1 node or head ko retun kr denge kyo ki usne 1 node ko delete krne ko bola hai
     if(fast == null){
         slow = slow.next;
         return slow;
     }
     while(fast.next !=null){
        slow = slow.next;
        fast = fast.next;
    
     }
     slow.next = slow.next.next;
     return head;
    
    }
