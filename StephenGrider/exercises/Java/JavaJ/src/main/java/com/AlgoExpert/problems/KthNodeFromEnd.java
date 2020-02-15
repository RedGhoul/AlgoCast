package com.AlgoExpert.problems;

public class KthNodeFromEnd {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        LinkedList endP = head;
        int count =1;
        while(count <= k){
            endP = endP.next;
            count++;
        }

        // Have to do it this way since they use "this"
        // so we can not just assign Head to head.next
        if(endP == null){ // forgot they always add the zero
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        LinkedList prevStart = null;
        LinkedList startP = head;
        LinkedList startEnd = null;
        while(endP != null){
            prevStart = startP;
            startP = startP.next;
            startEnd = startP.next;
            endP = endP.next;
        }
        if (prevStart != null && startEnd != null){
            prevStart.next = startEnd;
        }else if(startP == null || k == 1){
            prevStart.next = null;
        }
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
