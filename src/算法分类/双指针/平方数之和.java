package 算法分类.双指针;

public class 平方数之和 {

    /**
     * Leetcode #633
     * https://leetcode-cn.com/problems/sum-of-square-numbers
     *
     * 判断对于常数c 是否存在两个整数n,m 使得n^2 + m^2 = c
     * 假设 m 为 c的开根号，那么如果对于所有大于m的整数都有其平方大于c
     * 所以整数必须在0-m之间选取，则令一个指针从0开始往右，令一指针从m开始往左移
     *
     * @param c
     * @return
     */
    public static boolean judgeSquareSum(int c) {
        int result;
        int n = (int) Math.sqrt(c);
        int m = 0;
        while(m <= n){
            result = m*m + n*n;
            if(result > c){
                n--;
            }else if(result < c){
                m++;
            }else if(result == c){
                return true;
            }
        }
        return false;
    }
}
