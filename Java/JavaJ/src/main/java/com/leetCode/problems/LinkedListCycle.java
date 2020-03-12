package com.leetCode.problems;

public class LinkedListCycle {
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return false;
        }
        if(head.next.next == null){
            return false;
        }

        ListNode P1 = head;
        ListNode P2 = head.next;

        while(true){
            if(P2 == null || P2.next == null){
                return false;
            }
            P1 = P1.next;
            P2 = P2.next.next;
            if(P2 == null || P2.next == null){
                return false;
            }
            if(P1.val == P2.val){
                return true;
            }

        }
    }
}
