/*class Node {
    Node next;
    int val;

    Node(int val) { 
        this.val = val;
        next = null;
    }
}
*/


public static Node addElement(Node head, int val) {
    //enter your code here
        //   int val;
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
          return head;  
    // Node newNode = new Node(val);
    
    }
