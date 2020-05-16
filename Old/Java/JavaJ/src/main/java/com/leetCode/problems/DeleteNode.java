package com.leetCode.problems;

public class DeleteNode {
    /*
    * Doing things in place
    * Time: O(1)
    * Space: O(1)
    * */

    public static void deleteNode(listNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public class listNode {
        int val;
        listNode next;
        listNode(int x){
            this.val = x;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */