package com.xxx.leetcode.linkedList;

/*
给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */
public class SwapPairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;
        while(head != null) {
            ListNode tail = pre.next;
            if(tail.next == null) {
                return hair.next;
            }
            pre.next = head.next;
            pre = head;
            ListNode prev = head.next.next;
            head.next.next = head;
            head.next = prev;
            head = prev;
        }
        return hair.next;
    }
}
