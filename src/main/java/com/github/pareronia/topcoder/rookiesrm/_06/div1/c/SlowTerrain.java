package com.github.pareronia.topcoder.rookiesrm._06.div1.c;

import static java.util.Arrays.asList;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SlowTerrain {
    
    private int findFastestPath(final int[][] grid, final int[] start, final int[] dest) {
        final Set<int[]> dRC = new HashSet<>(asList(
                new int[] { 0, 1 }, new int[] { 0, -1 }, new int[] { 1, 0 }, new int[] { -1, 0 }));
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(e -> e[2]));
        final Set<int[]> seen = new HashSet<>();
        queue.add(new int[] { dest[0], dest[1], 0 });
        while (!queue.isEmpty()) {
            final int[] e = queue.poll();
            final int rr = e[0];
            final int cc = e[1];
            final int dist = e[2];
            if (rr == start[0] && cc == start[1]) {
                return dist;
            }
            seen.add(new int[] { rr, cc });
            for (final int[] d : dRC) {
                final int[] newRC = new int[] { rr + d[0], cc + d[1] };
                if (0 <= newRC[0] && newRC[0] < grid.length
                        && 0 <= newRC[1] && newRC[1] < grid[0].length) {
                    if (seen.stream().noneMatch(s -> s[0] == newRC[0] && s[1] == newRC[1])) {
                        queue.add(new int[] { newRC[0], newRC[1], dist + grid[newRC[0]][newRC[1]] });
                    }
                }
            }
        }
        throw new IllegalStateException("Unsolvable");
    }

    public int fastestPath(final String[] terrain) {
        final int[][] grid = new int[terrain.length][terrain[0].length()];
        int[] start = new int[2];
        int[] dest = new int[2];
        for (int rr = 0; rr < terrain.length; rr++) {
            for (int cc = 0; cc < terrain[rr].length(); cc++) {
                final char ch = terrain[rr].charAt(cc);
                if (ch == 'S') {
                    start = new int[] { rr, cc };
                    grid[rr][cc] = 0;
                } else if (ch == 'D') {
                    dest = new int[] { rr, cc };
                    grid[rr][cc] = 0;
                } else {
                    grid[rr][cc] = Character.digit(ch, 10);
                }
            }
        }
        return findFastestPath(grid, start, dest);
    }
}
