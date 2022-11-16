package NextStep.StringCalculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

    public int calcalate(String input) {
        int[] array = Stream.of(input.split(",")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(array).sum();
    }
}
