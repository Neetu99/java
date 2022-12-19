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
public static Node ReverseAlternateK(Node head,int k){
    //enter your code here
    Node temp = head;
    Node ansHead = null;
    Node ansTail = null;
    
    while(temp!=null){
        //Rev
        Node revHead = null;
        Node revTail = null;
        for(int i=0; i<k && temp!=null; i++){
            if(revHead == null){
                revHead = temp;
                revTail = temp;
                temp = temp.next;
            }
            else{
                Node cur = temp;
                temp = temp.next;
                cur.next = revHead;
                revHead = cur;
            }
        }

        if(ansHead == null){
            ansHead = revHead;
            ansTail = revTail;
        }
        else{
            ansTail.next = revHead;
            ansTail = revTail;
        }

        ansTail.next = temp;
        
        //Non-Rev
        // 4 times
        for(int i=0; i<k && temp!=null; i++){
            ansTail = temp;
            temp = temp.next;
        }
    }

    // head = ansHead;
    // return head;
    ansTail.next = null;
    return ansHead;
 }
