package com.stephengrider.problems;
// --- Directions
// Given a linked list, return the element n spaces
// from the last node in the list.  Do not call the 'size'
// method of the linked list.  Assume that n will always
// be less than the length of the list.
// --- Examples
//    const list = new List();
//    list.insertLast('a');
//    list.insertLast('b');
//    list.insertLast('c');
//    list.insertLast('d');
//    fromLast(list, 2).data // 'b'
public class FromLast {
    public static void main(String[] args){
        Node head = new Node("11", null);
        Node node1 = new Node("22", null);
        Node node2 = new Node("33", null);
        Node node3 = new Node("44", null);
        Node node4 = new Node("55", null);
        Node node5 = new Node("66", null);
        Node node6 = new Node("77", null);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        System.out.println(FromLast.getFromLast(head,2));
    }

    //Assuming that spaces is never going to be greater then the actual size
    public static String getFromLast(Node head, int spaces){
        Node P1 = head;
        Node P2 = head;

        for(int i =0; i < spaces; i++){
            P2 = P2.getNext();
        }

        while(P2.getNext() != null){ // we do this getNext instead of P2 != null
            // since we don't want to do another "P1 = P1.getNext();" which would throw
            // off the count other wise
            P2 = P2.getNext();
            P1 = P1.getNext();
        }

        return P1.getData();

    }
}
