import annotation.tailrec

object MyModule {

    def abs(num: Int): Int = {
        if (num < 0) -num
        else num
    }

    // 6! = 6 x 5 x 4 x 3 x 2 x 1
    def factorial(n: Int): Int = {
        @tailrec
        def loop(acc: Int, n: Int): Int = {
            if (n <= 0) acc
            else loop(acc * n, n - 1)
        }
        loop(1, n)
    }

    private def formatAbs(x: Int) = {
        val msg = "The absolute value of %d is %d."
        msg.format(x, abs(x))
    }

    private def formatFactorial(n: Int) = {
        val msg = "The factorial of %d is %d."
        msg.format(n, factorial(n))
    }

    private def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d."
        msg.format(name, n, f(n))
    }

    def main(args: Array[String]): Unit = {
        println(formatAbs(-42))
        println(formatFactorial(7))

        println("Printing the same using formatResult as an Higher Order Function")

        println(formatResult("absolute value", -42, abs))
        println(formatResult("factorial", 7, factorial))

    }

}
