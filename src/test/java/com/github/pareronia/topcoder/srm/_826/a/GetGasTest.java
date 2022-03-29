package com.github.pareronia.topcoder.srm._826.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetGasTest {
    
    private GetGas getGas;
    
    @BeforeEach
    void setUp() {
        getGas = new GetGas();
    }

    @Test
    void test0() {
        assertThat(getGas.optimize(10, new int[] { 250, 250 }, new int[] { 500, 600 }, new int[] { 400, 400 }), is(8_000d));
    }

    @Test
    void test1() {
        assertThat(getGas.optimize(10, new int[] { 250, 250 }, new int[] { 500, 600 }, new int[] { 500, 400 }), is(9_600d));
    }

    @Test
    void test2() {
        assertThat(getGas.optimize(100, new int[] { 10, 20, 30, 1000 }, new int[] { 30, 20, 10, 1000 }, new int[] { 423, 434, 445, 456 }), is(0d));
    }

    @Test
    void test3() {
        assertThat(getGas.optimize(10, new int[] { 240, 260 }, new int[] { 1000, 10 }, new int[] { 417, 233 }), is(16_513.2d));
    }
}
