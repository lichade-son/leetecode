package com.xxx.leetcode.tree;

public class CountSameSubTree_250 {
    static int res;
    public static boolean sameSubTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = sameSubTree(root.left);
        boolean right = sameSubTree(root.right);
        if (left && right) {
            if (root.left != null && root.val != root.left.val) {
                return false;
            }
            if (root.right != null && root.val != root.right.val) {
                return false;
            }
            res++;
            return true;
        }
        return true;
    }
    public static int countSameSubTree(TreeNode root) {
        res = 0;
        sameSubTree(root);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1, new TreeNode(5), new TreeNode(5));
        root.right = new TreeNode(5, new TreeNode(5), new TreeNode(5));
        System.out.println(countSameSubTree(root));
    }
}
