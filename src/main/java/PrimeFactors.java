import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> of(int value) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (value > 1) {
            while (value % divisor == 0) {
                factors.add(divisor);
                value /= divisor;
            }
            divisor++;
        }
        if(value > 1) {
            factors.add(value);
        }
        return factors;
    }
}
