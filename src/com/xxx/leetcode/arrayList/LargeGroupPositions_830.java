package com.xxx.leetcode.arrayList;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions_830 {
    public static List<List<Integer>> largeGroupPosition(String s) {
        int l = s.length();
        String last = s.substring(0,1), cur = s.substring(0,1);
        System.out.println(last);
        int start = 0, end = 0;
        List<List<Integer>> lgp = new ArrayList<>();
        for (int i = 1; i < l; i++){
            cur = s.substring(i, i+1);
            if (!last.equals(cur)) {
                last = cur;
                end = i-1;
                if (end - start >= 2){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    lgp.add(temp);
                }
                start = i;
            }
            }
        if (l - start >= 3){
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(l-1);
            lgp.add(temp);
        }
        return lgp;
    }

    public static void main(String[] args) {
        String s = "bbbbabaaaa";
        System.out.println(largeGroupPosition(s));
    }
}
