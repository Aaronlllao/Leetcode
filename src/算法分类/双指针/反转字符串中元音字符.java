package 算法分类.双指针;

import java.util.Arrays;

public class 反转字符串中元音字符 {

    /**
     * Leetcode #345
     * https://leetcode-cn.com/problems/linked-list-cycle
     *
     * 反转字符串中的元音字符（交换位置）
     * @param s
     * @return  修改之后的字符串
     */
    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] sArr = s.toCharArray();
        while (l < r){
            if(!isVowel(sArr[l])){
                l++;
            }else if(!isVowel(sArr[r])){
                r--;
            }else if(isVowel(sArr[l]) && isVowel(sArr[r])){
                char temp = sArr[l];
                sArr[l] = sArr[r];
                sArr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(sArr);
    }

    private static boolean isVowel(char c){
        if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c =='u' ||
                c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
