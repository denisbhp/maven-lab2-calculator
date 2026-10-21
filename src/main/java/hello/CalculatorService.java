
package hello;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorService {

    public double calculate(String expression) {
        Expression parsedExpression =
                new ExpressionBuilder(expression).build();

        return parsedExpression.evaluate();
    }
}
