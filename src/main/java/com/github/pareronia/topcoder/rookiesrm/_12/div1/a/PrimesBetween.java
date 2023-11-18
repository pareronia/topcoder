package com.github.pareronia.topcoder.rookiesrm._12.div1.a;

public class PrimesBetween {
    
    private static final int[] PRIMES = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

    public int count(final int start, final int end) {
        int ans = 0;
        for (final int p : PRIMES) {
            if (p >= start && p <= end) {
                ans++;
            }
        }
        return ans;
    }
}
