package org.test1;

import java.util.LinkedList;
import java.util.List;

public class ListPractice {
	
	public static void main(String[] args) {
		
		List li = new LinkedList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(30);
		li.add(20);
		li.add(10);
		
		System.out.println(li);
		
		Object index = li.get(3);
		System.out.println(index);
		
		int index1 = li.indexOf(30);
		System.out.println(index1);
		
		int index2 = li.lastIndexOf(30);
		System.out.println(index2);
		
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		li.add(5, 60);
		System.out.println(li);
		
		li.set(6, 70);
		System.out.println(li);
		
		li.remove(6);
		System.out.println(li);
		
		boolean contains = li.contains(20);
		System.out.println(contains);
		
		li.removeAll(li);
		System.out.println(li);
		
		
		
		
		
		
		
		
	}

}
