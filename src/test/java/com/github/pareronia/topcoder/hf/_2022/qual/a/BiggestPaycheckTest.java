package com.github.pareronia.topcoder.hf._2022.qual.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.pareronia.topcoder.hf._2022.qual.a.BiggestPaycheck;

class BiggestPaycheckTest {
    
    private BiggestPaycheck biggestPaycheck;
    
    @BeforeEach
    void setUp() {
        biggestPaycheck = new BiggestPaycheck();
    }

    @Test
    void test1() {
        assertThat(biggestPaycheck.findBiggest(50, 55, 60), is(60));
    }

    @Test
    void test2() {
        assertThat(biggestPaycheck.findBiggest(999, 1, 2), is(999));
    }

    @Test
    void test3() {
        assertThat(biggestPaycheck.findBiggest(50, 50, 10), is(50));
    }
}
