package demo1;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	

	@Test
	void addTwoWithTwo() {
		var calculator = new SimpleCalculator();
		int executeResult = calculator.add(2, 2);
		final int expectedValue = 4;
		assertThat(null, null);
	}
}
