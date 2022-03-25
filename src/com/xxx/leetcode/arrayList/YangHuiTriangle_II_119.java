package com.xxx.leetcode.arrayList;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle_II_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1;i<=rowIndex;++i){
            row.add((int) ( (long) row.get(i-1)*(rowIndex-i+1) / i));
        }
        return row;
    }

    public static void main(String[] args) {
        YangHuiTriangle_II_119 yh = new YangHuiTriangle_II_119();
        System.out.println(yh.getRow(3));
    }
}
