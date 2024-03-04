package leetcode;

/*
 * Given an integer array data representing the data, return whether it is a valid UTF-8 encoding (i.e. it translates to a sequence of valid UTF-8 encoded characters).

A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules:

For a 1-byte character, the first bit is a 0, followed by its Unicode code.
For an n-bytes character, the first n bits are all one's, the n + 1 bit is 0, followed by n - 1 bytes with the most significant 2 bits being 10.
This is how the UTF-8 encoding would work:

     Number of Bytes   |        UTF-8 Octet Sequence
                       |              (binary)
   --------------------+-----------------------------------------
            1          |   0xxxxxxx
            2          |   110xxxxx 10xxxxxx
            3          |   1110xxxx 10xxxxxx 10xxxxxx
            4          |   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
x denotes a bit in the binary form of a byte that may be either 0 or 1.

Note: The input is an array of integers. Only the least significant 8 bits of each integer is used to store the data. This means each integer represents only 1 byte of data.

 

Example 1:

Input: data = [197,130,1]
Output: true
Explanation: data represents the octet sequence: 11000101 10000010 00000001.
It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.
Example 2:

Input: data = [235,140,4]
Output: false
Explanation: data represented the octet sequence: 11101011 10001100 00000100.
The first 3 bits are all one's and the 4th bit is 0 means it is a 3-bytes character.
The next byte is a continuation byte which starts with 10 and that's correct.
But the second continuation byte does not start with 10, so it is invalid.
 

Constraints:

1 <= data.length <= 2 * 104
0 <= data[i] <= 255
*/

public class UtfValidation {
	public static boolean validUtf8(int[] data) {
		String[] binaryData = new String[data.length];
		int count = 0;
		for (int i : data) {
			String binaryNumber = Integer.toBinaryString(i);
			if (binaryNumber.length() > 8)
				return false;
			binaryNumber = binaryNumber.format("%8s", binaryNumber).replaceAll(" ", "0");
			binaryData[count++] = binaryNumber;
		}

		Integer numberOfBytesNext = Integer.valueOf(0);
		for (int j = 0; j < binaryData.length; j++) {
			char[] charArray = binaryData[j].toCharArray();
			if (charArray.length > 8)
				return false;
			if (binaryData[j].substring(0, 1).equals("0")) {
				if (numberOfBytesNext.intValue() > 0) {
					return false;
				}
				numberOfBytesNext = 0;
			} else if (binaryData[j].substring(0, 2).equals("10")) {
				if (numberOfBytesNext.intValue() == 0) {
					return false;
				}
				numberOfBytesNext--;

			} else if (binaryData[j].substring(0, 3).equals("110")) {
				if (numberOfBytesNext.intValue() > 0) {
					return false;
				}
				numberOfBytesNext = 1;

			} else if (binaryData[j].substring(0, 4).equals("1110")) {
				if (numberOfBytesNext.intValue() > 0) {
					return false;
				}
				numberOfBytesNext = 2;

			} else if (binaryData[j].substring(0, 5).equals("11110")) {
				if (numberOfBytesNext.intValue() > 0) {
					return false;
				}
				numberOfBytesNext = 3;

			} else if (binaryData[j].substring(0, 5).equals("11111")) {
				if (numberOfBytesNext.intValue() > 0) {
					return false;
				}
				numberOfBytesNext = 4;
				return false;

			}
			System.out.println("numberOfBytesNext: " + numberOfBytesNext);
		}
		if (numberOfBytesNext == 0)

			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		int[] data1 = { 235, 140, 4 };
		int[] data2 = { 197, 130, 1 };
		int[] data3= {32,196,147,225,184,165,246,149,170,129,204,153,243,188,141,147,0,217,149,234,176,176,243,178,133,144,213,181,193,187,238,137,134,218,155,33,231,134,162,243,184,144,131,71,201,131,244,133,189,140,242,178,128,156,207,154,230,165,181,240,181,134,180,227,129,199,172,226,158,164,214,183,224,137,141,20,194,188,232,177,151,242,157,180,153,200,189,239,153,186,240,153,181,154};
//		System.out.println(validUtf8(data1));
//		System.out.println(validUtf8(data2));
		System.out.println(validUtf8(data3));

	}
}
