/*class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class DoublyList{
    private Node head;

  void pushLst(int val){
     Node  newNode = new Node(val);
    if(head == null){
        head = newNode;
    }
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
  }

  void print(){
        
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val + " --> ");
        temp = temp.next;
    }
    System.out.println(temp);
    }
}

public class prctis {
    public static void main(String args[]){

    DoublyList myList = new DoublyList();

    myList.pushLst(1);
    myList.pushLst(2);
    myList.pushLst(2);
    myList.pushLst(3);
    myList.pushLst(4);
    myList.pushLst(5);
    myList.pushLst(5);
    myList.pushLst(6);
    myList.print();


    }
}*/
