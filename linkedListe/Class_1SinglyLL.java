// package LinkedLList;
           class Node{
            int data;
            Node next;
        
           Node(int data){
                this.data = data;
            }
        }
        
        class LinkedList{
            private Node head;
//  push method for putting element         
            void push(int data){
                Node newNode = new Node(data);
        
                if(head == null){
                    head = newNode;
                }
                else{
                    Node temp = head;
            // temp apni next node krte krte last wali nod pe ruk jaye is liye temp. next likha while loop me
                    //goto Last node
                    while(temp.next != null){
                        temp = temp.next;
                    }
        
                    //connect last node to newNode
                    temp.next = newNode;
                }
            }
  
 // pop method
            
            int pop(){
        
                //List is empty
                if(head == null){
                    System.out.println("Error: List is Empty!!");
                    return -1;
                }
        
                //List contains single element
                if(head.next == null){
                    int delValue = head.data;
                    head = null;
                    return delValue;
                }
        
                //Rest of the cases
                Node temp = head;
                while (temp.next.next != null){
                    temp = temp.next;
                }
        
                int delValue = temp.next.data;
                temp.next = null;
                return  delValue;
            }
        
            boolean isEmpty(){
        //        if(head == null)
        //            return true;
        //        else
        //            return false;
                return head == null;
            }
        
            void print(){
                Node temp = head;
    // TEMP APNI NEXT WALI NODE k upr point krta jayega yaha wale loop ke acoding
                while(temp != null){
                    System.out.print(temp.data + " --> ");
                    temp = temp.next;
                }
                System.out.println(temp);
            }
        }
        
        public class Class_1SinglyLL {
            public static void main(String[] args) {
                LinkedList myList = new LinkedList();
                System.out.println(myList.isEmpty());
                myList.push(10);
                myList.push(20);
                myList.push(30);
                myList.push(40);
                myList.print();
        
                System.out.println(myList.pop());
                myList.push(100);
                myList.print();
                System.out.println(myList.pop());
                System.out.println(myList.pop());
                System.out.println(myList.pop());
                System.out.println(myList.pop());
                System.out.println(myList.pop());
        
                System.out.println(myList.isEmpty());


            } // main end
        
        }  // class end 