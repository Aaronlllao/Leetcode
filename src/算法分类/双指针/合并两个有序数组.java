package 算法分类.双指针;

import java.util.Arrays;

public class 合并两个有序数组 {

    /**
     * Leetcode #88
     * https://leetcode-cn.com/problems/merge-sorted-array
     *
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 示例：
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     * 注意判断边界当 一个数组的有效元素取完时，只复制另一数组的元素
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] a = new int[m];
        System.arraycopy(nums1, 0, a, 0, m);
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while((i1 < m) || (i2 < n)){
            if(i1 != m && i2 != n && a[i1] < nums2[i2]){
                nums1[i] = a[i1];
                i1++;
            }else if(i1 != m && i2 != n && a[i1] > nums2[i2]){
                nums1[i] = nums2[i2];
                i2++;
            }else if(i1 == m){//当nums1的有效元素取完
                nums1[i] = nums2[i2];
                i2++;
            }else{//当nums2的有效元素取完
                nums1[i] = a[i1];
                i1++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0,0,0,0};
        int[] nums2 = {2,4,5,6,0,0};
        merge(nums1,3,nums2,4);
    }
}
