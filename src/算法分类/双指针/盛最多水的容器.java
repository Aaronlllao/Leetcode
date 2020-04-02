package 算法分类.双指针;

public class 盛最多水的容器 {

    /**
     * Leetcode #11
     * https://leetcode-cn.com/problems/container-with-most-water/
     *
     *
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
     * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 思路：储水量又两块柱子的横坐标之差（j-1) 和 最短纵坐标 决定
     * area=（j-1)* min(height[i],height[j])
     * 两种移动方案，
     * 1.移动短板——面积可能增大可能减小，
     * 2.移动长板——面积一定减小
     * 每移动一次，横坐标之差（j-1)都会减少1，而面积由最短板决定，所以在横坐标之差减少时，如果移动长板，即最短板不变
     * 面积必然减小。所以只能移动长板
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while(i < j){
            area = Math.max(area,Math.min(height[j],height[i]));
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return area;
    }
}
