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
}
