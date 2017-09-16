import org.scalatest._

class FactorialCalculatorSpec extends FlatSpec with Matchers {

    "A factorial calculator" should "calculate the factorial of a number" in {

        val calculator = new FactorialCalculator()

        val result = calculator.calculate(6)

        result should be(720)

    }

    "A factorial calculator" should "correctly calculate 0!" in {

        val calculator = new FactorialCalculator()

        val result = calculator.calculate(0)

        result should be(1)

    }

    "A factorial calculator" should "throw an error for non positive numbers" in {

        val calculator = new FactorialCalculator()

        assertThrows[IllegalArgumentException] { // Result type: Assertion
            calculator.calculate(-1)
        }

    }

}
