object MyModule {

    def abs(num: Int): Int = {
        if (num < 0) -num
        else num
    }

    private def formatAbs(num: Int): String = {
        val message = "The absolute value of %d is %d"
        message.format(num, abs(num))
    }

    def main(args: Array[String]): Unit = {
        println(formatAbs(-42))
    }
}
