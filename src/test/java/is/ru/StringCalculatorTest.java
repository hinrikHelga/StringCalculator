package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	public void testTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
}