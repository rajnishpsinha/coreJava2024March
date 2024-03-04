package collection.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		Map teamIndia = new HashMap<Integer, Player>();
		teamIndia.put(1, new Player(25,"Ramesh","Wicket Keeper"));
		teamIndia.put(2, new Player(17,"Suresh","Pace baller"));
		teamIndia.put(3, new Player(19,"Kohli","Capton"));
		
		Map<Integer, Player> selectedTeam = new HashMapFilter().filterMethod(teamIndia);
		for ( Map.Entry<Integer, Player> mapEntry : selectedTeam.entrySet()){
			System.out.println(mapEntry.getKey() +" : "+ mapEntry.getValue().getName());
			
		}
		

		
	}

}
