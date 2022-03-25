package com.xxx.leetcode.linkedList;

/*
给你一个链表，每k个节点一组进行翻转，请你返回翻转后的链表。

k是一个正整数，它的值小于或等于链表的长度。

如果节点总数不是的整数倍，那么请将最后剩余的节点保持原有顺序。
 */
public class ReverseKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;
        while(head != null) {
            ListNode tail = pre;
            for(int i = 0; i < k; i++) {
                tail = tail.next;
                if(tail == null) {
                    return hair.next;
                }
            }
            pre.next = tail;
            ListNode prev = new ListNode(), cur = head;
            while(prev != tail){
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            pre = head;
            head.next = cur;
            head = cur;
        }
        return hair.next;
    }
}
