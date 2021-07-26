package com.github.pareronia.topcoder.srm._810.b;

import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JoinAClub {
    
    private List<Integer> bfs(final Map<Integer, Set<Integer>> map, final int start) {
        final Deque<List<Integer>> queue = new ArrayDeque<>();
        queue.add(new ArrayList<Integer>());
        queue.peek().add(start);
        List<Integer> club = null;
        while (!queue.isEmpty()) {
            club = queue.poll();
            final List<Integer> newClub = new ArrayList<>(club);
            final Set<Integer> newMembers = new HashSet<>();
            for (final Integer m : club) {
                for (final Integer ch : map.getOrDefault(m, emptySet())) {
                    if (!club.contains(ch)) {
                        newMembers.add(ch);
                    }
                }
            }
            newClub.addAll(newMembers);
            if (newClub.size() > club.size()) {
                queue.add(newClub);
            }
        }
        return club;
    }

    public int[] maximumClub(final int n, final int[] x, final int[] y) {
        final Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int j = 0; j < x.length; j++) {
            map.merge(x[j], new HashSet<>(asList(y[j])), (l1, l2) -> {
                l1.addAll(l2);
                return l1;
            });
            map.merge(y[j], new HashSet<>(asList(x[j])), (l1, l2) -> {
                l1.addAll(l2);
                return l1;
            });
        }
        List<Integer> max = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            final List<Integer> club = bfs(map, j);
            if (club.size() > max.size()) {
                max = club;
            }
        }
        return max.stream().mapToInt(Integer::intValue).toArray();
    }
}
