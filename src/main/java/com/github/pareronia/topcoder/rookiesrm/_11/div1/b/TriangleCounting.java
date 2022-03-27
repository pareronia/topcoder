package com.github.pareronia.topcoder.rookiesrm._11.div1.b;

public class TriangleCounting {
    
    private int area(final int x1, final int y1, final int x2, final int y2, final int x3, final int y3) {
        return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
    }
    
    public int count(final int[] x, final int[] y) {
        int cnt = 0;
        for (int i = 0; i < x.length - 2; i++) {
            for (int j = i + 1; j < x.length - 1; j++) {
                for (int k = j + 1; k < x.length; k++) {
                    if (area(x[i], y[i], x[j], y[j], x[k], y[k]) != 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
