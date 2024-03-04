
public class HexToByte {
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
public static void main(String[]args)
{
	String hex = "4A";
	//Byte num = Byte.parseByte(hex, 16);

	//System.out.println(num);
	byte[]bytearray= HexToByte.hexStringToByteArray("01019400003D2000003D1F");
	for (int i=0; i<bytearray.length;i++)
	{
	System.out.print(i +" : "+bytearray[i]+", ");
	}
	//System.out.println(bytearray[8]);
	int number= bytearray[2];
	int number1= Byte.toUnsignedInt(bytearray[2]);
	int number3 = Byte.toUnsignedInt(bytearray[4]);
	int number4= number1<<8|number3;
		
	System.out.println(number+": "+number1);
	System.out.println("number4 is "+number4);
}
}
