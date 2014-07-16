package ie.davidmoloney.euler;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem2Test {
    private Problem2 problem2 = new Problem2();

    @Test
    public void test() throws Exception {
        assertThat(problem2.fibonacciSum(4_000_000), is(equalTo(4_613_732)));
    }
}
