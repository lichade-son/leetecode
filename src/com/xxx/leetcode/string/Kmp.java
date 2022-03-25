package com.xxx.leetcode.string;

import java.util.Arrays;

public class Kmp {
    public static int[] next(String s) {
        int l = s.length();
        int[] next1 = new int[l];
        next1[0] = -1;
        int i = 0, j = -1;
        while (i < l) {
            if (i == 7) break;
            if (j == -1 || s.charAt(i) == s.charAt(j)) next1[++i] = ++j;
            else j = next1[j];
        }
        for (int e = 0; e < l; e++) {
            next1[e] += 1;
        }
        return next1;
    }

    public static void main(String[] args) {
        String s = "abaabcac";
        System.out.println(Arrays.toString(next(s)));
    }
}
