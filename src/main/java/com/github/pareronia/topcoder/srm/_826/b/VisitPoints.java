package com.github.pareronia.topcoder.srm._826.b;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class VisitPoints {
    
    private int minX, maxX, minY, maxY;
    
    public String visit(final int[] X, final int[] Y) {
        final StringBuilder ans = new StringBuilder();
        minX = Math.min(0, Arrays.stream(X).min().getAsInt());
        maxX = Arrays.stream(X).max().getAsInt();
        minY = Math.min(0, Arrays.stream(Y).min().getAsInt());
        maxY = Arrays.stream(Y).max().getAsInt();
        final Set<Cell> target = new HashSet<>();
        for (int i = 0; i < X.length; i++) {
            target.add(Cell.at(X[i], Y[i]));
        }
        final Set<Cell> seen = new HashSet<>();
        final Cell start = Cell.at(0, 0);
        final Deque<Cell> path = new ArrayDeque<>(asList(start));
        final boolean found = dfs(start, null, seen, target, path);
        if (!found) {
            throw new IllegalStateException("Unsolvable");
        }
        final List<Cell> list = path.stream().collect(toList());
        for (int i = 1; i < list.size(); i++) {
            final Cell c = list.get(i);
            final Cell p = list.get(i - 1);
            ans.append(c.direction(p));
        }
        return ans.toString();
    }
    
    private boolean dfs(final Cell start, final Cell prev, final Set<Cell> seen, final Set<Cell> target, final Deque<Cell> path) {
        if (target.contains(start)) {
            seen.add(start);
        }
        if (seen.equals(target)) {
            return true;
        }
        for (final Cell n : start.neighbours(minX, maxX, minY, maxY)) {
            if (n.equals(prev) || path.contains(n)) {
                continue;
            }
            path.addLast(n);
            if (dfs(n, start, seen, target, path)) {
                return true;
            }
//            path.removeLast();
        }
        return false;
    }
    
    private static final List<int[]> NESW = asList(
            new int[] { -1, 0 },
            new int[] { 0, 1 },
            new int[] { 1, 0 },
            new int[] { 0, -1 });
    
    static class Cell {
        final int x;
        final int y;
        
        private Cell(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
        
        public static Cell at(final int x, final int y) {
            return new Cell(x, y);
        }
        
        public List<Cell> neighbours(final int minX, final int maxX, final int minY, final int maxY) {
            final List<Cell> n = new ArrayList<>();
            for (final int[] d : NESW) {
                final int yy = y + d[0];
                if (yy < minY || yy > maxY) {
                    continue;
                }
                final int xx = x + d[1];
                if (xx < minX || xx > maxX) {
                    continue;
                }
                n.add(Cell.at(xx, yy));
            }
            return n;
        }
        
        public String direction(final Cell from) {
            if (this.y - from.y == 1) {
                return "N";
            }
            if (this.y - from.y == -1) {
                return "S";
            }
            if (this.x - from.x == 1) {
                return "E";
            }
            if (this.x - from.x == -1) {
                return "W";
            }
            throw new IllegalArgumentException();
        }

        @Override
        public String toString() {
            final StringBuilder builder = new StringBuilder();
            builder.append("Cell[x=").append(x).append(", y=").append(y).append("]");
            return builder.toString();
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
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
            return x == other.x && y == other.y;
        }
    }
}
