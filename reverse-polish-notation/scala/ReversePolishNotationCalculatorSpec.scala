import collection.mutable.Stack
import org.scalatest._

class ReversePolishNotationCalculatorSpec extends FlatSpec with Matchers {

    "A reverse polish notation calculator" should "calculate a valid value in a simple scenario" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("5 5 +")

        result should be (10D)

    }

    "A Reverse polish notation calculator" should "calculate a valid value for a larger expression" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("5 5 5 + +")

        result should be (15D)

    }

    "A Reverse polish notation calculator" should "return 5 for complex notation 15 7 1 1 + - ÷ 3 × 2 1 1 + + -" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("15 7 1 1 + - ÷ 3 × 2 1 1 + + -")

        result should be (5D)

    }

}
