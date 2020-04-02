package 算法分类.双指针;

import java.util.Arrays;

public class 有序转化数组 {

    /**
     * Leetcode #360
     * https://leetcode-cn.com/problems/sort-transformed-array
     *
     * 给你一个已经 排好序 的整数数组 nums 和整数 a、b、c。对于数组中的每一个数 x，
     * 计算函数值 f(x) = ax2 + bx + c，请将函数值产生的数组返回。
     *
     * 要注意，返回的这个数组必须按照 升序排列，并且我们所期望的解法时间复杂度为 O(n)。
     *
     * 直接暴力API解决
     * 双指针考虑韦达定理求 极值点 和 对称线
     * @param nums
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = a*nums[i]*nums[i] + b*nums[i] + c;
        }
        Arrays.sort(result);
        return result;
    }
}
