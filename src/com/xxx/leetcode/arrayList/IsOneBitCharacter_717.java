package com.xxx.leetcode.arrayList;


public class IsOneBitCharacter_717 {
    /*
    方法一：线性扫描
我们可以对bits 数组从左到右扫描来判断最后一位是否为一比特字符。当扫描到第i 位时，如果bits[i]=1，那么说明这是一个两比特字符，将i 的值增加 2。如果bits[i]=0，那么说明这是一个一比特字符，将i 的值增加 1。

如果i 最终落在了bits.length−1 的位置，那么说明最后一位一定是一比特字符。

方法二：贪心
三种字符分别为 0，10 和 11，那么bits 数组中出现的所有 0 都表示一个字符的结束位置（无论其为一比特还是两比特）。因此最后一位是否为一比特字符，只和他左侧出现的连续的 1 的个数（即它与倒数第二个 0 出现的位置之间的 1 的个数，如果 \mathrm{bits}bits 数组中只有 1 个 0，那么就是整个数组的长度减一）有关。如果 1 的个数为偶数个，那么最后一位是一比特字符，如果 1 的个数为奇数个，那么最后一位不是一比特字符。
     */
    public static boolean isOneBitCharacter(int[] bits){
        /*
        方法一
        int flag = 0;
        while (flag < bits.length - 1){
            flag += bits[flag] + 1;
        }
        return flag == bits.length - 1;
         */
        int length = 0;
        for (int i = bits.length - 2; i >= 0; i--){
            if (bits[i] == 0){
                break;
            }else {
                length++;
            }
        }
        return length % 2 != 1;
    }
}
