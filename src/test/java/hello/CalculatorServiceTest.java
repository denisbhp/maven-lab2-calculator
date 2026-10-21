
package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

	private final CalculatorService calculator =
			new CalculatorService();

	@Test
	void shouldCalculateCorrectly() {
		assertEquals(2.0, calculator.calculate("1+1"), 0.0001);
	}

	/*@Test
	 void shouldFailIntentionally() {
		assertEquals(2.0, calculator.calculate("5-1"), 0.0001);
	}

	 */
}
