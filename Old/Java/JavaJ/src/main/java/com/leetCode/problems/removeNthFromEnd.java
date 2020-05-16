package com.leetCode.problems;

public class removeNthFromEnd {
    /*
    * Time: O(1)
    * Space: O(1)
    * */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;

        if(n != 1){
            for(int i = 1; i <= n-1;i++){
                p2 = p2.next;
            }
        }else if(n == 1){
            if (p2.next == null){
                head = null;
                return null;
            }else{
                ListNode prev = null;
                while(p1.next != null){
                    prev = p1;
                    p1 = p1.next;
                }
                prev.next = null;
                return head;
            }
        }

        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.val = p1.next.val;
        p1.next = p1.next.next;

        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}
