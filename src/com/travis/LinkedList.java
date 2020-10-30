package com.travis;

public class LinkedList {
    Node head; // head of the list

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {

    }


    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " " + node.name + " " + node.height + " ");
            node = node.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void push(int data,String name) {
        Node newNode = new Node(data, name);
        newNode.next = head;
        head = newNode;
    }
    public void push(int data,String name, int height) {
        Node newNode = new Node(data, name, height);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node previousNode, int data) {

        if (previousNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = previousNode.next;

        previousNode.next = newNode;
    }

    public void append(int data) {

        Node newNode = new Node(data);


        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;


        Node last = head;
        while (last.next != null)
            last = last.next;


        last.next = newNode;
        return;
    }

    void deleteNode(int key) {

        Node temporaryNode = head, previousNode = null;

        if (temporaryNode != null && temporaryNode.data == key) {
            head = temporaryNode.next; // Changed head
            return;
        }


        while (temporaryNode != null && temporaryNode.data != key) {
            previousNode = temporaryNode;
            temporaryNode = temporaryNode.next;
        }

        if (temporaryNode == null) return;


        previousNode.next = temporaryNode.next;
    }
}
