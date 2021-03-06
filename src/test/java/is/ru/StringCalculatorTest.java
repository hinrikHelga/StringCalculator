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

	public void testMultipleNumbers() {
		assertEquals(20, StringCalculator.add("1,2,3,4,10"));
	}

	public void testAllowNewLines() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumbers() {
		StringCalculator.add("1,2,-3,4,5");
	}

	public void testNumbersBigNumbers() {
		assertEquals(4, StringCalculator.add("1,1002,3"));
	}

	public void testDifferentDelimeter() {
		assertEquals(5, StringCalculator.add("//#\n3#2"));
	}
}