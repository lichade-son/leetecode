package com.xxx.leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValid_20 {
    public static boolean isValid(String s) {
        Map<Character, Character> hash = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');put('{', '}');
        }};
        Deque<Character> pairs = new LinkedList<Character>();
        char[] t = s.toCharArray();
        for(char i: t) {
            if(hash.containsKey(i)){
                pairs.push(i);
            }else if(pairs.isEmpty()){
                return false;
            }else if(hash.get(pairs.remove()) != i){
                return false;
            }
        }
        return pairs.isEmpty();
    }
}
