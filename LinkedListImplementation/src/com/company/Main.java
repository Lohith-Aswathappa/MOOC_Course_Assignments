package com.company;

public class Main {

    public static void main(String[] args) {
        Linked newNode = new Linked(60);
        newNode.insert(15);
        newNode.insert(4);
        newNode.insert(54);
        newNode.insert(57);

        newNode.remove(5);

        //System.out.println(newNode);
    }
}
