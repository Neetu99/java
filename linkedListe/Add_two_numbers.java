/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

static Node addNumber(Node first, Node second){
    // return the head of the modified linked list
    // taking here blank nodes 
    Node ahead = null;
    Node atail = null;
    int  carry = 0;
    
    // if first node null ko point na kr rahi ho 
    // sec node null ko point na kr rahi ho 
    while(first != null || second != null){
    
      // agr firt node null ko nhi point kr rahi hai to us node ka data int x me daal do
    int  x = first != null ? first.data: 0; 
      
    
    // agr second node null ko popint nhi kr rahi hai to us node ka data y me daal do 
       int  y = second != null ? second.data : 0; 
    
    //          1 2 3 4         4 5 6 4 3 
    // fst node = 4 3 2 1    sec = 3 4 6 5 4
    // jo  1 2 3 4 hai ye already reverse hai backend me isme  4 3 2 1 
    //  yaha  x first node ke starting se elements lega 
    // yaha y sec node ke starting se element lega ye 
     int sum = x + y + carry;
      // 1 4 ka 4 lkhte hai or jo agla num hota hai usko cary kr ke age le jate hai
     
     int num = sum%10;
     // modulo ke ke pichla store krenge 
      carry = sum/10;
     // divide kr ke pichla uda denge or or agla 1 mil jayega or carry kr lenge
    
     Node newNode = new Node(num); // pichla wala dal denge node me 
     // or isko head point krwa denge 
     if(ahead == null){
       ahead= newNode;
       atail = newNode;
     // ab dono new node ko point krne lage
     } else{
       // tail ko ab age age move krwayege  
       // tail me new next node jo ki(newNode banya) ka address dala hai
       atail.next= newNode;
       // yaha tail ko new Node point krwa rahe hai .. 
       // asie hi new Nod banate jayenge or element dalte jayege or tail ko age badhate jayege
       atail = newNode;
     }
    // fst ka ek starting wala x me daal chuke hai // ab first ko uski agli node point krwa denge
    if(first != null)
        first = first.next;
    // second ka ek starting wala y me daal chuke hai to ab second ko second ka agla element point krwa denge
    if(second != null )
        second = second.next;
    
    } // while loop end 
    
    if(carry>0){
      Node newNode = new Node(carry);
      atail.next = newNode;
      atail = newNode;
    }
     return ahead;
    }
