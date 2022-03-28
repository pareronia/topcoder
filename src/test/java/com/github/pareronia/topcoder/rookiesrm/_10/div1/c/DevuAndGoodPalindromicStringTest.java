package com.github.pareronia.topcoder.rookiesrm._10.div1.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DevuAndGoodPalindromicStringTest {
    
    private DevuAndGoodPalindromicString devuAndGoodPalindromicString;
    
    @BeforeEach
    void setUp() {
        devuAndGoodPalindromicString = new DevuAndGoodPalindromicString();
    }
    
    @Test
    void test() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("abcdd"), is("good"));
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("abcddd"), is("good"));
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("abcdeeeeeeed"), is("good"));
    }

    @Test
    void test0() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("aa"), is("good"));
    }

    @Test
    void test1() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("ab"), is("not good"));
    }

    @Test
    void test2() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("abcdcd"), is("good"));
    }

    @Test
    void test3() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("abcfb"), is("not good"));
    }
    
    @Test
    void test4() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("dyofbggtfhlplctmmofhgbegsqgzaecjs"), is("good"));
    }
    
    @Test
    void test5() {
        assertThat(devuAndGoodPalindromicString.isGoodPalindrome("deqmxlgoeiwqsrlyfbpgnmr"), is("not good"));
    }
}
