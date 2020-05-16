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

    // Better iterative solution
    public ListNode mergeTwoListsV2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); // this is our place holder node
        // we have it here to build on top of
        ListNode handler = head;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) { // less than or equal to
                handler.next = l1; // the next node becomes l1 if it is smaller than l2
                l1 = l1.next; // then we move l1 forward in its list
            } else { // if l2 is less than. Do the same thing we did above
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next; // finally move the handler to its new current node
        }

        // if you reach this point then you know that l1 or l2 or both are null
        if (l1 != null) {
            handler.next = l1; // we are assigning just one non null node.
            // this works out since this one non null node still has a bunch of connections in front of it
        } else if (l2 != null) {
            handler.next = l2;
        }

        return head.next; // we get rid of it right here, since we are using the node right after it
    }
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
