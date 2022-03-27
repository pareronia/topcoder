package com.github.pareronia.topcoder.rookiesrm._11.div1.c;

import static java.util.Arrays.asList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ChamberCount {

    public int count(final String[] map) {
        final char[][] g = new char[map.length][map[0].length()];
        for (int i = 0; i < map.length; i++) {
            g[i] = map[i].toCharArray();
        }
        int ans = 0;
        for (int r = 0; r < g.length; r++) {
            for (int c = 0; c < g[r].length; c++) {
                if (g[r][c] == 'X') {
                    continue;
                }
                ans++;
                final Deque<Cell> q = new ArrayDeque<>();
                final Set<Cell> seen = new HashSet<>();
                q.add(Cell.at(r, c));
                while (!q.isEmpty()) {
                    final Cell curr = q.poll();
                    seen.add(curr);
                    g[curr.r][curr.c] = 'X';
                    for (final Cell n : curr.neighbours(g.length, g[r].length)) {
                        if (g[n.r][n.c] != '.' || seen.contains(n)) {
                            continue;
                        }
                        q.add(n);
                    }
                }
            }
        }
        return ans;
    }
    
    private static final List<int[]> NESW = asList(
            new int[] { -1, 0 },
            new int[] { 0, 1 },
            new int[] { 1, 0 },
            new int[] { 0, -1 });
    
    private static class Cell {
        private final int r;
        private final int c;
        
        private Cell(final int r, final int c) {
            this.r = r;
            this.c = c;
        }

        public static Cell at(final int r, final int c) {
            return new Cell(r, c);
        }
        
        public List<Cell> neighbours(final int nr, final int nc) {
            final List<Cell> n = new ArrayList<>();
            for (final int[] d : NESW) {
                final int rr = r + d[0];
                if (rr < 0 || rr >= nr) {
                    continue;
                }
                final int cc = c + d[1];
                if (cc < 0 || cc >= nc) {
                    continue;
                }
                n.add(Cell.at(rr, cc));
            }
            return n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(c, r);
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Cell other = (Cell) obj;
            return c == other.c && r == other.r;
        }
    }
}
