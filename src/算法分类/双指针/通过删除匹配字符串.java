package 算法分类.双指针;

import java.util.List;

public class 通过删除匹配字符串 {

    /**
     * Leetcode #524
     * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
     *
     * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
     * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
     *
     * 思路：先考虑一个字符串的情况，如果对于给定字符串先x，和字典字符串y，对于y中的每一个元素x都含有则说明
     * x可以经过删除得到y
     * 设定2个指针，一个指向x的头元素，一个指向y的头元素，如果相等则都往后移动一位，如果不相等则x的指针移动
     * 当y的指针移动到末尾时则说明元素全部可以匹配上
     * @param s 字符串
     * @param d 字典字符串
     * @return
     */
    public static String findLongestWord(String s, List<String> d) {
        String ans = "";
        for(String str : d){
            for(int i = 0, j = 0; i < s.length() && j < str.length(); i++){
                if(s.charAt(i) == str.charAt(j)){
                    j++;
                }
                if(j == str.length()){
                    if(ans.length() < str.length()
                            || (ans.length() == str.length() && ans.compareTo(str) > 0)){
                        ans = str;
                    }else if(ans.length() > str.length()
                            || (ans.length() == str.length() && ans.compareTo(str) <= 0)){
                        ans = ans;
                    }
                }
            }
        }
        return ans;
    }
}
