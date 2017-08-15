import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateSimpleRPNExpression() {

        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

        Double result = calculator.evaluate("5 5 +");

        assertThat(result, is(equalTo(10D)));

    }

}
