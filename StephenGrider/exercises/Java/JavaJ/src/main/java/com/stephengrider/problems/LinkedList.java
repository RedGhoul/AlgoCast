package com.stephengrider.problems;

public class LinkedList {

    private Node Head;

    public LinkedList(){
        this.Head = null;
    }


    public void insertFirst(String data){
        if(this.Head == null){
            this.Head = new Node(data,null);
        }else{
            Node newNode = new Node(data,this.Head);
            this.Head = newNode;
        }
    }

    public int size(){
        int count = 0;
        Node currentNode = this.Head;

        while(currentNode.getNext() != null){
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public Node getFirst(){
        if(this.Head == null){
            return null;
        }
        return this.Head;
    }

    public Node getLast(){
        Node currentNode = this.Head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void clear(){
        this.Head = null;
    }

    public Node removeFirst(){
        if(this.Head == null){
            return null;
        }

        Node toRemove = this.Head;
        Node newHead = this.Head.getNext();
        this.Head = newHead;
        toRemove.setNext(null);
        return toRemove;
    }

    public void insertLast(String data){
        if(this.Head == null){
            this.Head = new Node(data,null);
            return;
        }

        Node currentNode = this.Head;
        if(currentNode.getNext() == null){
            currentNode.setNext(new Node(data,null));
        }else{
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
                if(currentNode.getNext() == null){
                    currentNode.setNext(new Node(data,null));
                    return;
                }
            }
        }


    }

    public Node getAt(int pos){
        if(this.Head == null){
            return null;
        }
        int count = 1;
        Node currentNode = this.Head;
        while (currentNode.getNext() != null){
            if(count == pos){
                return currentNode;
            }
            currentNode = currentNode.getNext();
            count++;
        }

        return null;
    }

    public void removeAt(int pos){
        if(this.Head == null){
            return;
        }
        int count = 1;
        Node currentNode = this.Head;

        while (currentNode.getNext() != null){

            Node prev = currentNode;
            currentNode = currentNode.getNext();
            Node nextNode = currentNode.getNext();
            if(pos == 1){
                this.removeFirst();
            }else if(pos == count){
                prev.setNext(nextNode);
                currentNode.setNext(null);
                return;
            }
            count++;
        }

    }

    public void insertAt(int pos, String data){
        if(this.Head == null){
            return;
        }
        int count = 1;
        Node currentNode = this.Head;

        while (currentNode.getNext() != null){

            Node prev = currentNode;
            currentNode = currentNode.getNext();
            Node nextNode = currentNode.getNext();
            if(pos == 1){
                this.removeFirst();
            }else if(pos == count){
                Node newNode = new Node(data,null);
                prev.setNext(newNode);
                newNode.setNext(currentNode);
                return;
            }
        }

    }

    // 1 -> 2 -> 3 -> 4
    //ab
    //      a    b
    public Node findMidPoint(){
        Node currentP = this.Head;
        Node endP = this.Head;
        while(endP.getNext() != null){
            currentP = currentP.getNext();
            endP = endP.getNext().getNext();
            if(endP==null || endP.getNext() == null){
                break;
            }

        }

        return currentP;
    }



}
