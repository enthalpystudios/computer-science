class FactorialCalculator {

    func factorial(number: Int) -> Int {
        if (number == 0) {
            return 1
        } else {
            return number * factorial(number: number - 1)
        }
    }

}
