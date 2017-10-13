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

		int sumOfNum = 0;
		for (int i = 0; i < splitNumbers.length; i++) {
			sumOfNum += makeInt(splitNumbers[i]);
		}
		
		return sumOfNum;
	}

	private static int makeInt(String number) {
		return Integer.parseInt("number");
	}
}