import annotation.tailrec
object Math {

    def fibonacci(nth: Int): Int = {
        @tailrec
        def loop(prev: Int, current: Int, n: Int): Int = {
            if (n >= nth) current
            else loop(current, prev + current, n + 1)
        }

        if (nth <= 0) 0
        else if (nth <= 2) nth - 1
        else loop(0, 1, 2)
    }

}
