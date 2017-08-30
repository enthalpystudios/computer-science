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
        val msg = "The absolute number of %d is %d."
        msg.format(x, abs(x))
    }

    private def formatFactorial(n: Int) = {
        val msg = "The factorial of %d is %d."
        msg.format(n, factorial(n))
    }

    def main(args: Array[String]): Unit = {
        println(formatAbs(-42))
        println(formatFactorial(7))
    }

}
