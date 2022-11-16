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
        int total = stream.mapToInt(Integer::parseInt).reduce((t, i) -> {
            if (i < 0) throw new RuntimeException();
            else return t + i;
        }).getAsInt();
        return total;
    }

    private Stream<String> getSplit(String input, String regex) {
        return Stream.of(input.split(regex));
    }
}
