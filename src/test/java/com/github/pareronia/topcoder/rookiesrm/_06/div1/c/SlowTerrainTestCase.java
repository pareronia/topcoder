package com.github.pareronia.topcoder.rookiesrm._06.div1.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlowTerrainTestCase {
    
    private SlowTerrain problem;
    
    @BeforeEach
    public void setup() {
        problem = new SlowTerrain();
    }

    @Test
    void test() {
        doTest(new String[] { "S32", "030", "41D" }, 3);
        doTest(new String[] { "3D47S6" }, 11);
        doTest(new String[] { "0S9", "09D", "000" }, 0);
        doTest(new String[] { "1S9", "29D", "345" }, 9);
        doTest(new String[] { "11199191",
                              "19119111",
                              "S9911191",
                              "19119111",
                              "11199191",
                              "19119191",
                              "19911191",
                              "11D19111" }, 6);
    }
    
    private void doTest(final String[] grid, final int result) {
        assertThat(problem.fastestPath(grid), is(result));
    }
}
