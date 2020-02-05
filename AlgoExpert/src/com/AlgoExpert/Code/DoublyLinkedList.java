package com.AlgoExpert.Code;

public class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if(this.head == null){
                this.head = node;
                this.tail = node;
                return;
            }
            insertBefore(head,node);
        }

        public void setTail(Node node) {
            if(this.tail == null){
                setHead(node);
                return;
            }
            insertAfter(tail,node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if(nodeToInsert == head && nodeToInsert == tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if(node.prev == null){
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if(nodeToInsert == head && nodeToInsert == tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if(node.next == null){
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if(position == 1){
                setHead(nodeToInsert);
                return;
            }
            Node currentNode = this.head;
            int count = 1;
            while(currentNode != null && count++ != position){
                currentNode = currentNode.next;
            }
            if(currentNode != null){
                insertBefore(currentNode, nodeToInsert);
            }else{
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            Node node = this.head;
            while(node != null){
                Node nodeToRemove = node;
                node = node.next;
                if(nodeToRemove.value == value){
                    remove(nodeToRemove);
                }

            }
        }

        public void remove(Node node) {
            if(node == null){
                return;
            }

            if(node == this.head){
                this.head = this.head.next;
            }
            if(node == this.tail){
                this.tail = this.tail.prev;
            }
            Node prevNode = node.prev;
            Node nextNode = node.next;
            if(prevNode != null){
                prevNode.next = nextNode;
            }
            if(nextNode != null){
                nextNode.prev = prevNode;
            }

            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            if(this.head == null){
                return false;
            }
            Node currentNode = this.head;

            while(currentNode != null){
                if(currentNode.value == value){
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
