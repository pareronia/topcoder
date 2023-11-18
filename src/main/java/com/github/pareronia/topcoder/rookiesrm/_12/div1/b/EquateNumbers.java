package com.github.pareronia.topcoder.rookiesrm._12.div1.b;

import java.util.Arrays;

public class EquateNumbers {
    
    private static int gcd(final int a, final int b) {
        if (a == 0 || b == 0) {
            return Math.abs(a - b);
        }
        final int m = a % b;
        return m == 0 ? b : gcd(b, m);
    }
    
    public String canMakeEqual(final int[] A) {
        if (Arrays.stream(A).distinct().count() == 1) {
            return "yes";
        } else {
            int g = 0;
            for (final int a : A) {
                g = gcd(a, g);
            }
            return g > 1 ? "yes" : "no";
        }
    }
}
