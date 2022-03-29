package com.github.pareronia.topcoder.srm._826.b;

import static java.util.stream.Collectors.toSet;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Set;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.pareronia.topcoder.srm._826.b.VisitPoints.Cell;

class VisitPointsTest {
    
    private VisitPoints visitPoints;
    
    @BeforeEach
    void setUp() {
        visitPoints = new VisitPoints();
    }

    @Test
    void test0() {
        final int[] X = new int[] { 1, 2, 3 };
        final int[] Y = new int[] { 1, 2, 5 };
        
        final String ans = visitPoints.visit(X, Y);
        
        check(X, Y, ans);
    }

    @Test
    void test1() {
        final int[] X = new int[] { 1, 7, 3, 9, 5 };
        final int[] Y = new int[] { 1, 1, 1, 1, 1 };
        
        final String ans = visitPoints.visit(X, Y);
        
        check(X, Y, ans);
    }


    @Test
    void test2() {
        final int[] X = new int[] { 4, 11, 13, 18, 12 };
        final int[] Y = new int[] { 21, 4, 17, 9, 19 };
        
        final String ans = visitPoints.visit(X, Y);
        
        check(X, Y, ans);
    }

    private void check(final int[] X, final int[] Y, final String ans) throws AssertionError {
        final Set<Cell> targets = IntStream.range(0, X.length)
                .mapToObj(j -> Cell.at(X[j], Y[j]))
                .collect(toSet());
        Cell c = Cell.at(0, 0);
        for (int j = 0; j < ans.length(); j++) {
            final char ch = ans.charAt(j);
            if (ch == 'N') {
                c = Cell.at(c.x, c.y + 1);
            } else if (ch == 'S') {
                c = Cell.at(c.x, c.y - 1);
            } else if (ch == 'E') {
                c = Cell.at(c.x + 1, c.y);
            } else if (ch == 'W') {
                c = Cell.at(c.x - 1, c.y);
            } else {
                throw new AssertionError();
            }
            if (targets.contains(c)) {
                targets.remove(c);
            }
        }
        assertThat(targets.size(), is(0));
    }
}
