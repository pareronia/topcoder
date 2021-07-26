package com.github.pareronia.topcoder.rookiesrm._02.div1.a;

public class FriendFinder {
    
    public int distance(final String line) {
        final int friend = line.indexOf("F");
        final int self = line.indexOf("S");
        
        return Math.abs(friend - self);
    }
}
