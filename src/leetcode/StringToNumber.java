package leetcode;

import java.util.Date;
import java.util.HashMap;
import java.util.stream.Stream;

public class StringToNumber {
	public int myAtoi(String s) {

		s = s.trim();
		Integer beginingIndex = null;
		Integer limit = 1;
		Boolean isPositive = true;
		char[] charArrayOfString = s.toCharArray();

		for (int i = 0; i < charArrayOfString.length; i++) {
			if (charArrayOfString[i] == '+' || charArrayOfString[i] == '-') {
				if (beginingIndex != null)
					break;
				if (charArrayOfString.length - 1 == i)
					break;
				if (!((int) (s.charAt(i + 1)) >= 48 && (int) (s.charAt(i + 1)) <= 57))
					break;
				beginingIndex = i;
				isPositive = charArrayOfString[i] == '+' ? true : false;
			}

			else if (((int) (s.charAt(i)) >= 48 && (int) (s.charAt(i)) <= 57)) {
				if (beginingIndex == null) {
					beginingIndex = i;
					isPositive = true;

				} else {
					limit++;
				}

			} else if (!((int) (s.charAt(i)) >= 48 && (int) (s.charAt(i)) <= 57)) {
				if (beginingIndex != null)
					break;
			}

		}
		if (beginingIndex == null)
			return 0;
		s = String.valueOf(charArrayOfString).substring(beginingIndex, beginingIndex + limit);

		// checking if String is between -2^31 and 2^32
		Integer result = 0;
		if (isPositive && s.length() > 10) {
			result = 2147483647;
			return result;
		}

		else if (!isPositive && s.length() > 11) {
			result = -2147483648;
			return result;
		}

		else if (isPositive && s.length() == 10) {
			int diff = s.compareTo(String.valueOf(Integer.MAX_VALUE));
			result = diff >= 0 ? Integer.MAX_VALUE : Integer.valueOf(s);

			return result;

		}

		else if (!isPositive && s.length() == 11) {
			int diff = s.compareTo(String.valueOf(Integer.MIN_VALUE));
			result = diff >= 0 ? Integer.MIN_VALUE : Integer.valueOf(s);
			return result;
		} else {

			result = Integer.valueOf(s);

			return result;
		}

	};

	public static void main(String[] args) {

		StringToNumber stringToNumber = new StringToNumber();
		int result1 = stringToNumber.myAtoi("words and 987");
		System.out.println("result " + result1);
		int result2 = stringToNumber.myAtoi("42");
		System.out.println("result " + result2);
		int result3 = stringToNumber.myAtoi("4193 with words");
		System.out.println("result " + result3);
		int result4 = stringToNumber.myAtoi("+-12");
		System.out.println("result4 " + result4);
		// "-91283472332"
		int result5 = stringToNumber.myAtoi("2147483649");
		
		System.out.println("result5 " + result5);
		int result6=  stringToNumber.myAtoi("words and 987");
		System.out.println("result6 "+result6);
		int result7= stringToNumber.myAtoi("002047483649");
		System.out.println(result7);

	}
}
