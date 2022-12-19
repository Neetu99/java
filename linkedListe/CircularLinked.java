     class Node{
            int data;
            Node next;
        
            Node(int data){
                this.data = data;
            }
        }
          
        class CircularLinkedList{
            Node head;
        
            void pushLast(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    head.next = head;
                }
                else {
                    Node temp = head;
                    while(temp.next!=head){
                        temp = temp.next;
                    }
        
                    temp.next = newNode;
                    newNode.next = head;
                }
            }
        
            void pushBegin(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    head.next = head;
                }
                else {
                    Node temp = head;
                    while(temp.next!=head){
                        temp = temp.next;
                    }
        
                    temp.next = newNode;
                    newNode.next = head;
                    head = newNode;
                }
            }
        
            int popLast(){
        
                //List is empty
                if(head == null){
                    System.out.println("Error: List is Empty!!");
                    return -1;
                }
        
                //List contains single element
                if(head.next == head){
                    int delValue = head.data;
                    head = null;
                    return delValue;
                }
        
                //Rest of the cases
                Node temp = head;
            // temp ko last node se pahle k 3rd node pe hi rok lenge
                while (temp.next.next != head){
                    temp = temp.next;
                }
        
                int delValue = temp.next.data;
                temp.next = head;
                return  delValue;
            }
        
            int popBegin(){
                //List is empty
                if(head == null){
                    System.out.println("Error: List is Empty!!");
                    return -1;
                }
        
                int delValue = head.data;
                head = head.next;
                popLast();
                return delValue;
            }
        
            boolean isEmpty(){
                return head == null;
            }
        
            void print(){
                if(isEmpty()){
                    return;
                }
                Node temp = head;
                do{
                    System.out.print(temp.data + " --> ");
                    temp = temp.next;
                }while(temp != head);
                System.out.println();
            }
        }
        
       public  class Class_3CircularLinked{
            public static void main(String[] args) {
        
                CircularLinkedList myList = new CircularLinkedList();
                myList.pushLast(10);
        //        myList.pushLast(20);
        //        myList.pushLast(30);
        //        myList.pushBegin(50);
        //        myList.pushBegin(60);
                myList.print();
        
                myList.popLast();
                myList.popBegin();
        
                myList.print();
            }
        }