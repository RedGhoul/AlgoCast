package com.JavaAlgos.ColtSteele.SinglyLinkedLists;

public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();
        test.push("value");
        test.push("pie");
        test.push("cows");

        test.shift();
        // test.pop();
        // test.pop();
        // test.pop();
        test.unshift("New thing infront");
        test.unshift("New2 thing infront");
        test.unshift("New3 thing infront");
        for(int i =1; i < test.length; i++){
            System.out.println(test.get(i));
        }
    }

    public SSNode head;
    public SSNode tail;
    public int length;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // adds on to the end of the linked list
    public void push(String value) {
        SSNode node = new SSNode(value);
        if (this.tail != null) {
            this.tail.next = node;
            this.tail = node;
        } else if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else { // if the head does equal something but the tail is null
            this.head.next = node;
            this.tail = node;
        }
        this.length++;
    }

    public void pop() {
        SSNode start = this.head;

        if (start == null) {
            return;
        }

        if (this.head == this.tail) {
            System.out.println("POP value " + this.head.value);
            this.head = null;
            this.tail = null;
            this.length--;
            return;
        }

        while (start.next != null) {
            if (start.next.next == null) {
                System.out.println("POP value " + start.next.value);
                start.next = null;
                this.tail = start;
                this.length--;
                return;
            }
            start = start.next;
        }

        // // can always do the one before pattern

        // SSNode current = this.head;
        // SSNode newTail = current;
        // while (current.next != null) {
        // newTail = current; // the one right before current's new value becomes null.
        // // which indicates the current value of current is the tail. And the one
        // before
        // // the
        // // current tail is going to be the new tail
        // current = current.next;
        // }
        // newTail.next = null;
        // this.tail = newTail;
        // this.length--;
    }

    //Removing the head of a linked list
    public void shift() {
        if (this.head == this.tail) {
            if (this.head == null) {
                return;
            }
            this.head = null;
            this.tail = null;
        } else {
            SSNode temp = this.head.next;
            this.head.next = null;
            this.head = temp;
            // Also could have done it this way
            // SSNode curHead = this.head;
            // this.head = curHead.next;
        }
    }

    //Pushing a new head into the linked list
    public void unshift(String value) {
        if(value.isEmpty()) return;
        SSNode newNode = new SSNode(value);

        if (this.head == null) {
            this.head = newNode;
            //forgot about the tail
            this.tail = newNode;
        } else {
            SSNode oldHead = this.head;
            this.head = newNode;
            this.head.next = oldHead;
        }
        //forgot to increment the length
        this.length++;
    }

    public String get(int index){
        if(this.head == null || index > this.length || index < 0) {
            return null;
        }else if(this.head != null && index == 0){
            return this.head.value;
        }

        SSNode pointer = this.head;
        int tempIndex = 1;

        while(tempIndex != index){
            pointer = pointer.next;
            tempIndex++;
        }

        return pointer.value;

    }
}
