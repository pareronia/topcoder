package com.github.pareronia.topcoder.rookiesrm._02.div1.b;

public class PairedMultiples {

    public int selectedTotal(final int[] values, final int multiple) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((values[i] + values[j]) % multiple == 0) {
                    sum += values[i];
                    break;
                }
            }
        }
        return sum;
    }
}
