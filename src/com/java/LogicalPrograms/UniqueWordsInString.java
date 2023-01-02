package com.java.LogicalPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueWordsInString {
	public static void main(String[] args) {
		String s="Pune Aspire Training Aspire Institute Pune";
		String[] sarr = s.split(" ");
		HashSet hs= new HashSet();
		for(int i=0; i<sarr.length;i++) 
		{
		hs.add(sarr[i]);
		}
		System.out.println(hs);
		
		//*****Unique characters using linkedhashset
		LinkedHashSet lhs = new LinkedHashSet();
		
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
	}
}
