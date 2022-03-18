package com.github.pareronia.topcoder.hf._2022.qual.c;

import static java.util.Arrays.asList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EllysBreakout {

    private static final char WALL = '#';
    private static final List<int[]> NESW = asList(
            new int[] { -1, 0 },
            new int[] { 0, 1 },
            new int[] { 1, 0 },
            new int[] { 0, -1 });

    public int getCount(final String[] plan) {
        final int n = plan.length;
        final int m = plan[0].length();
        final Map<Integer, Integer> map = new HashMap<>();
        final Map<Room, Integer> memo = new HashMap<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (plan[r].charAt(c) == WALL) {
                    continue;
                }
                final DFS dfs = new DFS(plan, memo, Room.at(r, c));
                dfs.dfs();
                map.merge(dfs.best, 1, Integer::sum);
            }
        }
        final int max = map.keySet().stream().mapToInt(Integer::valueOf)
                .max().orElseThrow(() -> new IllegalStateException());
        return map.get(max);
    }
    
    private static class DFS {
        private final String[] plan;
        private final Map<Room, Integer> memo;
        private final int n;
        private final int m;
        private final Deque<Room> path;
        private int score;
        private int best;
        
        public DFS(final String[] plan, final Map<Room, Integer> memo, final Room start) {
            this.plan = plan;
            this.n = plan.length;
            this.m = plan[0].length();
            this.memo = memo;
            this.path = new ArrayDeque<>(asList(start));
            this.score = 0;
            this.best = Integer.MAX_VALUE;
        }
        
        public void dfs() {
            final Room curr = path.peekLast();
            if (curr.r == 0 || curr.r == n - 1 || curr.c == 0 || curr.c == m - 1) {
                best = Math.min(best, score);
                memo.put(path.peekFirst(), best);
                return;
            }
            if (memo.containsKey(curr)) {
                best = Math.min(best, score + memo.get(curr));
                memo.put(path.peekFirst(), best);
                return;
            }
            if (score >= best) {
                return;
            }
            for (final Room nr : neighbours(curr)) {
                if (path.contains(nr)) {
                    continue;
                }
                final boolean wall = plan[nr.r].charAt(nr.c) == WALL;
                path.addLast(nr);
                score += (wall ? 1 : 0);
                dfs();
                path.removeLast();
                score -= (wall ? 1 : 0);
            }
        }
        
        private List<Room> neighbours(final Room room) {
            final List<Room> ans = new ArrayList<>();
            for (final int[] d : NESW) {
                final int rr = room.r + d[0];
                if (rr < 0 || rr >= n) {
                    continue;
                }
                final int cc = room.c + d[1];
                if (cc < 0 || cc >= m) {
                    continue;
                }
                ans.add(Room.at(rr, cc));
            }
            return ans;
        }
    }
    
    private static class Room {
        private final int r;
        private final int c;
        
        private Room(final int r, final int c) {
            this.r = r;
            this.c = c;
        }
        
        public static Room at(final int r, final int c) {
            return new Room(r, c);
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
            final Room other = (Room) obj;
            return c == other.c && r == other.r;
        }
    }
}
