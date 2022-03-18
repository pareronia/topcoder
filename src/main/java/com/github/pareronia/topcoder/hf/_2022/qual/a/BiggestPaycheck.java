package com.github.pareronia.topcoder.hf._2022.qual.a;

import java.util.stream.IntStream;

public class BiggestPaycheck {
    
    public int findBiggest(final int a, final int b, final int c) {
        return IntStream.of(a, b, c).max()
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
