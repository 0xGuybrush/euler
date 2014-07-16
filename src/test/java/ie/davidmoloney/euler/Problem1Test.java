package ie.davidmoloney.euler;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem1Test {
    private Problem1 problem1 = new Problem1();
    public static final int MAX = 1_000;
    public static final int EXPECTED = 233_168;

    @Test
    public void test_that_a_is_correct() throws Exception {
        checkResult(problem1.implA(MAX));
    }

    @Test
    public void test_that_b_is_correct() throws Exception {
        checkResult(problem1.implB(MAX));
    }

    private void checkResult(final int result) {
        assertThat(
                String.format("Sum of multiples of 3 and 5 below %d should be %d, but was %d",
                        MAX, EXPECTED, result),
                result,
                is(equalTo(EXPECTED)));
    }

}
