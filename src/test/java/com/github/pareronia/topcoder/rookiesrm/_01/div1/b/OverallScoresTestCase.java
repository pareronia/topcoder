package com.github.pareronia.topcoder.rookiesrm._01.div1.b;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OverallScoresTestCase {
    
    private OverallScores overallScores;
    
    @BeforeEach
    public void setup() {
        overallScores = new OverallScores();
    }

    @Test
    void test() {
        doTest(2, new int[] { 10, 20, 30, 40 }, 1);
        doTest(2, new int[] { 1, 1, 1, 1 }, 0);
        doTest(3, new int[] { 71, 23, 18, 15, 28, 93, 11, 12, 13 }, 2);
        doTest(2, new int[] { 11, 2, 3, 4, 5, 6 }, 0);
        doTest(3, new int[] { 1, 2, 3, 4, 5, 6 }, 2);
        doTest(2, new int[] { 10, 20, 20, 10 }, 0);
        doTest(2, new int[] { 1, 1, 1, 2 }, 1);
        doTest(2, new int[] { 1, 2, 1, 2 }, 1);
        doTest(2, new int[] { 1, 1, 2, 1, 1, 10 }, 1);
        doTest(3, new int[] { 71, 23, 18, 15, 28, 93, 11, 12, 13 }, 2);
        doTest(2, new int[] { 40, 30, 20, 10 }, 0);
        doTest(2, new int[] { 0, 0, 0, 0, 0, 1 }, 1);
        doTest(2, new int[] { 0, 0, 0, 0 }, 0);
    }
    
    private void doTest(final int n, final int[] scores, final int result) {
        assertThat(overallScores.findWinner(n, scores), is(result));
    }
}
