import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import org.junit.Ignore;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateSimpleRPNExpression() {

        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

        Double result = calculator.evaluate("5 5 +");

        assertThat(result, is(equalTo(10D)));

    }

    @Test
    public void shouldCalcExtraRPNExpression() {

        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

        Double result = calculator.evaluate("5 5 5 + +");

        assertThat(result, is(equalTo(15D)));

    }

    @Test
    public void shouldCalculateComplexRPNExpression() {

        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

        Double result = calculator.evaluate("15 7 1 1 + - ÷ 3 × 2 1 1 + + -");

        assertThat(result, is(equalTo(5D)));

    }

}
