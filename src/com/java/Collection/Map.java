package com.java.Collection;

import java.util.HashMap;

public class Map 
{
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Aspire");
		hm.put(2, "Training");
		hm.put(3, "Institute");
		hm.put(4, "Aspire");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Aspire"));
		System.out.println("****Hashmap using for loop****");
		for(int i=1; i<=hm.size(); i++)
		{
			System.out.println(hm.get(i));
		}
	}
}
