package com.github.pareronia.topcoder.rookiesrm._06.div1.b;

import java.util.Arrays;

public class LinearSignals {
    
    private static final char TOWER = 'X';
    
    public int maxSignals(final String towers, final int maxDist) {
        final int cnt[] = new int[towers.length()];
        for (int i = 0; i < towers.length(); i++) {
            for (int j = 0; j < towers.length(); j ++) {
                if (towers.charAt(j) == TOWER && Math.abs(j - i) <= maxDist) {
                    cnt[i] += 1;
                }
            }
        }
        return Arrays.stream(cnt).max().getAsInt();
    }
}
