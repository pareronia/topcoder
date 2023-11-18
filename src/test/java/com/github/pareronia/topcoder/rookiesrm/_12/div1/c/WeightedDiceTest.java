package com.github.pareronia.topcoder.rookiesrm._12.div1.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeightedDiceTest {
    
    private WeightedDice weightedDice;
    
    @BeforeEach
    void setUp() {
        weightedDice = new WeightedDice();
    }
    
    @Test
    void test0() {
        assertThat(weightedDice.winChance(new double[] { 0.2, 0.2, 0.2, 0.2, 0.1, 0.1 }, 1), is(0.2));
    }
    
    @Test
    void test1() {
        assertThat(weightedDice.winChance(new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, 2), is(1.0));
    }
    
    @Test
    void test2() {
        assertThat(weightedDice.winChance(new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, 5), is(1.0));
    }

    @Test
    void test3() {
        assertThat(weightedDice.winChance(new double[] { 0.5, 0.5, 0.0, 0.0, 0.0, 0.0 }, 3), is(0.625));
    }
}
