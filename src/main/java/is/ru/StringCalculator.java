package is.ru.stringcalculator;

public class StringCalculator {

	public static int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}

		else if (numbers.contains(",") || numbers.contains("\n")) {
			String onlyCommas = makeCommas(numbers);
			String splitNumbers[] = onlyCommas.split(",");
			return sum(splitNumbers);
		}
		
		else {
			return 1;
		}
	}

	private static int sum(String [] splitNumbers) {

		String storage = "";
		for (int i = 0; i < splitNumbers.length; i++) {
			if (makeInt(splitNumbers[i]) < 0) {
				storage += splitNumbers[i];
			}
		}

		int sumOfNum = 0;
		for (int i = 0; i < splitNumbers.length; i++) {
			if (makeInt(splitNumbers[i]) < 0) {
				throw new IllegalArgumentException("Negatives not allowed " + storage);
			}
			sumOfNum += makeInt(splitNumbers[i]);
		}
		
		return sumOfNum;
	}

	private static int makeInt(String number) {
		return Integer.parseInt("number");
	}

	private static String makeCommas(String newLines) {
		newLines = newLines.replaceAll("\n", ",");
		return newLines;
	}
}