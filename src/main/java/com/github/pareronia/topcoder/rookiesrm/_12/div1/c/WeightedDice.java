package com.github.pareronia.topcoder.rookiesrm._12.div1.c;

public class WeightedDice {
    
    public double winChance(final double[] prob, final int target) {
        final double[] dp = new double[target + 1];
        try {
            dp[1] = prob[0];
            dp[2] = prob[1] + prob[0] * prob[0];
            dp[3] = prob[2] + 2 * prob[1] * prob[0] + prob[0] * prob[0] * prob[0];//dp[2];// * dp[1];// + dp[1] * dp[2];
            dp[4] = prob[3] + dp[3] * dp[1] + dp[2] * dp[2] + dp[1] * dp[3];
            dp[5] = prob[4] + 2 * dp[4] * dp[1] + 2 * dp[3] * dp[2];
        } catch (final ArrayIndexOutOfBoundsException e) {
        }
        return Math.min(dp[target], 1.0);
    }
}
