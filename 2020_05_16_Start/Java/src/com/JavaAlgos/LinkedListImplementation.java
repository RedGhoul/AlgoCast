package com.JavaAlgos;

public class LinkedListImplementation {
    public static void main(String[] args){
        LinkedListImplementation things = new LinkedListImplementation();
        things.insertFirst(1);
        things.insertFirst(2);
        things.insertFirst(3);
        things.insertFirst(4);
        things.insertFirst(55);
        //System.out.println(things.size());
//        System.out.println(things.getFirst().data);
//        System.out.println(things.getLast().data);
//
//        System.out.println("removeFirst");
//        things.removeFirst();
//        System.out.println(things.getFirst().data);
//        System.out.println("clear");
//        things.clear();
//        things.insertLast(3335);
//        things.insertLast(3332);
        //System.out.println(things.size());

        //System.out.println(things.GetAt(3).data);
//        System.out.println(things.size());
//        System.out.println(things.RemoveAt(2).data);
        System.out.println(things.size());
        System.out.println("Insert At");
        things.InsertAt(2,9999);
        System.out.println("New Size");
        System.out.println(things.size());
        System.out.println("Get at");
        System.out.println(things.GetAt(2).data);
    }

    public LLNodeImplementation head;
    public LinkedListImplementation(){
        this.head = null;
    }

    public void insertFirst(int data){ // don't try to make it more complex then it already is
        LLNodeImplementation newNode = new LLNodeImplementation(data,this.head);
        this.head = newNode;
    }

    public int size(){
        if(this.head == null){
            return 0;
        }
        int count = 0;
        LLNodeImplementation marker = this.head;
        while(marker != null){
            count++;
            marker = marker.nextNode;
        }
        return count;
    }

    public LLNodeImplementation getFirst(){
        return this.head;
    }

    public LLNodeImplementation getLast(){
        LLNodeImplementation curNode = this.head;
        LLNodeImplementation answer = this.head;
        while(curNode != null){
            answer = curNode;
            curNode = curNode.nextNode;
        }
        return answer;
    }

    public void clear(){
        this.head = null;
    }

    public void removeFirst(){
        if(this.head == null) return;
        LLNodeImplementation newHead = this.head.nextNode;
        this.head = newHead;
    }

    public void removeLast(){
        if(this.head == null) return;
        LLNodeImplementation marker = this.head;
        LLNodeImplementation markerLast = this.head;
        while(marker.nextNode != null){
            markerLast = marker;
            marker = marker.nextNode;
        }
        markerLast.nextNode = null;
    }

    public void insertLast(int value){
        if(this.head == null) return;
        LLNodeImplementation maker = this.head;
        while(maker.nextNode != null){
            maker = maker.nextNode;
        }
        maker.nextNode = new LLNodeImplementation(value);
    }

    // based on zero index
    public LLNodeImplementation GetAt(int index){
        if(index < 0 || index > this.size()) return null;
        LLNodeImplementation start = this.head;
        int curCount = 0;
        while(curCount != index){
            start = start.nextNode;
            curCount++;
        }
        return start;
    }

    public LLNodeImplementation RemoveAt(int index){
        if(index < 0 || index > this.size()) return null;
        LLNodeImplementation start = this.head;
        LLNodeImplementation before = null;
        int curCount = 0;
        while(curCount != index){
            before = start;
            start = start.nextNode;
            curCount++;
        }
        LLNodeImplementation answer = start;
        LLNodeImplementation newEnd = start.nextNode;
        before.nextNode = newEnd;
        return start;
    }


    public void InsertAt(int index,int data){
        if(index < 0 || index > this.size()) return;
        LLNodeImplementation newNode = new LLNodeImplementation(data);
        LLNodeImplementation start = this.head;
        LLNodeImplementation before = null;
        int curCount = 0;
        while(curCount != index){
            before = start;
            start = start.nextNode;
            curCount++;
        }
        before.nextNode = newNode;
        newNode.nextNode = start;
    }
}
