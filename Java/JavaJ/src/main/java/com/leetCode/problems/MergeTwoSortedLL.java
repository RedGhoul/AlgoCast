package com.leetCode.problems;

public class MergeTwoSortedLL {
    /*
    * Merge two sorted linked lists and return it as a new list. The new list
    * should be made by splicing together the nodes of the first two lists.
    * Input: 1->2->4, 1->3->4
      Output: 1->1->2->3->4->4
    * */
    // Could do this recursively with only a few lines of code
    // will do that next time

    // Time O(L2.len + L1.len) & Space O(L2.len + L1.len)
    // Iterative Solution
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l2 == null && l1 == null) return null;

        ListNode head = null;
        ListNode returnNode = null;
        while(l1 != null || l2 != null){
            // You don't need to inc them at the same time
            if(l1 == null){
                //System.out.println(l2.val);
                ListNode node = new ListNode(l2.val);
                head.next = node;
                head = node;
                l2 = l2.next;
                continue;
            }

            if(l2 == null){
                ListNode node = new ListNode(l1.val);
                head.next = node;
                head = node;
                l1 = l1.next;
                continue;
            }
            ListNode first = new ListNode(l1.val);
            ListNode sec = new ListNode(l2.val);
            if(l1.val == l2.val){

                if(head == null){
                    ListNode newhead = new ListNode(l1.val);
                    ListNode temp = new ListNode(newhead.val);
                    newhead.next = temp;
                    head = temp;
                    returnNode = newhead;
                }else{
                    head.next = first;
                    first.next = sec;
                    head = sec;
                }

                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1.val > l2.val){
                if(head == null){
                    ListNode newhead = new ListNode(l2.val);
                    head = newhead;
                    returnNode = head;
                }else{
                    head.next = sec;
                    head = sec;

                }
                l2 = l2.next;

            }else{
                if(head == null){
                    ListNode newhead = new ListNode(l1.val);
                    head = newhead;
                    returnNode = head;
                } else{
                    head.next = first;
                    head = first;
                }
                l1 = l1.next;

            }
        }

        return returnNode;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}
