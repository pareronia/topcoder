package com.github.pareronia.topcoder.rookiesrm._06.div1.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BiggestDuplicateTestCase {
    
    private BiggestDuplicate biggestDuplicate;
    
    @BeforeEach
    public void setup() {
        biggestDuplicate = new BiggestDuplicate();
    }

    @Test
    void test() {
        doTest(new int[] { 0, 1, 20, 18, 20, 18, 3 }, 20);
        doTest(new int[] { 1, 2, 3, 4, 5 }, -1);
        doTest(new int[] {
                715, 938, 703, 223, 929, 664, 662, 773, 851, 948, 562, 226, 333,
                963, 307, 198, 276, 67, 479, 275, 685, 491, 62, 703, 223, 594,
                620, 742, 490, 464, 878, 191, 925, 588, 506, 402, 87, 821, 905,
                135, 573, 505, 913, 465, 751, 257, 536, 638, 413, 789 },
                703);
    }

    private void doTest(final int[] x, final int result) {
        assertThat(biggestDuplicate.findLargest(x), is(result));
    }
}
