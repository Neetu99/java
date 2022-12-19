/* class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteK(Node head_ref, int k){
    //Enter your code here
    Node head = head_ref;
    // agr head null hai to 
    if(head == null)
       return null;
    
    //===============
    // cur ko head  || or prev = null;
    Node cur = head ;
    Node prev = null;
    while(true){
                if((cur.next == head) &&( cur == head  ))
                break;
                printList(head);
    
                for(int i=0; i<k; i++){
                // previous ko age badhate huye previous ko curr node pe point krwaya
                // curr wali ko  curr ki next node
                    prev = cur;
                    cur = cur.next;
                } // for end
    
            if(cur == head){
                
                prev = head;
                while(prev.next  != head)
            // ye tabhi run hoga agr prev ki next head node ko point na krne lage    
                prev = prev.next;
                head = cur.next;
                prev.next = head;
                head_ref = head;
            }else if(cur.next == head){
                prev.next = head;
            }else {
                prev.next = cur.next;
            }        
    } // while loop end
     
     return head;
    } // method end
    static void printList(Node head){
       if(head == null)
           return;   
    
    Node temp = head;
    
    do{
       System.out.print( temp.data + "->");
       temp = temp.next;
    }
    
    while( temp != head);
      System.out.println(head.data);
    }