package com.xxx.leetcode.arrayList;

public class MatrixReshape_566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int matR = mat.length;
        int matC = mat[0].length;
        if (r*c != matC*matR){
            return mat;
        }
        int[][] x = new int[r][c];
        for (int i = 0; i < matC*matR; i++){
            x[i/c][i%c] = mat[i/matC][i%matC];
        }
        return x;
    }
}
