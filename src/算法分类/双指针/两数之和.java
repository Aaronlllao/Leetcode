package 算法分类.双指针;

public class 两数之和 {

    /**
     * Leetcode #167
     * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     *
     * 给定一个有序数组，判断是否存在数组内的两个数相加等于目标值
     * 双指针遍历数组，一个指针从最小值开始，另一指针从最大值开始
     * @param numbers
     * @param target
     * @return 数组两元素的下标,其中下标从1开始
     */
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while(l < r){
            if(numbers[l] + numbers[r] == target){
                return new int[]{l+1,r+1};
            }else if(numbers[l] + numbers[r] > target){
                r--;
            }else if (numbers[l] + numbers[r] < target){
                l++;
            }
        }
        return null;
    }
}
