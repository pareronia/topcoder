package com.github.pareronia.topcoder.rookiesrm._11.div1.a;

public class DoubleLetterCount {
    
    public int count(final String s) {
       int ans = 0;
       for (int i = 1; i < s.length(); i++) {
           if (s.charAt(i) == s.charAt(i - 1)) {
               ans++;
           }
       }
       return ans;
    }
}
