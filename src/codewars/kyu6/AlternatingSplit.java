package codewars.kyu6;

import java.util.*;
import java.util.stream.*;

public class AlternatingSplit {

	public static String encrypt(final String text, final int n) {

		if (text == null) {
			return null;
		}

		int textLength = text.length();

		String inputText = text;

		for (int i = 0; i < n; i++) {

			String[] inputTextArray = inputText.split("");

			Map<Boolean, List<Integer>> twoIndexGrouped = IntStream.range(0, textLength).boxed()
					.collect(Collectors.groupingBy(j -> j % 2 == 0));

			String alOdd = twoIndexGrouped.get(false).stream().map(a -> inputTextArray[a])
					.collect(Collectors.joining());

			String alEven = twoIndexGrouped.get(true).stream().map(a -> inputTextArray[a])
					.collect(Collectors.joining());

			inputText = alOdd + alEven;

		}

		return inputText;
	}

	public static String decrypt(final String encryptedText, final int n) {

		if (encryptedText == null) {
			return null;
		}

		String inputText = encryptedText;

		int textLength = inputText.length();
		
		for (int i = 0; i < n; i++) {

			String leftHalf = inputText.substring(0, textLength / 2);
			String rightHalf = inputText.substring(textLength / 2, textLength);

			inputText = "";

			for (int j = 0; j < textLength/2; j++) {

				inputText += String.valueOf(rightHalf.charAt(j));
				inputText += String.valueOf(leftHalf.charAt(j));

			}
			
			if(textLength%2!=0) {
				inputText+=rightHalf.charAt(textLength/2);
			}

		}
		return inputText;
	}

	public static void main(String[] args) {

		System.out.println(decrypt(encrypt("012345", 1),1));

	}
}
