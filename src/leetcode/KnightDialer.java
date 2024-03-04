package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class KnightDialer {

	public int getPossibleNumbersCount(int num) {
		HashMap<Integer, int[]> dialerMap = new HashMap<Integer, int[]>();
		dialerMap.put(0, new int[] { 4, 6 });
		dialerMap.put(1, new int[] { 6, 8 });
		dialerMap.put(2, new int[] { 7, 9 });
		dialerMap.put(3, new int[] { 4, 8 });
		dialerMap.put(4, new int[] { 0, 3, 9 });
		dialerMap.put(6, new int[] { 0, 1, 7 });
		dialerMap.put(7, new int[] { 2, 6 });
		dialerMap.put(8, new int[] { 1, 3 });
		dialerMap.put(9, new int[] { 2, 4 });

		if (num == 1)
			return 10;
		int result = 0;

		HashMap<Integer, int[]> tempMap = new HashMap<Integer, int[]>();

		tempMap.put(0, new int[] { 4, 6 });
		tempMap.put(1, new int[] { 6, 8 });
		tempMap.put(2, new int[] { 7, 9 });
		tempMap.put(3, new int[] { 4, 8 });
		tempMap.put(4, new int[] { 0, 3, 9 });
		tempMap.put(6, new int[] { 0, 1, 7 });
		tempMap.put(7, new int[] { 2, 6 });
		tempMap.put(8, new int[] { 1, 3 });
		tempMap.put(9, new int[] { 2, 4 });

		// 0 3 9 0 1 7 0 1 7 1 3 2 6

		if (num == 2)
			return tempMap.entrySet().stream().mapToInt(q -> q.getValue().length).sum();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int z = 3; z <= num; z++) {

			for (int x = 0; x < 10; x++) {
				if (x == 5)
					continue;

				for (int y = 0; y < tempMap.get(x).length; y++) {
					for (int e : dialerMap.get(tempMap.get(x)[y])) {
						list.add(e);
					}

				}

				int[] arr = new int[list.size()];
				for (int k = 0; k < arr.length; k++) {
					arr[k] = list.get(k);
				}
				tempMap.put(x, arr);
				list.clear();

			}

		}

	/*	tempMap.entrySet().stream().forEach(l -> {
			System.out.print(l.getKey() + " : ");
			for (int c : l.getValue()) {
				System.out.print(c + " ");
			}
			;
			System.out.println();
		});*/

		result = tempMap.entrySet().stream().mapToInt(q -> q.getValue().length).sum();

		return result;

	}
	
	public int knightDialer(int N) {
        long[] ans = new long[10];
        long MOD = 1_000_000_007;
        for (int i = 0; i < 10; i++) { ans[i] = 1; }
        if (N == 1) { return 10; }
        for (int i = 2; i <= N; i++) {
            long[] temp = new long[10];
            temp[0] = (ans[4] + ans[6]) % MOD;
            temp[1] = (ans[6] + ans[8]) % MOD;
            temp[2] = (ans[7] + ans[9]) % MOD;
            temp[3] = (ans[4] + ans[8]) % MOD;
            temp[4] = (ans[0] + ans[3] + ans[9]) % MOD;
            temp[5] = 0;
            temp[6] = (ans[0] + ans[1] + ans[7]) % MOD;
            temp[7] = (ans[2] + ans[6]) % MOD;
            temp[8] = (ans[1] + ans[3]) % MOD;
            temp[9] = (ans[2] + ans[4]) % MOD;
            ans = temp;
        }
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + ans[i]) % MOD;
        }
        return (int)sum;
    }

	public static void main(String[] args) {

		KnightDialer knightDialer = new KnightDialer();
		int finalCount = knightDialer.knightDialer(5);
	//	int finalCount1 = knightDialer.getPossibleNumbersCount(5);
		System.out.println("count is: "+ finalCount);
	//	System.out.print("count is: "+ finalCount1);
	}
}
