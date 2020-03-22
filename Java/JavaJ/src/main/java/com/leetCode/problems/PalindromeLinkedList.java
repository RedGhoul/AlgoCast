package com.leetCode.problems;
import java.util.*;
public class PalindromeLinkedList {
    /*
    * 234. Palindrome Linked List
        Easy
        Given a singly linked list, determine if it is a palindrome.

        Example 1:

        Input: 1->2
        Output: false
        Example 2:

        Input: 1->2->2->1
        Output: true
        Follow up:
        Could you do it in O(n) time and O(1) space? <- do later
    *
    * */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        List<Integer> list = new ArrayList<Integer>();
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        while(list.size() > 1){
            int P1 = list.remove(0);
            int P2 = list.remove(list.size()-1);
            if(P1 != P2){
                return false;
            }
        }
        return true;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
}
