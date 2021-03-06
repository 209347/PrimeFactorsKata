import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {

    @Test
    public void itCompiles() {
        assertThat(true, equalTo(true));
    }

    @Test
    public void factorizationOf_1_isEmpty() {
        assertThat(PrimeFactors.of(1), is(empty()));
    }

    @Test
    public void factorizationOf_2_is_2() {
        assertThat(PrimeFactors.of(2), is(List.of(2)));
    }

    @Test
    public void factorizationOf_3_is_3() {
        assertThat(PrimeFactors.of(3), is(List.of(3)));
    }

    @Test
    public void factorizationOf_4_is_2_2() {
        assertThat(PrimeFactors.of(4), is(List.of(2, 2)));
    }

    @Test
    public void factorizationOf_8_is_2_2_2() {
        assertThat(PrimeFactors.of(8), is(List.of(2, 2, 2)));
    }

    @Test
    public void factorizationOf_9_is_3_3() {
        assertThat(PrimeFactors.of(9), is(List.of(3, 3)));
    }

    @Test
    public void factorizationOfAValueGivesAnExpectedResult() {
        assertThat(PrimeFactors.of(2*2*3*3*7*7*11*11), is(List.of(2, 2, 3, 3, 7, 7, 11, 11)));
    }
}