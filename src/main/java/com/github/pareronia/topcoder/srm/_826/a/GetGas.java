package com.github.pareronia.topcoder.srm._826.a;

public class GetGas {
    
    public double optimize(final int G, final int[] Dto, final int[] Dfrom, final int[] gasPrice) {
        double ans = Double.MAX_VALUE;
        for (int i = 0; i < Dto.length; i++) {
            final int cap = G * 25;
            if (cap >= Dto[i] + Dfrom[i]) {
                ans = 0d;
                break;
            }
            if (cap < Dto[i]) {
                continue;
            }
            final double used = (Dto[i]) / 25d;
            final double needed = (Dfrom[i]) / 25d;
            final double buy = needed - (G - used);
            final double cost = buy * gasPrice[i];
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}
