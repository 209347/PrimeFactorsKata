import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> of(int value) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 2; value > 1; divisor++) {
            for (; value % divisor == 0; value /= divisor) {
                factors.add(divisor);
            }
        }
        return factors;
    }
}
