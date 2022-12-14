// if list has only two nodes in the begnning 
//head.next = head  ki jo agni node hai uska next agr head ko point kr raha ho
 if(head.next.next == head){
// head ko head ki jo next node hai uspe rakh diya or purane wale 
// head ko return kr diya
     head = head.next;
     return head
 }
 
 Node p = head;
 // tmp ki last node tak pahuchne ke liye 
 while(p.next.next != head){
       p= p.next;
 }
 
// 
// exchange 1st and last node using head and tmp
  p.next.next = head.next;
  
  head.next = p.next;

  p.next = head;
  
  head = head.next;
return head;
}