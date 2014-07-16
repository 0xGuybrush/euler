package ie.davidmoloney.euler;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public int implA(final int max) {
        int total = 0;
        for (int i = 0; i < max; i ++) {
            if (isAMultipleOf(i, 3) || isAMultipleOf(i, 5)) {
                total += i;
            }
        }
        return total;
    }
    
    public int implB(final int max) {
        Set<Integer> multiples = new HashSet<>();
        int total = 0;
        for (int i = 0; i < max; i += 3) {
            multiples.add(i);
        }

        for (int i = 0; i < max; i += 5) {
            multiples.add(i);
        }

        for (final Integer next : multiples) {
            total += next;
        }

        return total;
    }

    private boolean isAMultipleOf(final int a, final int b) {
        return a % b == 0;
    }
}
