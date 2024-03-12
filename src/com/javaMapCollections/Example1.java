package com.javaMapCollections;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print Customer email and name.
		 */
		//key(email)-value(name)
		Map<String, String> customers = new HashMap<String, String>();
		
		customers.put("abc@gmail.com", "abc");
		customers.put("raj@gmail.com", "raj kumar");
		customers.put("kiran@gmail.com", "kiran reddy");
		customers.put("ashok@gmail.com", "ashok patil");
		customers.put(null, null);//1. null - null
		customers.put("xyz@gmail.com", "xyz");
		customers.put("xyz@gmail.com", "abc");//duplicate data
		customers.put(null, "xyz");//2. null - xyz
		customers.put(null, "ijk");//3. null - ijk
		customers.put("hello@gmail.com", null);
		customers.put(null, "abc");//4. null - abc
		customers.put("raj200@gmail.com", null);
		
		for(Map.Entry<String, String> customer: customers.entrySet())
		{
			System.out.println(customer.getKey()+" - "+customer.getValue());
		}		
		
	}

}
