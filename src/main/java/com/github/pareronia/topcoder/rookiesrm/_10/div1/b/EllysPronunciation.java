package com.github.pareronia.topcoder.rookiesrm._10.div1.b;

import static java.util.Arrays.asList;

import java.util.HashSet;
import java.util.Set;

public class EllysPronunciation {
    
    private static final Set<Character> VOWELS = new HashSet<>(
        asList('a', 'e', 'i', 'o', 'u')
    );
    
    public int getGood(final String[] words) {
        int ans = 0;
        for (final String w : words) {
            int cntc = 0;
            int cntv = 0;
            for (int i = 0; i < w.length(); i++) {
                if (VOWELS.contains(w.charAt(i))) {
                    cntv ++;
                } else {
                    cntc++;
                }
            }
            if (cntv == cntc) {
                ans++;
            }
        }
        return ans;
    }
}
