package com.xxx.leetcode.linkedList;

public class ListNode {
    ListNode next;
    int val;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
