package hexBytesUtility;

public class BytesHexConversion {
	public static String convertBytesToHex(byte[] byteArray) {

		StringBuilder sb = new StringBuilder();
		for (byte b : byteArray) {
			sb.append(String.format("%02X", b));
		}
		return sb.toString();
	}

	public static String getHexFromBytes(byte[] byteArray) {

		StringBuilder sb = new StringBuilder();
		for (byte b : byteArray) {
			String hexString = Integer.toHexString(0XFF & b);
			if (hexString.length() == 1)
				sb.append('0');
			sb.append(hexString);

		}

		return sb.toString();
	}

}
