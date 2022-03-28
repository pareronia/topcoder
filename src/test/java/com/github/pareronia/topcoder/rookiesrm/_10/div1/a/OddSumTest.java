package com.github.pareronia.topcoder.rookiesrm._10.div1.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OddSumTest {
    
    private OddSum oddSum;
    
    @BeforeEach
    void setUp() {
        oddSum = new OddSum();
    }

    @Test
    void test0() {
        assertThat(oddSum.getSum(new int[] { 1, 2, 3 }), is(4));
    }
    
    @Test
    void test1() {
        assertThat(oddSum.getSum(new int[] { 2, 4, 6 }), is(0));
    }
    
    @Test
    void test2() {
        assertThat(oddSum.getSum(new int[] { 8, 3, 3, 4 }), is(6));
    }
    
    @Test
    void test3() {
        assertThat(oddSum.getSum(new int[] { 73, 82, 16, 47 }), is(120));
    }
}
