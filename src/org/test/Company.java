package org.test;

import java.util.*;

public class Company {
	
	public static void main(String[] args) {
		
		Set<Integer> si = new HashSet<Integer>();
		
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(10);
		si.add(20);
		
		//To find the size of the Set
		int siz = si.size();
		System.out.println(siz);
		
		//To Print the Set
		System.out.println(si);
		
		//Iterate the Set using Enhanced for loop
		
		for (Integer x : si) {
			
			System.out.println(x);
		}
		
		//To remove duplicates in the list
		List<Integer>li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		
		Set<Integer> si1 = new TreeSet<Integer>();
		
		si1.addAll(li);
		System.out.println(si1);
		
	  }
		
	}


