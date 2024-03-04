package arraypractice;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveList {
	public static void main(String[] args) {

		List numberList = new ArrayList<Integer>();
		int[] age = { 15, 45, 75, 8, 42, 25 };
		for (int i : age) {
			numberList.add(i);
		}
		numberList.add(10);
		numberList.forEach(p-> System.out.print(p+ " "));
	}

}
