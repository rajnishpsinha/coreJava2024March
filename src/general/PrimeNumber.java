package general;

import lombok.Data;

@Data
public class PrimeNumber {
	public static boolean isPrime(int number) {

		boolean result = true;
		if (number <= 0)
			return false;
		else if (number % 2 == 0)
			return false;
		else {
			int limit = (int) Math.sqrt(number + 1);
			int count = 3;
			while (count <= limit) {
				if (number % count == 0)
					return false;
				count = count + 2;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(isPrime(12));
	}

}
