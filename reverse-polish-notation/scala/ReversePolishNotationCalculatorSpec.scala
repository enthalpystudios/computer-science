import collection.mutable.Stack
import org.scalatest._

class ReversePolishNotationCalculatorSpec extends FlatSpec with Matchers {

    "An NPN calculator" should "return 10 for 5 5 +" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("5 5 +")

        result should be (10D)

    }

    "An NPN calculator" should "return 15 for 5 5 5 + +" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("5 5 5 + +")

        result should be (15D)

    }

    "An NPN calculator" should "return 5 for complex notation 15 7 1 1 + - ÷ 3 × 2 1 1 + + -" in {
        val calculator = new ReversePolishNotationCalculator()

        val result = calculator.evaluate("15 7 1 1 + - ÷ 3 × 2 1 1 + + -")

        result should be (5D)

    }

}
