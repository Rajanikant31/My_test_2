package com.company;
public class Main
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static Main add(Main list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }


    public static void printList(Main list)
    {
        Node currNode = list.head;
        System.out.print("Display Linked List: ");
        while (currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args)
    {

        Main list = new Main();
        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 5);
        list = add(list, 6);
        list = add(list, 7);
        list = add(list, 8);
        printList(list);
    }
}
