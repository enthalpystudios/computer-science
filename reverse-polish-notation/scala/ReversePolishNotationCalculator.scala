import scala.collection.immutable.List

class ReversePolishNotationCalculator {

    def evaluate(expression: String): Double = {

        def sum(a: Double, b: Double) = a + b
        def subtract(a: Double, b: Double) = a - b
        def divide(a: Double, b: Double) = a / b
        def multiply(a: Double, b: Double) = a * b

        def compute(f: (Double, Double) => Double, stack: List[Double]): List[Double] = {
            val b = stack.head;
            val a = stack.tail.head;
            val result = f(a, b)
            result :: stack.tail.tail
        }

        def evaluateExp(expr: String, stack: List[Double]): List[Double] = {
            expr match {
                case "+" => compute(sum, stack)
                case "-" => compute(subtract, stack)
                case "/" | "÷" => compute(divide, stack)
                case "*" | "×" => compute(multiply, stack)
                case _ => expr.toDouble :: stack
            }
        }

        expression
        .split(" ")
        .foldLeft(List[Double]())((stack, expr) => evaluateExp(expr, stack))
        .head

    }

}
