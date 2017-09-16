/*
Factorial: 6! = 6x5x4x3x2x1
*/

import annotation.tailrec

class FactorialCalculator {

    def calculate(number: Int): Int = {

        @tailrec
        def loop(accumulator: Int, n: Int): Int = {
            if (n <= 0) accumulator
            else loop(accumulator * n, n - 1)
        }

        if (number == 0) 1
        else if (number < 0) throw new IllegalArgumentException("Number should be positive")
        else loop(1, number)
    }

}
