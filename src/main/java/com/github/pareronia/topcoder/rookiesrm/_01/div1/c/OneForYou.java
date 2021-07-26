package com.github.pareronia.topcoder.rookiesrm._01.div1.c;

public class OneForYou {
    
    public long coinCount(final long n) {
         return n - (long) Math.ceil((-3 + Math.sqrt(9 + 8 * n)) / 2);
    }
}
