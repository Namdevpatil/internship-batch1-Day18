package com.javaSetCollections;

import java.util.Set;
import java.util.TreeSet;

public class Example3 
{

	public static void main(String[] args) 
	{
		
		Set<Integer> setOfValues = new TreeSet<Integer>();
		
		setOfValues.add(1123);
		setOfValues.add(2200);
		setOfValues.add(1123);//duplicate
		setOfValues.add(1239);
		setOfValues.add(9900);
		setOfValues.add(4455);
		setOfValues.add(3388);
		
		System.out.println(setOfValues);
		
		
	}

}
