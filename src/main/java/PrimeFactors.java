import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> of(int value) {
        List<Integer> factors = new ArrayList<>();
        if(value > 1) {
            factors.add(value);
        }
        return factors;
    }
}
