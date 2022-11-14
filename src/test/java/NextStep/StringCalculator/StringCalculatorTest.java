package NextStep.StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StringCalculatorTest {

    @Test
    @DisplayName("\"1,2,3\"을 전달하는 경우, \"1 2 3\"을 출력")
    void getNumbers() {
        String input = "1,2,3";
        int[] numbers = Stream.of(input.split(",")).mapToInt(Integer::parseInt).toArray();

        Assertions.assertThat(numbers).isEqualTo(new int[]{1, 2, 3});
    }
}
