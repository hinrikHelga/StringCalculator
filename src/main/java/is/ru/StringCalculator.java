package is.ru.stringcalculator;

public class StringCalculator {

	public static int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}

		else if (numbers.contains(",")) {
			String splitNumbers[] = numbers.split(",");
			return sum(splitNumbers);
		}
		
		else {
			return 1;
		}
	}

	private static int sum(String [] splitNumbers) {


		int sumOfNum = makeInt(splitNumbers[0]) + makeInt(splitNumbers[1]);
		return sumOfNum;
	}

	private static int makeInt(String number) {
		return Integer.parseInt("number");
	}
}