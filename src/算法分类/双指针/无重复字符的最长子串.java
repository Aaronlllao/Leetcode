package 算法分类.双指针;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {

    /**
     * Leetcode #3
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     *
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 创建哈希表作为key-index的映射
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int result = 0;
        int i = 0;
        int j = 1;
        if(s.length() == 0 || s == null){
            return 0;
        }else if(s.length() == 1){
            return 1;
        }
        map.put(s.charAt(i),i);
        while(i < s.length() && j < s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
                result = Math.max(result,j-i+1);
            }else{
                i = Math.max(i,map.get(s.charAt(j))+1);
                map.put(s.charAt(j),j);
                result = Math.max(result,j-i+1);
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "abc";
        boolean b = a.contains(String.valueOf(a.charAt(0)));
        System.out.println(b);
    }
}
