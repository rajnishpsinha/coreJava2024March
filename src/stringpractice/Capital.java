package stringpractice;
/*converting to capital*/
public class Capital {
public static void main(String[]args)
{
String name= "Rajnish Prasad Sinha";	
byte[]arr= name.getBytes();
for(int i=0; i<arr.length; i++)
{
	if((int)arr[i]>96 && (int)arr[i]<122)
		arr[i]=(byte) (arr[i]-32);
//System.out.println(arr[i]-32);
}
name= new String(arr);

System.out.println(name);

System.out.println(name.toUpperCase());
}
}
