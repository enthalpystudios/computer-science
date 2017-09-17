import XCTest
@testable import Factorial

class FactorialTests: XCTestCase {
    func testFactorialOfZeroShouldReturnOne() {
        XCTAssertEqual(FactorialCalculator().factorial(number: 0), 1)
    }

    func testFactorialOfSixShouldReturn720() {
        XCTAssertEqual(FactorialCalculator().factorial(number: 6), 720)
    }

    static var allTests = [
        ("testFactorialOfZeroShouldReturnOne", testFactorialOfZeroShouldReturnOne),
    ]
}
