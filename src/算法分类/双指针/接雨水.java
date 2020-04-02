package 算法分类.双指针;

public class 接雨水 {

    /**
     * Leetcode #42
     * https://leetcode-cn.com/problems/trapping-rain-water
     *
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     *
     * 思路：两个指针，对于某一列的储水量，被min(左边最高的高度，右边最高的高度)-柱子本身的高度——木桶原理
     * 所以从左到右遍历整个数组，求出每一个元素左边最高和右边最高就可以了
     *
     * 外部需要遍历n次，内部又要遍历n次 时间复杂度为O(n^2)
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int result = 0;
        if(height == null || height.length == 0){
            return 0;
        }
        //最左和最右的柱子不可能储水
        for(int i = 1; i < height.length - 1; i++){
            int maxL = 0;
            int maxR = 0;
            for(int pL = i - 1; pL >= 0; pL--){
                maxL = Math.max(height[pL],maxL);
            }
            for(int pR = i + 1; pR < height.length; pR++){
                maxR = Math.max(height[pR],maxR);
            }
            if(Math.min(maxL,maxR) > height[i])
                result = result + Math.min(maxL,maxR) - height[i];
        }
        return result;
    }

    /**
     * 优化
     * 使用动态规划思想，第n根柱子的储水量决定与其左边最高柱子和右边最高柱子的最小值，
     * 创建2个数组，一个储存元素左边最高柱子的高度，另一个储存右边最高柱子的高度
     * @param height
     * @return
     */
    public int trap1(int[] height) {
        int[] lMax = new int[height.length];
        int[] rMax = new int[height.length];
        int result = 0;

        for(int i = 0; i < height.length; i++){
            if(i == 0){
                lMax[i] = 0;
            }else {
                lMax[i] = Math.max(lMax[i-1],height[i-1]);
            }
        }
        for(int i = height.length - 1; i >= 0; i--){
            if(i == height.length - 1){
                rMax[i] = 0;
            }else {
                rMax[i] = Math.max(rMax[i+1],height[i+1]);
            }
        }
        for(int i = 1; i < height.length - 1; i++){
            //一定要判断当前柱子是否比左右都要高！！！
            if(Math.min(rMax[i],lMax[i]) > height[i])
                result = result + Math.min(rMax[i],lMax[i]) - height[i];
        }
        return result;
    }

}
