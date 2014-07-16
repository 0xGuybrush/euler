package ie.davidmoloney.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {


    public int fibonacciSum(final int max) {
        List<Integer> sequence = new ArrayList<Integer>(){{
            add(1);
            add(2);
        }};
        int total = 0;
        int lastElementIndex = sequence.size() - 1;
        while (sequence.get(lastElementIndex) <= max) {
            int next = sequence.get(lastElementIndex) + sequence.get(lastElementIndex - 1);
            if (next <= max) {
                sequence.add(next);
                lastElementIndex++;
            } else {
                break;
            }

        }
        for (Integer entry : sequence) {
            if (isEven(entry)) {
                total += entry;
            }
        }
        return total;
    }

    private boolean isEven(final Integer entry) {
        return entry % 2 == 0;
    }
}
