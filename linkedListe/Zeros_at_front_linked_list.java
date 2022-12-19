/*
class Node{
    int data;
    Node next;
    Node(int d){   
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
       // Your code here
    //here we are creating newLinked List head pointer 
    // here we consider zero as head and nonZeros as onther list head
       Node Zero =null;
       Node nonZero = null;
// this one will treverse old list from head to tail
Node i=head;

// j wala zero number wali linked list store krega
Node j=null;
// k wala nonZeros ko store krega
Node k = null;

while(i != null){
   int ved = i.data;
   Node newNode = new Node(ved);
//  1st check if ved == 0; than inside of this if condition
if(ved ==0){
       if(Zero == null){
          Zero = newNode;
          j= Zero;
        }else{
            j.next = newNode;
            j = newNode;
        }
}else{
        if(nonZero == null){
            nonZero = newNode;
            k = newNode;
         }else{
            k.next = newNode;
            k= newNode;
    }
}
    i = i.next;
}
if(j!= null){
    j.next = nonZero;
    head = Zero;
}else{
    head = nonZero;

}
return head;
}
