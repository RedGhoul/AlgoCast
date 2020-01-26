package com.stephengrider.problems;

public class CircularLinkedList {

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
        node6.setNext(node2);

        System.out.println(CircularLinkedList.isCircular(head));

    }

    /*
    * Your doing the same thing here that you would do if you were finding the mid
    * point of a linked list. Except that you have a different set of conditions to act on.
    * In this case it is going to be if the data in both P1 and P2 are the same.
    * And the while loop should only focus on weather or not P1 or P2 is null
    * if it end up being null then you know your not in a loop
    * */
    public static boolean isCircular(Node head){
        Node P1 = head;
        Node P2 = head;

        while(P1 != null || P2 != null){
            P1 = P1.getNext();
            P2 = P2.getNext().getNext();
            if(P1.getData().equals(P2.getData())){
                return true;
            }
        }

        return false;
    }

}
