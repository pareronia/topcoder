package com.github.pareronia.topcoder.rookiesrm._11.div1.b;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleCountingTest {
    
    private TriangleCounting triangleCounting;
    
    @BeforeEach
    void setUp() {
        triangleCounting = new TriangleCounting();
    }

    @Test
    void test0() {
        assertThat(triangleCounting.count(
                new int[] { 0, 2, 4 },
                new int[] { 0, 5, 3 }),
            is(1));
    }

    @Test
    void test1() {
        assertThat(triangleCounting.count(
                new int[] { 0, 2, 4, 6 },
                new int[] { 0, 5, 3, 15 }),
            is(3));
    }

    @Test
    void test2() {
        assertThat(triangleCounting.count(
                new int[] { 0, 2, 6 },
                new int[] { 0, 5, 15 }),
            is(0));
    }

    @Test
    void test3() {
        assertThat(triangleCounting.count(
                new int[] { 0, 2, 4, 6, 8 },
                new int[] { 0, 5, 3, 15, 6 }),
            is(8));
    }

    @Test
    void test4() {
        assertThat(triangleCounting.count(
                new int[] { 0, 1, 2, 3, 4, 5, 6 },
                new int[] { 1, 2, 3, 4, 5, 6, 7 }),
            is(0));
    }

    @Test
    void test5() {
        assertThat(triangleCounting.count(
                new int[] { 0, 0, 1 },
                new int[] { 0, 0, 1 }),
            is(0));
    }

    @Test
    void testCase9() {
        assertThat(triangleCounting.count(
                new int[] { 640, 828, 645, 816, 290, 309, 864, 282, 71, 72, 921, 157, 552, 568, 647, 879, 311, 692, 236, 135, 791, 946, 524, 703, 551, 253, 941, 764, 343, 822, 998, 688, 627, 36, 236, 829, 469, 342, 902, 791, 190, 642, 82, 323, 974, 594, 383, 569, 624, 371 },
                new int[] { 977, 804, 814, 697, 754, 694, 303, 942, 264, 37, 369, 100, 940, 250, 74, 232, 531, 515, 332, 819, 410, 969, 790, 445, 946, 149, 863, 201, 730, 958, 870, 371, 139, 973, 846, 194, 875, 930, 282, 542, 525, 527, 77, 865, 421, 90, 702, 833, 248, 741 }),
            is(19_600));
    }

    @Test
    void testCase12() {
        assertThat(triangleCounting.count(
                new int[] { 237, 117, 131, 385, 492, 68, 715, 161, 564, 256, 57, 927, 794, 216, 527, 74, 148, 903, 694, 569, 865, 86, 748, 161, 30, 852, 201, 48, 426, 328, 736, 803, 312, 86, 278, 741, 494, 219, 625, 303, 557, 871, 396, 197, 829, 77, 588, 747, 128, 448 },
                new int[] { 33, 819, 155, 664, 634, 151, 369, 970, 355, 640, 867, 667, 736, 236, 520, 254, 615, 708, 939, 787, 580, 929, 277, 390, 11, 994, 691, 550, 332, 953, 264, 454, 920, 978, 295, 918, 648, 648, 452, 126, 371, 524, 865, 985, 436, 891, 134, 160, 677, 574 }),
            is(19_600));
    }
}
