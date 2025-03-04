package collection.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiler {
 protected List<ComputerSpecs> getComputerBelowCost(List<ComputerSpecs>compList,Integer cost){
	 List<ComputerSpecs> resultList =compList.stream().filter(p->p.getCost()<cost).collect(Collectors.toCollection(ArrayList::new));
			
		
		return resultList;
	}
 
 public static void main(String[] args){
	List< ComputerSpecs> compList= new ArrayList<ComputerSpecs>();
	compList.add(new ComputerSpecs(40,50000,"hp") );
	compList.add(new ComputerSpecs(45,60000,"dell") );
	compList.add(new ComputerSpecs(30,35000,"dell") );
	compList.add(new ComputerSpecs(70,70000,"hp") );
	 
	
	ListFiler listFilter = new ListFiler();
	List< ComputerSpecs> resultList=listFilter.getComputerBelowCost(compList, 52000);
	for(ComputerSpecs e: resultList){
		System.out.println(e.getCost()+" : "+e.getBrand()+" : "+e.getStorage());
	}
	 
 }
}
