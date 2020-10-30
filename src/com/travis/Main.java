package com.travis;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1, "James");
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next = second; // Link first node with the second node
        second.next = third;
        linkedList.push(4);
        linkedList.append(5);
        linkedList.deleteNode(4);
        linkedList.printList();
    }

}

