package codewars.kyu5;

import java.math.BigInteger;

public class StringIncrementer {

	public static String incrementString(String str) {

		if (str.length() == 0 || str.replaceAll("[ ]+", "").length() == 0) {
			
			return str+"1";

		} else {

			if (!(String.valueOf(str.charAt(str.length() - 1)).matches("[0-9]"))) {
				str = str + "0";
			}

			String answer = str;

			str = str.replaceAll("[^0-9]+", " ");

			str = str.replaceAll("[ ]+", " ").trim();

			String[] numbers = str.split(" ");

			String number = numbers[numbers.length - 1];

			int lenOfNumbers = number.length();

			answer = answer.substring(0, answer.length() - lenOfNumbers);

			BigInteger numberInInt = new BigInteger(number).add(new BigInteger("1"));

			int lenOfNumbersInInt = String.valueOf(numberInInt).length();

			if (lenOfNumbersInInt >= lenOfNumbers) {
				return answer + String.valueOf(numberInInt);
			} else {
				return answer + "0".repeat(lenOfNumbers - lenOfNumbersInInt) + String.valueOf(numberInInt);
			}
		}
	}

	public static void main(String[] args) {

//		System.out.println(incrementString("dhraj100 11 2 1   1sadadsk21"));
//		System.out.println(incrementString("dhraj100"));
//		System.out.println(incrementString("dhraj010"));
//		System.out.println(incrementString("dhraj007"));
//		System.out.println(incrementString("dhiraj"));
//		System.out.println(incrementString(""));
//		System.out.println(incrementString("0000000000986677319101357"));
//		System.out.println(incrementString("soHD\"5)d*Gdd0x}K@G0b,RggQ\"/va?oc+WJW;2"));
		System.out.println(incrementString("=fLVY=mT9}esw8&%3HzM000000000000000004446387188046652802371"));

	}
}
