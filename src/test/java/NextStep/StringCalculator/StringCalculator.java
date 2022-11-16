package NextStep.StringCalculator;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCalculator {

    public int calculate(String input) {
        Stream<String> stream;
        if (input.contains(";")) {
            stream = getSplit(input, ";");
        } else {
            stream = getSplit(input, ",");
        }
        IntStream intStream = getIntStream(stream);
        intStream.forEach(n -> {
            if (n < 0) throw new RuntimeException();
        });
        return intStream.sum();
    }

    private IntStream getIntStream(Stream<String> stream) {
        return stream.mapToInt(Integer::parseInt);
    }

    private Stream<String> getSplit(String input, String regex) {
        return Stream.of(input.split(regex));
    }
}
