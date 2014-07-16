package ie.davidmoloney.euler;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class Problem3Test {
    private Problem3 problem3 = new Problem3();

    @Test
    public void test() throws Exception {
        assertThat(problem3.largestPrimeFactor(600_851_475_143L), is(equalTo(6857L)));
    }
}
