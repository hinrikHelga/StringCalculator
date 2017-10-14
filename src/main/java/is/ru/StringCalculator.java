package is.ru.stringcalculator;

public class StringCalculator {

	public static int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}

		else if (numbers.startsWith("//")) {
			newDelimeter(numbers);
			String onlyCommas = makeCommas(numbers);
			String splitNumbers[] = onlyCommas.split(",");
			return sum(splitNumbers);
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

		// Store negative numbers in a string.
		String storage = "";
		for (int i = 0; i < splitNumbers.length; i++) {
			if (makeInt(splitNumbers[i]) < 0) {
				storage += splitNumbers[i];
			}
		}

		// Return sum of numbers.
		int sumOfNum = 0;
		for (int i = 0; i < splitNumbers.length; i++) {
			if (makeInt(splitNumbers[i]) < 0) {
				throw new IllegalArgumentException("Negatives not allowed " + storage);
			}

			if (makeInt(splitNumbers[i]) > 1000) {
				int sumOfSmallNum = 0;
				for (int j = 0; j < splitNumbers.length; j++) {
					if (makeInt(splitNumbers[j]) > 1000) {
						splitNumbers[j] = "0";
					}
					int parse = makeInt(splitNumbers[j]);
					sumOfSmallNum += parse;
				}

				return sumOfSmallNum;
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

	private static String newDelimeter(String numbers) {
		int stringIndex = 2;
		String delim = "";
		while (numbers.charAt(stringIndex) != '\n') {
			delim += numbers.charAt(stringIndex);
			stringIndex++;
		}

		numbers = numbers.replaceAll("delim", ",");
		return numbers;
	}
}