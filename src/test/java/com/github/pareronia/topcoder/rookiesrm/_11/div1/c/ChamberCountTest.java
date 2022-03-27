package com.github.pareronia.topcoder.rookiesrm._11.div1.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChamberCountTest {
    
    private ChamberCount chamberCount;
    
    @BeforeEach
    void setUp() {
        chamberCount = new ChamberCount();
    }

    @Test
    void test0() {
        assertThat(chamberCount.count(new String[]
                {       "...",
                        "...",
                        "..."}),
                is(1));
    }

    @Test
    void test1() {
        assertThat(chamberCount.count(new String[]
                {       "XX",
                        "XX"}),
                is(0));
    }

    @Test
    void test2() {
        assertThat(chamberCount.count(new String[]
                {       ".X.",
                        "X.X",
                        ".X."}),
                is(5));
    }

    @Test
    void test3() {
        assertThat(chamberCount.count(new String[]
                {       "X...",
                        ".XX.",
                        "...."}),
                is(1));
    }

    @Test
    void test4() {
        assertThat(chamberCount.count(new String[]
                {       "XXXXX.",
                        "XXXXX.",
                        "XX..X.",
                        "X..XX.",
                        "X.X.XX",
                        "XX.X.."}),
                is(5));
    }
}
