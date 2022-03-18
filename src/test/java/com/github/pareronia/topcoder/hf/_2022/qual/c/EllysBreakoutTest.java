package com.github.pareronia.topcoder.hf._2022.qual.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EllysBreakoutTest {
    
    private EllysBreakout ellysBreakout;
    
    @BeforeEach
    void setUp() {
        ellysBreakout = new EllysBreakout();
    }

    @Test
    void test1() {
        assertThat(ellysBreakout.getCount(new String[]
            {       ".#............",
                    ".#####........",
                    ".#.#..#.......",
                    ".##.#.#.......",
                    ".#.#..#..####.",
                    ".#...##..#.##.",
                    "..####...###.."}),
            is(1));
    }

    @Test
    void test2() {
        assertThat(ellysBreakout.getCount(new String[]
            {       "..#",
                    "...",
                     ".#."}),
                is(7));
    }

    @Test
    void test3() {
        assertThat(ellysBreakout.getCount(new String[]
                {       "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#",
                        "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#",
                        "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#",
                        "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#",
                        "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#",
                        "#.#.#.#.#.#.#.#.#.",
                        ".#.#.#.#.#.#.#.#.#"}),
                is(8));
    }
    
    @Test
    void test4() {
        assertThat(ellysBreakout.getCount(new String[]
                {       "#########",
                        "#########",
                        "#########",
                        "#########",
                        "####.####",
                        "####.####",
                        "####.####",
                        "#########",
                        "#########",
                        "#########",
                        "#########"}),
                is(3));
    }
    
    @Test
    void test5() {
        assertThat(ellysBreakout.getCount(new String[]
                {       "#...##.......#..#..#..#.#..#..###............##...",
                        "....#.....#....#...###..#....#......#.#.......#.#.",
                        "......#....#..#.....#.#..#...#.#..##.......#.....#",
                        "................#..#......##........#..#....##...#",
                        "###..#..#.#....##...#...........#.##..###..##.....",
                        ".##..#......#...........#.##...##..#.....#.....#..",
                        "....#..##...#..#.#........##.#....................",
                        ".#.#.#.##.....#.........#......#.......#..#.##.#..",
                        "..#....#......#........#...#.#...#.#....#........#",
                        "#.#....#..#.#.#.#....#.....................#.#....",
                        ".#....#..#.......#.........#....#.#............##.",
                        "..##......#....###..#...#.#..#.....##........#..#.",
                        "........#.#..........#......#........##.#.#.#....#",
                        "....#.#..####...#..#.....#.###..##....#.#.......#.",
                        "....#....#...#................###.#......##.......",
                        ".#.....#..#.....##....#......................##.#.",
                        "#.................#.......#...#...........#....#..",
                        "............#........#.....#.#.....#.#.....#..##..",
                       "#......#.#..#.#.##..#.........#..#.#.....#.....#..",
                        "....#..###.#........#.#.....................##....",
                        "......##...###..#...#.##..#..#.##....#.........##.",
                        ".......#...............#....#...#......##....#..#.",
                        ".#...#.##....#...#........###..##.#....#...##.....",
                        "....#........#..............#..###.#.#..#.....#.##",
                        ".#...#..#.....#.#...#...........#....##.....#.#...",
                        "...#..#.#.#..##....#............#.....#........###",
                        ".##......#.#..##.......###...##...................",
                        "..........#.............#.#...#.....###...##..##..",
                        ".......##...#.#...#.........#.#.....#.#..#.#...#..",
                        "####.........#.#.....#....#.#......#.#.....#..#...",
                        ".#.#...#..###...#.#.#.....###.#....##.....#...#..#",
                        ".#..#.##.#.###....#.###..#..........#...#.........",
                        "##..#.#....#..##...#.....##..#..##..............##",
                        "#.##.##..........##.#....##......#...#.....##...#.",
                        ".....#........#..............#.....####.######....",
                        "..##............#..###.##...#.#...#.....#.#...#..#",
                        "...##..#.#...#......#.#..........#..#..##..#.#..#.",
                        "..##.####......#....#....#.....#......#....##.....",
                        "#.......####.#......##.#.....#..#........#...##.#.",
                        "..#.....#..###....#......#..#........#....####....",
                        "......#.....#..................#.........#.##...#.",
                        "...#....#....##......#.#.....#.....#....#......#..",
                        "....#.##...#.#....#..#.#...#.......##.......#.#...",
                        "...#..#.#.##.#.....###....#.###.....##.#......#...",
                        ".#.#......#.....#.....#...........##...#.....#.##.",
                        "..........#.....#...#.##....#..........#.....###..",
                        "........##..#.....#...#....##..#......##.......#..",
                        ".....#....##....#.....#....#.#.#.........#........",
                        "..#...##......#.#............#....#.##...#....#...",
                        "..##...#.#...#......#....##.#.#..#......#..######."}),
                is(13));
    }
}
