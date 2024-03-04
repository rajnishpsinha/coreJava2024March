package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

import lombok.Data;

@Data
public class Stocks {

	public int maxProfit(int[] prices) {
		int profit = 0;
		int nextMin = -1;
		int nextMax = -1;

		int[] sortedPrices = Arrays.copyOf(prices, prices.length);
		Arrays.sort(sortedPrices);		

		int posOfMax = IntStream.range(0, prices.length).filter(i -> prices[i] == sortedPrices[sortedPrices.length - 1])
				.findFirst().orElse(-1);
		int posOfMin = IntStream.range(0, prices.length).filter(i -> prices[i] == sortedPrices[0]).findFirst()
				.orElse(-1);

		int posOfNextMin =-1;
		for (int i = 0; i < sortedPrices.length; i++) {

			nextMin = sortedPrices[i];
			int currentMin = sortedPrices[i];
			int[] posOfNextMinArray = IntStream.range(0, prices.length).filter(j -> prices[j] == currentMin).toArray();
			if (posOfNextMinArray.length==1)
			{ posOfNextMin=posOfNextMinArray[0];
			}
		else {
			for (int k=0; k<posOfNextMinArray.length; k++){
				if(posOfNextMinArray[k]< posOfMax)posOfNextMin=posOfNextMinArray[k];
			}
			
		}
			if (posOfNextMin==-1) nextMin = -1;
			if (posOfNextMin < posOfMax)
				break;
			else
				nextMin = -1;

		}
		int posOfNextMax=-1;
		for (int j = sortedPrices.length - 1; j >= 0; j--) {
			nextMax = sortedPrices[j];
			int currentMax = sortedPrices[j];
			int[] posOfNextMaxArray = IntStream.range(0, prices.length).filter(i -> prices[i] == currentMax).toArray();
			if (posOfNextMaxArray.length==1)
				{ posOfNextMax=posOfNextMaxArray[0];
				}
			else {
				for (int l=0; l<posOfNextMaxArray.length; l++){
					if(posOfNextMaxArray[l]> posOfMin)posOfNextMax=posOfNextMaxArray[l];
				}
				
			}
			
			if (posOfNextMax==-1) nextMax = -1;
			if (posOfNextMax > posOfMin)
				break;
			else
				nextMax = -1;
		}

		int profit1 = (nextMax == -1) ? -1 : nextMax - sortedPrices[0];
		int profit2 = (nextMin == -1) ? -1 : sortedPrices[sortedPrices.length - 1] - nextMin;

		int result= profit1 > profit2 ? profit1 : profit2;
		return result!=-1  ? result : 0;
   
	}

	public static void main(String[] args) {

	//	int[] prices1 = { 7, 1, 5, 3, 6, 4 };
	//	int[] prices2 = { 7, 6, 4, 3, 1 };
		int[] prices3 = { 2, 1, 2, 0, 1 };
		int[] prices4 ={2,1,2,1,0,1,2};
		int[]prices5= {2,1,2,1,0,0,1};

		Stocks stocks = new Stocks();
		// System.out.println(stocks.maxProfit(prices1));
		// System.out.println(stocks.maxProfit(prices2));
		 System.out.println(stocks.maxProfit(prices3));
		 System.out.println(stocks.maxProfit(prices4));
		System.out.println(stocks.maxProfit(prices5));

	}

}
