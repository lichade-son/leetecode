package com.xxx.leetcode.arrayList;

public class IsPalindrom_9 {
    /**
     * 借助第七题逆转数字的思想，判断逆转后的数字是否相等来间接得出是否是回文数字。
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int res = 0;
        int y = x;
        while(x != 0) {
            int temp = res*10 + x%10;
            if(temp /10 != res) return false;
            res = temp;
            x /= 10;
        }
        return res == y;
    }
}
