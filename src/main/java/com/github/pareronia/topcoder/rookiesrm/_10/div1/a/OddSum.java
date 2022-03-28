package com.github.pareronia.topcoder.rookiesrm._10.div1.a;

import java.util.Arrays;

public class OddSum {
    
    public int getSum(final int[] x) {
        return Arrays.stream(x).filter(xx -> xx % 2 == 1).sum();
    }
}
