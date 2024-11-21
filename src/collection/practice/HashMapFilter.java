package collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapFilter {
	
	
	
	public Map<Integer, Player> filterMethod(Map<Integer, Player> hashMap){
		Map<Integer, Player> map = new HashMap<Integer, Player>();
		
		for(Map.Entry<Integer, Player> mapEntry : hashMap.entrySet())
		{
			if(mapEntry.getValue().getAge() >18) 
				map.put(mapEntry.getKey(), mapEntry.getValue());
			
		}
		
		//testing
		// Good to test
		
		return map;
	}
	public static void main (String[] args){
		Map<Integer, Player> teamIndia = new HashMap<Integer, Player>();
		teamIndia.put(1, new Player(25,"Ramesh","Wicket Keeper"));
		teamIndia.put(2, new Player(17,"Suresh","Pace baller"));
		teamIndia.put(3, new Player(19,"Kohli","Capton"));
		
//		Map<Integer, Player> selectedTeam = new HashMapFilter().filterMethod(teamIndia);
//		for ( Map.Entry<Integer, Player> mapEntry : selectedTeam.entrySet()){
//			System.out.println(mapEntry.getKey() +" : "+ mapEntry.getValue().getName());

		HashMap<Integer, Player>  outputMap=	
			(HashMap<Integer, Player>) teamIndia.entrySet().stream().filter(k-> k.getValue().getAge()>18)
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		for ( Map.Entry<Integer, Player> mapEntry : outputMap.entrySet()){
		System.out.println(mapEntry.getKey() +" : "+ mapEntry.getValue().getName());
		}
		
		Entry entry=teamIndia.entrySet().stream().filter(y->y.getValue().getName().equals("Suresh")).findFirst().get();
		System.out.println(entry.getKey());
		
	}
		

		
	}


