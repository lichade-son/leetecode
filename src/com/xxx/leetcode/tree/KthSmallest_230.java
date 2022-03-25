package com.xxx.leetcode.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
/*
给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 */
public class KthSmallest_230 {
    public int kthSmallest(TreeNode root, int k) {
        /*
        迭代法，维护一个节点栈，采用DFS中序遍历，每次弹出栈内值最小的节点，弹出次数为k时返回此节点的值。
         */
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        while(true) {
//            while(root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.remove();
//            if(--k == 0) return root.val;
//            root = root.right;
//        }
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arr = inOrder(root, array);
        return arr.get(k-1);
    }
    ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return arr;
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        return arr;
    }
}
