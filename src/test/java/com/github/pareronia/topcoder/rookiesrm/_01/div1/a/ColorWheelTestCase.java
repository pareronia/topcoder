package com.github.pareronia.topcoder.rookiesrm._01.div1.a;

import static java.util.Arrays.asList;
import static org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorWheelTestCase {
    
    private static final List<String> COLORS = asList(
            "Red", "Orange", "Yellow", "Green", "Blue", "Purple"
    );
    private static final List<Pair<String, String>> SAME = asList(
            Tuples.pair("Red", "Red"),
            Tuples.pair("Orange", "Orange"),
            Tuples.pair("Yellow", "Yellow"),
            Tuples.pair("Green", "Green"),
            Tuples.pair("Blue", "Blue"),
            Tuples.pair("Purple", "Purple")
    );
    private static final List<Pair<String, String>> ADJACENT = asList(
            Tuples.pair("Red", "Orange"),
            Tuples.pair("Orange", "Red"),
            Tuples.pair("Orange", "Yellow"),
            Tuples.pair("Yellow", "Orange"),
            Tuples.pair("Yellow", "Green"),
            Tuples.pair("Green", "Yellow"),
            Tuples.pair("Green", "Blue"),
            Tuples.pair("Blue", "Green"),
            Tuples.pair("Blue", "Purple"),
            Tuples.pair("Purple", "Blue"),
            Tuples.pair("Purple", "Red"),
            Tuples.pair("Red", "Purple")
    );
    private static final List<Pair<String, String>> COMPLEMENTARY = asList(
            Tuples.pair("Red", "Green"),
            Tuples.pair("Green", "Red"),
            Tuples.pair("Orange", "Blue"),
            Tuples.pair("Blue", "Orange"),
            Tuples.pair("Yellow", "Purple"),
            Tuples.pair("Purple", "Yellow")
    );
    
    private ColorWheel colorWheel;
    
    @BeforeEach
    public void setup() {
        colorWheel = new ColorWheel();
    }

    @Test
    void testSame() {
        for (final Pair<String,String> pair : SAME) {
            assertThat(colorWheel.describePair(pair.getOne(), pair.getTwo()),
                    is("Same"));
        }
    }
    
    @Test
    public void testAdjacent() {
        for (final Pair<String,String> pair : ADJACENT) {
            assertThat(colorWheel.describePair(pair.getOne(), pair.getTwo()),
                    is("Adjacent"));
        }
    }
    
    @Test
    public void testComplementary() {
        for (final Pair<String,String> pair : COMPLEMENTARY) {
            assertThat(colorWheel.describePair(pair.getOne(), pair.getTwo()),
                    is("Complementary"));
        }
    }
    
    @Test
    public void testNone() {
        combinationsIterator(COLORS.size(), 2).forEachRemaining(c -> {
            final Pair<String, String> pair
                    = Tuples.pair(COLORS.get(c[0]), COLORS.get(c[1]));
            if (!SAME.contains(pair)
                    && !ADJACENT.contains(pair)
                    && !COMPLEMENTARY.contains(pair)) {
                assertThat(colorWheel.describePair(pair.getOne(), pair.getTwo()),
                        is("None"));
            }
        });
    }
}
