package com.github.pareronia.topcoder.rookiesrm._10.div1.c;

public class DevuAndGoodPalindromicString {
    
    public String isGoodPalindrome(final String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            boolean b = false;
            for (int j = i + 2; j <= s.length(); j++) {
                final String ss = s.substring(i, j);
                if (ss.equals(new StringBuilder(ss).reverse().toString())) {
                    b = true;
                    break;
                }
            }
            if (b) {
                return "good";
            }
        }
        return "not good";
    }
}
