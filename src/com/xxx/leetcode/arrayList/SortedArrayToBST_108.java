package com.xxx.leetcode.arrayList;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {
    }
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
/*
给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。

高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。

 */
public class SortedArrayToBST_108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }else if (nums.length == 2) {
            return new TreeNode(nums[0], null, new TreeNode(nums[1]));
        }else {
            int index = nums.length / 2;
            int[] left = new int[index];
            int[] right = new int[nums.length - index - 1];
            System.arraycopy(nums, 0, left, 0, index);
            System.arraycopy(nums, index+1 , right, 0, nums.length - index - 1);
            return new TreeNode(nums[index], sortedArrayToBST(left), sortedArrayToBST(right));
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }
}
