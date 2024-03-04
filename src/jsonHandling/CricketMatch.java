package jsonHandling;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class CricketMatch {
	private List<String>team;
	private String format;	
	
	public CricketMatch(List<String> team, String format) {
		super();
		this.team = team;
		this.format = format;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();
		list.add("India"); list.add("England"); list.add("Pakistan");
		CricketMatch cricketMatch = new CricketMatch(list,"twenty-twenty");
		ObjectMapper objectMapper = new ObjectMapper();
		

	}



	

}
