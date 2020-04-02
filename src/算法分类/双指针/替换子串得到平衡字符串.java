package 算法分类.双指针;

import java.util.Arrays;

public class 替换子串得到平衡字符串 {

    /**
     * 未完成
     * Leetcode #1234
     * https://leetcode-cn.com/problems/replace-the-substring-for-balanced-string/
     *
     * 有一个只含有 'Q', 'W', 'E', 'R' 四种字符，且长度为 n 的字符串。
     * 假如在该字符串中，这四个字符都恰好出现 n/4 次，那么它就是一个「平衡字符串」。
     * 给你一个这样的字符串 s，请通过「替换一个子串」的方式，使原字符串 s 变成一个「平衡字符串」。
     * 你可以用和「待替换子串」长度相同的 任何 其他字符串来完成替换。
     * 请返回待替换子串的最小可能长度。
     * 如果原字符串自身就是一个平衡字符串，则返回 0。
     *
     * @param s
     * @return
     */
    public static int balancedString(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr1 = Arrays.copyOfRange(arr,0,arr.length/4);
        char[] arr2 = Arrays.copyOfRange(arr,arr.length/4,arr.length/2);
        char[] arr3 = Arrays.copyOfRange(arr,arr.length/2,arr.length/4 * 3);
        char[] arr4 = Arrays.copyOfRange(arr,arr.length/4 * 3,arr.length);
        if(arr1[arr1.length-1] != 'E'){
            for(int i = arr1.length-1; i > 0; i--){
                if(arr1[i] != 'E'){
                    count++;
                }else{
                    break;
                }
            }
        }
        return 0;
    }
}
