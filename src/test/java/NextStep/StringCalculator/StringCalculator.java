package NextStep.StringCalculator;

import java.util.stream.Stream;

public class StringCalculator {

    public int calculate(String input) {
        Stream<String> stream;
        if (input.contains(";")) {
            stream = getSplit(input, ";");
        } else {
            stream = getSplit(input, ",");
        }
        return stream.mapToInt(Integer::parseInt).sum();
    }

    private Stream<String> getSplit(String input, String regex) {
        return Stream.of(input.split(regex));
    }
}
