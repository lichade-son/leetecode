package com.xxx.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating_3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int last = 0;
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet();
        for(int i = 0; i < s.length(); i++) {
            while( last < s.length() && set.add(c[last])) {
                last++;
            }
            max = Math.max(set.size(), max);
            set.remove(c[i]);
        }
        return max;
    }
}
