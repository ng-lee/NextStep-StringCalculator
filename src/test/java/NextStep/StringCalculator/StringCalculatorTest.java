package NextStep.StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    @DisplayName("\"1,2,3\"을 전달하는 경우, \"1 2 3\"을 출력")
    void getNumbers() {
        StringCalculator calculator = new StringCalculator();
        int number = calculator.calcalate("1,2,3");

        Assertions.assertThat(number).isEqualTo(6);
    }
}
