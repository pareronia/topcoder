package com.github.pareronia.topcoder.rookiesrm._02.div1.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.pareronia.topcoder.rookiesrm._02.div1.a.FriendFinder;

class FriendFinderTestCase {
    
    private FriendFinder ff;
    
    @BeforeEach
    public void setup() {
        ff = new FriendFinder();
    }

    @Test
    void test0() {
        assertThat(ff.distance("....SF..."), is(1));
    }

    @Test
    void test1() {
        assertThat(ff.distance("S........F"), is(9));
    }
    
    @Test
    void test2() {
        assertThat(ff.distance("..F...S.."), is(4));
    }
}
