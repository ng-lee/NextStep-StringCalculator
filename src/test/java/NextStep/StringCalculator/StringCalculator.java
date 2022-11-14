package NextStep.StringCalculator;

import java.util.stream.Stream;

public class StringCalculator {

    public int[] insert(String input) {
        return Stream.of(input.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}
