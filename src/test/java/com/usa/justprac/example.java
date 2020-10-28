package com.usa.justprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class example {
	
	
	public static void SecondHighest() {
		int []obj = {12,24,45,56,76,87};
		int size= obj.length;
		Arrays.sort(obj);
		int res =obj[size-2];
		System.out.println(res);
		}
	
	public static void DuplicateValule() {
		String[] name = { "abdul", "samad", "rashed", "nayan", "nayan" };
		Set<String> set= new HashSet<>();
		for(String names:name) {
		if(set.add(names)==false) {
		System.out.println(names);
		
		}}}
	
	public static void secHighVal() {
		int [] obj= {2,5,9,78};
		int size =obj.length;
		Arrays.sort(obj);
		int res= obj[size-2];
		System.out.println(res);
	}
	
	public static void dulValu() {
		String []name= {"anna","nipa","taseen","nipa"};
		Set<String> set=new HashSet<>();
			for (String names:name) {
				if(set.add(names)==false) {
					System.out.println(names);
				}
			}
	}
	
	public static void maxAndminvalue(){
		List <Integer> nm= new ArrayList<>();
		nm.add(11);
		nm.add(22);
		nm.add(33);
		nm.add(44);
		nm.add(55);
		nm.add(66);
		int max =Collections.max(nm);
		int min =Collections.min(nm);
		System.out.println(max);
		System.out.println(min);
	}
	
public static void manMin() {
	List<Integer> nm = new ArrayList<>();
	nm.add(11);
	nm.add(20);
	nm.add(11);
	int max =Collections.max(nm);
	int min= Collections.min(nm);
	System.out.println(max);
	System.out.println(min);
	
}

public static void remDupVal() {
	List<String> abc= new ArrayList<>();
	abc.add("java");
	abc.add("ruby");
	abc.add("java");
	abc=abc.stream().distinct().collect(Collectors.toList());
	System.out.println(abc);
	
}

public static void RemoveDuplicateValule() {
List<String> abc= new ArrayList<>();
abc.add("Java");
abc.add("C++");
abc.add("C#");
abc.add("Python");
abc.add("Ruby");
abc.add("Ruby");
abc.add(null);
abc.add(null);
abc.add(null);
abc =abc.stream().distinct().collect(Collectors.toList());
System.out.println(abc);
}

public static void oddEven() {
	for (int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println("even number is" +i);}
			else {
				System.out.println("odd number is"+i);
			}
		}
	}

public static void prime() {
	int x=76;
	for (int i=2;i<x/2;i++) {
		if(x%i==0) {
			System.out.println("no prime"+x);break;
		}else {System.out.println("prime"+x);break;
		}
		}
	}


	
	public static void main(String[] args) {
		
	/*	System.out.println("dog");
		
		Scanner read = new Scanner(System.in);
		String str =read.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println("string to reverse");
		System.out.println(sb.reverse().toString());
	 
		
	}*/
		example.SecondHighest();
		example.DuplicateValule();
		example.secHighVal();
		example.dulValu();
		example.maxAndminvalue();
		example.manMin();
		example.remDupVal();
		example.RemoveDuplicateValule();
		example.oddEven();
		example.prime();
		
	}
	
	public static String reverse(String s) {
	return s;
	
	}

}
