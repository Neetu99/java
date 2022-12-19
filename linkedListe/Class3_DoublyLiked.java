// package main.linkedList.doublyLinkedList;
 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class DoublyLinkedList{
    private Node head;
    private Node tail;

    boolean isEmpty(){
        return (head == null && tail == null);
    }

    void pushLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void pushBegin(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    int popLast(){
        //List is empty
        if(isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if(head!= null && head == tail){
            int delVal = tail.data;
            head = null;
            tail = null;
            return delVal;
        }

        int delVal = tail.data;
        tail = tail.prev;
        tail.next = null;
        return delVal;
    }

    int popBegin(){
        //List is empty
        if(isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if(head!= null && head == tail){
            int delVal = tail.data;
            head = null;
            tail = null;
            return delVal;
        }

        int delVal = head.data;
        head = head.next;
        head.prev = null;
        return delVal;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class DoublyLiked2_Class {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.pushLast(10);


        myList.print();

        System.out.println(myList.popBegin());
        System.out.println(myList.popLast());
        myList.print();

        

    }
}