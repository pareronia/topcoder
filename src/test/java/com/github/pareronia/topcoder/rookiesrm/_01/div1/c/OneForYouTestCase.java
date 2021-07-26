package com.github.pareronia.topcoder.rookiesrm._01.div1.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OneForYouTestCase {
    
    private OneForYou oneForYou;
    
    @BeforeEach
    public void setup() {
        oneForYou = new OneForYou();
    }

    @Test
    void test() {
        assertThat(oneForYou.coinCount(2), is(1L));
        assertThat(oneForYou.coinCount(9), is(6L));
        assertThat(oneForYou.coinCount(11), is(7L));
        assertThat(oneForYou.coinCount(33), is(26L));
        assertThat(oneForYou.coinCount(1_000_000_000_000_000L),
                    is(999_999_955_278_641L));
        assertThat(oneForYou.coinCount(12_345_678_901_234L),
                    is(12_345_673_932_195L));
        assertThat(oneForYou.coinCount(0), is(0L));
        assertThat(oneForYou.coinCount(1), is(0L));
        assertThat(oneForYou.coinCount(99_999_999_999_999L),
                    is(99_999_985_857_864L));
        assertThat(oneForYou.coinCount(100_000_000_000_000L),
                    is(99_999_985_857_865L));
        assertThat(oneForYou.coinCount(999_999_999_999_999L),
                    is(999_999_955_278_640L));
        assertThat(oneForYou.coinCount(10_000_000_000L),
                    is(9_999_858_580L));
        assertThat(oneForYou.coinCount(1_000_000_001L),
                    is(999_955_281L));
        assertThat(oneForYou.coinCount(234_124_152_345_436L),
                    is(234_124_130_706_391L));
    }
}
