package NextStep.StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    @DisplayName("\"1,2,3\"을 전달하는 경우, \"1 2 3\"을 출력")
    void getNumbers() {
        StringCalculator calculator = new StringCalculator();
        int number = calculator.calculate("1,2,3");

        Assertions.assertThat(number).isEqualTo(6);
    }

    @Test
    @DisplayName("\"1,2,3,4,5,6\"을 전달하는 경우, 21을 출력")
    void getNumbers2() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.calculate("1,2,3,4,5,6");

        Assertions.assertThat(result).isEqualTo(21);
    }
}
