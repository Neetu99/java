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
public static Node Reverse(Node head) {
    if(head == null){
        return head;
    }
    // pre  curr  post 
   //complete this function
       Node pre = head;
       Node cur = pre.next;
     //  if in case list has only one NOde
       Node post = null;
   
       if(cur != null){
         post = cur.next;
       }
       
       while(cur != null){
         cur.next = pre;
         pre = cur;
         cur = post;
         if(cur != null){
           post = post.next;
         }
       }
       // head ko 1st se hata ke last pe set krenge 
        head.next = null;
        head = pre; 
   
   return head;
   }
