package leetcode;

import java.util.HashMap;
import java.util.stream.IntStream;

public class DistributeCandies {

	public int distributeCandies(int[] candyType) {

		int max = candyType.length / 2;
		HashMap<Integer, Integer> map = new HashMap<>();

		IntStream.of(candyType).forEach(p -> {
			if (map.containsKey(p))
				map.put(p, map.get(p) + 1);
			else
				map.put(p, 1);
		});
		int result = map.size() > max ? max : map.size();
		System.out.println(result);

		return result;
	}

	public static void main(String[] args) {
		DistributeCandies distributeCandies = new DistributeCandies();
		int[] input = new int[] { 6, 6, 6, 6 };
		distributeCandies.distributeCandies(input);
		/*int[] input2 = new int[] { 14, 75, 11, 45,0, 12};
		System.out.println(IntStream.of(input2).max().getAsInt());
*/
	}

}
