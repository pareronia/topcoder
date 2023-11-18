package com.github.pareronia.topcoder.rookiesrm._12.div1.b;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquateNumbersTest {
    
    private EquateNumbers equateNumbers;
    
    @BeforeEach
    void setUp() {
        equateNumbers = new EquateNumbers();
    }

    @Test
    void test0() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 2, 4 }), is("yes"));
    }

    @Test
    void test1() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 3, 6, 7 }), is("no"));
    }

    @Test
    void test2() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 516489004, 351371688, 811236122, 359319772 }), is("yes"));
    }

    @Test
    void test3() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 774790715, 541447280, 142096365, 445121785, 583653195,
                71374815, 798454490, 409670625, 942953335, 8997395 }), is("yes"));
    }

    @Test
    void test4() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 1, 1, 1 }), is("yes"));
    }

    @Test
    void test26() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 883651031, 328918341, 952762807, 185356165, 859109720,
                406622713, 584183008, 918536468, 900035237, 934628152, 564441001, 447472784, 775352533, 947904830,
                552376142, 472005757, 802251381, 361675363, 307760433, 982838845, 921792927, 213641185, 992190582,
                282561692, 167125346, 446288299, 454929945, 731944409, 497273610, 215781365, 140099739, 545395285,
                235406172 }), is("no"));
    }
    
    @Test
    void test28() {
        assertThat(equateNumbers.canMakeEqual(new int[] { 680985439, 720089902, 913344481 }), is("no"));
    }
}
