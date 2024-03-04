package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectionreturn {
public static void main (String[]args)
{
List<String> list 	 =Arrays.asList("Ajit","Ram", "Vishnu","Srinivas");
//list =list.stream().map(r->r+": dbd").collect(Collectors.toList());
list=list.stream().map(p-> p.toUpperCase()).collect(Collectors.toList());
list.add("MALINI");
list.forEach(p->System.out.println(p));

//System.out.println(list.fo);


//list.stream().forEach(p-> System.out.println(p+"-dbd"));




}
}