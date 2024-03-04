package stackoverflow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/* finding max of 2D array where int elements 
 * are in String*/
public class MaxOf2DArray {
	
 public int findMax(List<List<String>> list){
	Comparator<Integer> cmp =( i1, i2)->{return i1.compareTo(i2);};	
	Optional<Integer> maxNumber= list.stream().flatMap(List::stream).map(k->Integer.valueOf(k)).max(cmp);
	
	return maxNumber.orElse(0);
	 
 }
 public static void main(String[]args){
	  List<List<String>> myList = Arrays.asList(
			    Arrays.asList("1", "3", "99", "2", "14", "2"),
			    Arrays.asList("111", "7", "199", "92", "14", "20"),
			    Arrays.asList("10", "31", "9", "21", "243", "432"),
			    Arrays.asList("31", "13", "999", "5", "41", "222"),
			    Arrays.asList("10", "31", "401", "42", "11", "77")
			);
	 MaxOf2DArray maxOf2DArray= new MaxOf2DArray();
	 
	 System.out.println(maxOf2DArray.findMax(myList));
	 
	 
 }
}
