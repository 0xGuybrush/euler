package ie.davidmoloney.euler;

public class Problem3 {

    public long largestPrimeFactor(long number) {
        long factor = 2;
        while (number > factor) {
            if (isDivisibleBy(number, factor)) {
                number = number/factor;
            } else {
                factor++;
            }
        }
        return factor;
    }

    private boolean isDivisibleBy(final long number, final long factor) {
        return number % factor == 0;
    }


}
