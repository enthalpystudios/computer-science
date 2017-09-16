# Reverse Polish Notation

This implementation is done in Scala (2.12.x)

# Running

Compiling
`
scalac -cp ../../libraries/scalatest-app_2.12-3.0.1.jar ReversePolishNotationCalculator.scala ReversePolishNotationCalculatorSpec.scala -d target/
`

Running the tests
`
scala -cp target/:../../libraries/scalatest-app_2.12-3.0.1.jar org.scalatest.run ReversePolishNotationCalculatorSpec
`
