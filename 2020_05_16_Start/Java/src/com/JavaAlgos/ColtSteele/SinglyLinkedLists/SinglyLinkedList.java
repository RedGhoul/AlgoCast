package com.JavaAlgos.ColtSteele.SinglyLinkedLists;

public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();
        test.push("value");
        test.push("pie");
        test.push("cows");
        test.shift();
        test.unshift("New thing infront");
        test.unshift("New2 thing infront");
        test.unshift("New3 thing infront");
        for(int i =1; i < test.length; i++){
            System.out.println(test.get(i));
        }
        test.set(1,"HOBoken");
        test.set(4,"new thing 99");
        System.out.println("---------------------");
        for(int i =1; i < test.length; i++){
            System.out.println(test.get(i));
        }
        System.out.println("---------------------");
        test.insert(0, "111111");
        test.insert(test.length, "99");
        test.insert(2,"middle");
        System.out.println("---------------------");
        for(int i =1; i < test.length; i++){
            System.out.println(test.get(i));
        }
        System.out.println("---------------------");
        test.remove(test.length);
        System.out.println("---------------------");
        for(int i =1; i < test.length; i++){
            System.out.println(test.get(i));
        }
        System.out.println("---------------------");
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
        this.length--;
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
        }

        SSNode pointer = this.head;
        int tempIndex = 1;

        while(tempIndex != index){
            pointer = pointer.next;
            tempIndex++;
        }

        return pointer.value;

    }

    // You could also just use the previous "Get" function as well
    public void set(int index, String setValue){
        if(index < 0 || index > this.length || setValue.isEmpty()){
            return;
        }else if(index == 0 && !setValue.isEmpty()){
            this.head.value = setValue;
        }

        int counter = 0;
        SSNode pointer = this.head;

        while(counter != index){
            pointer = pointer.next;
            counter++; // forgot to increment counter
        }
        pointer.value = setValue;
        return;
    }

    public void insert(int index, String value){
        SSNode newNode = new SSNode(value);
        if(index < 0 || index > this.length || value.isEmpty()){
            return;
        }
        if(index == 0){
            SSNode oldhead = this.head;
            newNode.next = oldhead;
            this.head = newNode;
            this.length++;
            return;
        }
        int count = 1;
        SSNode pointer = this.head;
        SSNode prevpointer = null;

        while(count != index){
            prevpointer = pointer;
            pointer = pointer.next;
            count++;
        }
        prevpointer.next = newNode;
        newNode.next = pointer;
        // during a successful insert you are always
        // gonna end up with a bigger linked list
        this.length++;
        return;
    }

    public void remove(int index){
        if(index < 0 || index > this.length || this.head == null){
            return;
        }

        if(index == 0 && this.head != null) {
            this.head = null;
            return;
        }

        SSNode fir = null;
        SSNode mid = this.head;
        SSNode las = null;
        int count = 1;

        while(count != index){
            fir = mid;
            mid = mid.next;
            if(mid.next != null){
                las = mid.next;
            }else{
                las = null;
            }
            count++;
        }
        fir.next = las;
        mid.next = null;
        this.length--;
        return;
    }
}
