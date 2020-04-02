package 数据结构分类.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {


    /**
     * Leetcode #15 数组  双指针
     * 先把数组进行排序，从最左边元素开始定位，如果该元素大于0，则说明所有元素都大于0，不存在相加等于0的情况
     * 然后从左边第二个元素和最末尾的元素开始相加，
     * 如果该3个元素相加等于0，则进入下一轮，如果大于0则说明需要一个更小的元素，右边的指针往左移，
     * 如果小于0则说明需要一个更大的元素，左边的指针往右移
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        int[] a = {1,2};
        return ans;
    }
}
