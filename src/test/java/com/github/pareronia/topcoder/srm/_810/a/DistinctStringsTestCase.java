package com.github.pareronia.topcoder.srm._810.a;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistinctStringsTestCase {

    private DistinctStrings distinctStrings;
    
    @BeforeEach
    private void setup() {
        distinctStrings = new DistinctStrings();
    }
    
    @Test
    void test1() {
        final String[] result
                = distinctStrings.generate(5, "qwertyuiopasdfghjklzxcvbnm", 10);
        
        assertThat(result.length, is(10));
        Arrays.stream(result).forEach(System.out::println);
    }
    
    @Test
    void test2() {
        final String[] result
                = distinctStrings.generate(3, "ABCDE02468", 17);
        
        assertThat(result.length, is(17));
        Arrays.stream(result).forEach(System.out::println);
    }
    
    @Test
    void test3() {
        final String[] result
                = distinctStrings.generate(8, "cdeopPrRtT", 4);
        
        assertThat(result.length, is(4));
        Arrays.stream(result).forEach(System.out::println);
    }

    @Test
    void test8() {
        final String[] result
                = distinctStrings.generate(3, "EZyo9Uc1IOKBG4JPWxMvAC", 121);
        
        assertThat(result.length, is(121));
        Arrays.stream(result).forEach(System.out::println);
    }
}
