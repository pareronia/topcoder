package com.github.pareronia.topcoder.srm._810.a;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DistinctStrings {

    public String[] generate(final int l, final String letters, final int n) {
        final Set<String> anss = new HashSet<>();
        final Random rand = new Random();
        while (anss.size() < n) {
            final char[] s = new char[l];
            for (int j = 0; j < l; j++) {
                final int r = rand.nextInt(letters.length());
                s[j] = letters.charAt(r);
            }
            anss.add(new String(s));
        }
        return anss.stream().toArray(String[]::new);
    }
}
