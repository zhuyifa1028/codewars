package y2021.m10.d20;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author zhuyifa
 * @version 2021/10/20
 */
public class Solution {

    /**
     * 编写一个函数，接收一个数字数组（测试用整数）和一个目标数字。它应该在数组中找到两个不同的项目，当它们加在一起时，就会得到目标值。然后，这些项目的索引应该以一个元组的形式返回，如：。(index1, index2）。)
     * <p>
     * 就本卡塔而言，一些测试可能有多个答案；任何有效的解决方案都会被接受。
     * <p>
     * 输入总是有效的（数字将是一个长度为2或更大的数组，并且所有的项目都是数字；目标总是该数组中两个不同项目的总和）。
     * <p>
     * 基于：http://oj.leetcode.com/problems/two-sum/
     * <p>
     * twoSum [1, 2, 3] 4 === (0, 2)
     *
     * @param numbers 数字数组
     * @param target  目标数字
     * @return 项目的索引
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int res = target - numbers[i];
            if (intMap.containsKey(res)) {
                return new int[]{i, intMap.get(res)};
            }
            intMap.put(numbers[i], i);
        }
        return null; // Do your magic!
    }
}
