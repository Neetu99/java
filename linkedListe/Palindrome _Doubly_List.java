/*
class Node
{
   char data;
   Node next, prev;
}; sir ne krwaya
// doubly linked list */
static boolean isPalin( Node left)
{
// new node bana ke hum ryt pointer ko last tak leke jayenge
Node right = left;
// right ko last tak leke jane ke liye loop
// right ka ko next wala box hai wo jab tak null ka na point krne lage tab tk age badho
while(right.next != null){
   right = right.next;
}

while( right != null  && left != null){
 if(left.data != right.data){
    return false;
 }
// ryt wale ko piche late jayenge .  ryt.prev
 right = right.prev;
// left ko age krte jayenge
 left = left.next;
}

return true;
}
