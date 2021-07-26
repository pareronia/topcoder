package com.github.pareronia.topcoder.rookiesrm._06.div1.a;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BiggestDuplicate {

    public int findLargest(final int[] x) {
        final HashMap<Integer, Long> counts = Arrays.stream(x).boxed()
            .collect(groupingBy(xx -> xx, HashMap::new, counting()));
        final List<Entry<Integer, Long>> duplicates = counts.entrySet().stream()
                .filter(e -> e.getValue() > 1L)
                .collect(toList());
        if (duplicates.isEmpty()) {
            return -1;
        } else if (duplicates.size() == 1) {
            return duplicates.get(0).getKey();
        } else {
            return duplicates.stream()
                    .map(Entry::getKey)
                    .max(Comparator.naturalOrder())
                    .orElseThrow(RuntimeException::new);
        }
   }
}
