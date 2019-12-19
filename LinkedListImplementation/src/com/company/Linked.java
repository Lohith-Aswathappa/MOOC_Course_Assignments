package com.company;

import java.util.Calendar;

public class Linked {
    Node head;

    public Linked(int First){
        this.head = new Node(First);
    }

    public boolean insert(int data){
        Node atEnd = new Node(data);
        Node current = this.head;

        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        current.next= atEnd;
        System.out.println(current.data + " -> " + data + " -> NULL");
        System.out.println(data + " added to the tail. \n");
        return true;
    }

    public boolean remove(int d){
        Node current = head;
        if(current.data == d){
            this.head = current.next;
            current = this.head;
            System.out.println("First element is deleted \n");
            while(current.next != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println(current.data + " -> NULL");
        }else{
            while(current.next!=null){
                if(current.next.data==d){
                    current.next = current.next.next;
                    while(current.next != null){
                        System.out.print(current.data + " -> ");
                        current = current.next;
                    }
                    System.out.println(current.data + " -> NULL");
                    System.out.println("Success! Node with data "+d+" deleted. \n");
                    return true;
                }
                System.out.print(current.data + " -> ");
                current = current.next;
            }
        }
        return false;
    }

   /* public boolean remove(int data){
        Node Current = this.head;

        if(Current.data == data){
            this.head = Current.next;
            Current = this.head;
            System.out.println("First element is deleted \n");
        }else{
            while(Current.next != null){
                if(Current.data == data){
                    Node temp = new Node(0);
                    temp.next = Current.next;
                }
                Current = Current.next;
            }
        }


        /*while(Current.next != null){

        }
        return true;
    }*/

    public String toString(){
        Node current = this.head;
        while(current.next != null) {
            current = current.next;
        }
        return current.data + " is the last element in the list";
    }
}
