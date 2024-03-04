package stream_practice;
interface Calculate{
	public int calculate(int a, int b);
}
public class Colonoperator {
public int addNum(int a, int b){
	return a+b;
}
public static void main(String[]args)
{
	Calculate c=new Colonoperator()::addNum;
	System.out.print(c.calculate(7, 1));
}
}
