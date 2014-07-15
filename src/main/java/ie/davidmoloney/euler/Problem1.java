package ie.davidmoloney.euler;

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

    private boolean isAMultipleOf(final int a, final int b) {
        return a % b == 0;
    }
}
