package com.javaSetCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<Integer> setOfValues = new LinkedHashSet<Integer>();
		
		setOfValues.add(1123);
		setOfValues.add(2200);
		setOfValues.add(1123);//duplicate
		setOfValues.add(1239);
		setOfValues.add(9900);
		setOfValues.add(null);
		setOfValues.add(3388);
		
		System.out.println(setOfValues);
		
		
	}

}
