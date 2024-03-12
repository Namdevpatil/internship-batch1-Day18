package com.javaMapCollections;

import java.util.Map;
import java.util.TreeMap;

public class Example4 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Write a java program to print student name and age using map collections.
		 * 
		 * for name - String
		 * for age - Integer
		 * 
		 */
		
		Map<String, Integer> students = new TreeMap<String, Integer>();
		
		students.put("Ajay Kumar", 23);
		students.put("Kiran Reddy", 44);
		students.put("Baby", 57);
		students.put("Sachin", 35);
		students.put("Harish Patil", 53);
		students.put("Raj", null);
		students.put("Sunith Reddy", 34);
		students.put("Sachin", 23);
		students.put("Himanshu", 41);
		students.put("Kiran Reddy", null);

		System.out.println(students);

	}

}
