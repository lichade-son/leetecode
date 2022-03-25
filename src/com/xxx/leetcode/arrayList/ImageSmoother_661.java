package com.xxx.leetcode.arrayList;

/**
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度(向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 *
 */
public class ImageSmoother_661 {
    public static int[][] imageSmoother(int[][] img){
        int r = img.length, c = img[0].length;
        int[][] imgSmooth = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                int count = 0;
                for (int nr = i-1; nr <= i+1; nr++){
                    for (int nc = j-1; nc <= j+1; nc++){
                        if (nc >= 0 && nc < c && nr >= 0 && nr < r){
                            imgSmooth[i][j] += img[nr][nc]; //把相邻的单元值相加包括自己。
                            count++;
                        }
                    }
                }
                imgSmooth[i][j] /= count;
            }
        }
        return imgSmooth;
    }
}
