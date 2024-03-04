package collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SingltonListPractice {
	
	public static void main(String[]args){
		
		ArrayList<Apartment> apartmentList= new ArrayList<Apartment>();
		apartmentList.add(new Apartment(215,"Veloncia",7,25));
		apartmentList.add(new Apartment(870,"Georgia",15,87));
		apartmentList.add(new Apartment(1150,"Europa",18,128));
		
		apartmentList
		 .removeAll(Collections.singletonList(new Apartment(215,"Veloncia",7,25)));		
	
		
		for(Apartment a : apartmentList){
			System.out.println(a.toString());
		}
		
	}

}
