package 算法分类.双指针;

public class 验证是否为回文II {

    /**
     * Leetcode #680
     * https://leetcode-cn.com/problems/valid-palindrome-ii
     *
     * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
     * @param s
     * @return
     */
    public static boolean validPalindrome(String s) {
        char[] sArr = s.toCharArray();
        int l = 0;
        int r = sArr.length - 1;
        while(l < r){
            if(sArr[l] != sArr[r]){ //不能用isPalindrome(sArr, l, r)判断，因为l,r没有自增或者自减
                return isPalindrome(sArr,l+1,r) || isPalindrome(sArr,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isPalindrome(char[] arr, int l, int r){
        while(l < r){
            if(arr[l] == arr[r]){
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }
}
