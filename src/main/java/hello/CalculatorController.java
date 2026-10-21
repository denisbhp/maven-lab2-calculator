
package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService =
            new CalculatorService();

    @GetMapping("/calculate")
    public double calculate(
            @RequestParam String expression) {

        return calculatorService.calculate(expression);
    }
}
