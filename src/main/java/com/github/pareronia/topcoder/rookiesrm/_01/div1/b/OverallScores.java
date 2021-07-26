package com.github.pareronia.topcoder.rookiesrm._01.div1.b;

public class OverallScores {

    public int findWinner(final int n, final int[] scores) {
        final int[] totals = new int[n];
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            totals[i % n] += scores[i];
            if (totals[i % n] > max) {
                max = totals[i % n];
            }
        }
        for (int i = 0; i < totals.length; i++) {
            if (totals[i] == max) {
                return i;
            }
        }
        throw new IllegalStateException("Unsolvable");
    }
}
