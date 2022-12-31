package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Hashset {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("Archana Dande");
		hs.add(987654321);
		hs.add(90.52);
		hs.add('A');
		hs.add('A');
		hs.add(true);
		hs.add(1234567891.1235546671);
		hs.add(null);
		hs.add(null);
		hs.add("Archana Dande");
		System.out.println(hs);
		System.out.println(hs.contains('A'));
		System.out.println(hs.isEmpty());
		hs.remove(90.52);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println("******Hashset using for eacch loop*****");
		for(Object temp:hs)
		{
			System.out.print(temp+" | ");
		}
		System.out.println("\n************Hashset using Iterator********");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " | ");
		}
	}
}
