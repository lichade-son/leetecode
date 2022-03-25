package com.xxx.leetcode.arrayList;

import java.util.Stack;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */

public class ReverseInteger_7 {
    /**
     *
     * 使用栈存储每一位的数字最后出栈
     * @param x
     * @return
     */
//    public int reverse(int x) {
//        int res = 0;
//        int size = 0;
//        Stack stack = new Stack();
//        while(x != 0) {
//            stack.push(x%10);
//            x = x/10;
//        }
//        size = stack.size();
//        while(!stack.empty()) {
//            if(size == stack.size()) {
//                res += (int)stack.peek();
//                stack.pop();
//                continue;
//            }
//            res += Math.pow(10, (size - stack.size())) * (int)stack.peek();
//            stack.pop();
//        }
//        if(res <= -2147483648 || res >= 2147483647) return 0;
//        return res;
//    }

    /**
     * 使用中间变量暂存转换结果。
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int temp = res*10 + x%10;
            if(temp/10 != res) return 0;
            res = temp;
            x = x/10;
        }
        return res;
    }
}
