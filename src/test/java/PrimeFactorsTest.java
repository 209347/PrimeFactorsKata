import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PrimeFactorsTest {

    @Test
    public void itCompiles() {
        assertThat(true, equalTo(true));
    }

    @Test
    public void factorizationOf_1_isEmpty() {
        assertThat(PrimeFactors.of(1), is(Matchers.<Integer>empty()));
    }
}