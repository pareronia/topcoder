package com.github.pareronia.topcoder.rookiesrm._11.div1.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoubleLetterCountTest {
    
    private DoubleLetterCount doubleLetterCount;
    
    @BeforeEach
    void setUp() {
        doubleLetterCount = new DoubleLetterCount();
    }

    @Test
    void test0() {
        assertThat(doubleLetterCount.count("MISS"), is(1));
    }
    
    @Test
    void test1() {
        assertThat(doubleLetterCount.count("COMMITTEE"), is(3));
    }
    
    @Test
    void test2() {
        assertThat(doubleLetterCount.count("AABAAC"), is(2));
    }
    
    @Test
    void test3() {
        assertThat(doubleLetterCount.count("ABCDEFG"), is(0));
    }
    
    @Test
    void test4() {
        assertThat(doubleLetterCount.count("AXXBCYWWYDEFZZ"), is(3));
    }
}
