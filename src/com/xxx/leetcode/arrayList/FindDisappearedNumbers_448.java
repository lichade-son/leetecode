package com.xxx.leetcode.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
我们可以用一个哈希表记录数组nums 中的数字，由于数字范围均在1,n] 中，记录数字后我们再利用哈希表检查[1,n] 中的每一个数是否出现，从而找到缺失的数字。

由于数字范围均在[1,n] 中，我们也可以用一个长度为 nn 的数组来代替哈希表。这一做法的空间复杂度是O(n)的。我们的目标是优化空间复杂度到O(1)。

注意到nums 的长度恰好也为n，能否让nums 充当哈希表呢？

由于nums 的数字范围均在[1,n] 中，我们可以利用这一范围之外的数字，来表达「是否存在」的含义。

具体来说，遍历nums，每遇到一个数x，就让nums[x−1] 增加n。由于nums中所有数均在[1,n] 中，增加以后，这些数必然大于n。最后我们遍历nums，若nums[i] 未大于n，就说明没有遇到过数i+1。这样我们就找到了缺失的数字。

注意，当我们遍历到某个位置时，其中的数可能已经被增加过，因此需要对 nn 取模来还原出它本来的值。
 */

public class FindDisappearedNumbers_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i: nums) {
            int x = (i-1) % n;
            nums[x] += n;
        }
        for (int i = 0; i < n; i++){
            if (nums[i] <= n){
                list.add(i+1);
            }
        }
        return list;
    }
}
