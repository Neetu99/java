/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
    // return the head of the modified linked list
Node pre = head;
Node cur = pre.next;
Node post = null;
if(cur!=null){
    post = cur.next;
}
while(cur != null){
  cur.next = pre;
  pre = cur;
  cur = post;
  if(post!=null){
  post =post.next;
  }
}
head.next = null;
head = pre;

return head;
}
