package com.github.pareronia.topcoder.rookiesrm._06.div1.b;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinearSignalsTestCase {
    
    private LinearSignals linearSignals;
    
    @BeforeEach
    public void setup() {
        linearSignals = new LinearSignals();
    }

    @Test
    void test() {
        doTest("..X.X.X..", 2, 3);
        doTest("..X..X..", 1, 1);
        doTest("X...X....X..", 20, 3);
        doTest(".....", 1, 0);
        doTest("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 1, 3);
        doTest("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 50, 50);
        doTest("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 25, 50);
        doTest("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 5, 11);
        doTest("X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", 1, 2);
        doTest("X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", 3, 4);
        doTest("X", 50, 1);
    }
    
    private void doTest(final String towers, final int maxDist, final int result) {
        assertThat(linearSignals.maxSignals(towers, maxDist), is(result));
    }
}
