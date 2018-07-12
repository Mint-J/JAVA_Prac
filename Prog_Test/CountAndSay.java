// Count and Say
// https://leetcode.com/problems/count-and-say/description/

// The count-and-say sequence is the sequence of integers with the first five terms as following:

// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n, generate the nth term of the count-and-say sequence.

// Note: Each term of the sequence of integers will be represented as a string.

// Example 1:

// Input: 1
// Output: "1"
// Example 2:

// Input: 4
// Output: "1211"


class Solution {
    public String countAndSay(int n) {
        String num = "1";
        for (int i = 1; i < n; i++) {
            num = helper(num);
        }
        return num;
    }

    private String helper(String num) {
        String n = "";
        for (int i = 0; i < num.length();) {
            int j = 0;
            while (i + j < num.length() && num.charAt(i) == num.charAt(i + j))
                j++;
            n += "" + j + num.charAt(i);
            i += j;
        }
        return n;
    }
}

// Refer-Best

class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = readString(str);
        }
        return str;
        
    }
    
    private String readString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0, count = 1; i < chars.length; i++) {
            if(i == chars.length-1 || chars[i] != chars[i+1]) {
                sb.append(count);
                sb.append(chars[i]);
                count=1;
                
            } else count++;
        }
        return sb.toString();
    }
    
    
}
