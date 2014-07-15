package ie.davidmoloney.euler;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem1Test {

    @Test
    public void test_that_the_sum_of_multiples_of_3_and_5_under_ten_return_23() throws Exception {
        checkResult(10, 23);
    }

    @Test
    public void test_that_the_sum_of_multiples_of_3_and_5_under_one_thousand_return_23() throws Exception {
        checkResult(1000, 233168);
    }

    private void checkResult(final int max, final int expected) {
        Problem1 problem1 = new Problem1();
        int result = problem1.computeSum(max);
        assertThat(
                String.format("Sum of multiples of 3 and 5 below %d should be %d, but was %d",
                        max, expected, result),
                result,
                is(equalTo(expected)));
    }
}
