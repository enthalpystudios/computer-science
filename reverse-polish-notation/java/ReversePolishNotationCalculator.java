import java.util.Stack;

public class ReversePolishNotationCalculator {

    public Double evaluate(String expression) {
        Double result = Double.NaN;
        Stack<Double> operand = new Stack<>();

        for (String op : expression.split("\\s")) {
            char maybeOperator = op.charAt(0);
            switch (maybeOperator) {
                case '+':
                case '-':
                case '/':
                case '÷':
                case '*':
                case '×':
                    Double b = operand.pop();
                    Double a = operand.pop();
                    result = evaluateExp(a, b, maybeOperator);
                    operand.push(result);
                    break;
                default:
                    operand.push(Double.valueOf(op));
            }
        }

        return result;
    }

    private Double evaluateExp(Double a, Double b, char operator) {
        Double result = Double.NaN;
        switch(operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
            case '÷':
                result = a / b;
                break;
            case '*':
            case '×':
                result = a * b;
                break;
            default:
                result = Double.NaN;
        }
        return result;
    }

}
