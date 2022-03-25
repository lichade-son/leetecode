package com.xxx.leetcode.arrayList;
/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagram_242 {
    /**
     * 维护一个26字母表的数组，遇到s中的字母字母表中相应位置元素加1，t中的字母字母表中相应位置减一，最后判断字母表中所有位置是否全为0返回true，否则false
     * @param s
     * @param t
     * @return
     */
    public static boolean isNagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int [] alpha = new int [26];
        for(int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
            alpha[t.charAt(i) - 'a'] --;
        }
        for(int i = 0; i < 26; i++){
            if(alpha[i] != 0) return false;
        }
        return true;
    }
}
