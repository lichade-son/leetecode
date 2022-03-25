package com.xxx.leetcode.arrayList;

/**
 * 给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
 *
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 */
public class IsToeplitzMatrix_766 {
    /*
    从（1,1）元素开始逐行遍历，将当前元素与左上元素比较如果不相等直接返回false，否则遍历结束后返回true
     */
    public static boolean isToeplitzMatrix(int[][] matrix){
        int r = matrix.length, c = matrix[0].length;
        for (int i = 1; i < r; i++){
            for (int j = 1; j < c; j++){
                if (matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
