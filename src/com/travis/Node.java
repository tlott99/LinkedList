package com.travis;

public class Node {
    int data;
    String name;
    int height;
    Node next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
    Node(int d) {

        data = d;
        name = "James";
        height = 73;
    }
    Node(int d, String name){
        data = d;
        this.name = name;
    }
    Node(int d, String name, int height){
        data = d;
        this.name = name;
        this.height = height;
    }
    Node(){
        data = 0;
        name = "";
        height = 0;
    }
}
