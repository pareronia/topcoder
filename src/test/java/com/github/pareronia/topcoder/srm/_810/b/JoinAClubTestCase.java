package com.github.pareronia.topcoder.srm._810.b;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JoinAClubTestCase {
    
    private JoinAClub joinAClub;
    
    @BeforeEach
    private void setup() {
        joinAClub = new JoinAClub();
    }

    @Test
    void test0() {
        final int[] result = joinAClub.maximumClub(
                5,
                new int[] {},
                new int[] {});
        
        final Set<Integer> club = Arrays.stream(result).boxed().collect(toSet());
        assertThat(club.size(), is(1));
    }
    
    @Test
    void test1() {
        final int[] result = joinAClub.maximumClub(
                4,
                new int[] { 0, 0, 0, 1, 1, 3 },
                new int[] { 1, 2, 3, 3, 2, 2 });
        
        final List<Integer> club = asList(result);
        assertThat(club, containsInAnyOrder(0, 1, 2, 3));
    }

    @Test
    void test2() {
        final int[] result = joinAClub.maximumClub(
                6,
                new int[] { 0, 1, 2, 5 },
                new int[] { 3, 3, 3, 3 });
        
        assertThat(asList(result), containsInAnyOrder(0, 1, 2, 3, 5));
    }

    @Test
    void test3() {
        final int[] result = joinAClub.maximumClub(
                47,
                new int[] { 0, 4, 6, 6, 42 },
                new int[] { 13, 7, 7, 23, 15 });
        
        assertThat(asList(result), containsInAnyOrder(4, 6, 7, 23));
    }
    
    @Test
    void test4() {
        final int[] result = joinAClub.maximumClub(
                47,
                new int[] { 0, 14, 6, 6, 42 },
                new int[] { 13, 7, 7, 23, 15 });
        
        assertThat(asList(result), containsInAnyOrder(6, 7, 14, 23));
    }
    
    @Test
    void test12() {
        final int[] result = joinAClub.maximumClub(
                25,
                new int[] { 11, 15, 1, 18, 22, 7, 12, 0, 6, 13, 16, 11, 19, 10, 2, 6, 13, 6, 0, 19, 0, 17, 17, 15, 10, 1, 20, 13, 0, 1, 6, 19, 1, 18, 12, 14, 2, 21, 12 },
                new int[] { 24, 8, 23, 23, 15, 8, 1, 12, 24, 11, 2, 23, 20, 14, 5, 7, 15, 9, 3, 18, 8, 6, 11, 6, 12, 21, 18, 10, 9, 19, 16, 0, 17, 1, 24, 6, 8, 20, 16 });
        
        assertThat(asList(result), containsInAnyOrder(2, 5, 8, 16, 0, 7, 15, 6, 12, 3, 9, 19, 13, 22, 14, 17, 24, 1, 10, 18, 20, 11, 21, 23));
    }

    private List<Integer> asList(final int[] result) {
        return Arrays.stream(result).boxed().collect(toList());
    }
}
