package com.schoolofnet.java8.FunctionalAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalAnnotations {
	public static void main(String[] args) {

		List<String> strs = Arrays.asList("Vitor", "SON", "Java 8");
		List<String> result = strs.stream()
				.filter(str -> str.startsWith("V"))
				.collect(Collectors.toList());
		//Java 7
//		MyInterface myInterface = new MyInterface() {
//			@Override
//			public void print() {
//				System.out.println("Java 7 implementation - Function interface");
//			}
//		};
//		myInterface.print();
		
		//Java 8
		MyInterface my1 = (String s) -> { 
			System.out.println("Java 8 Implementarion - Function interface \n" + s);
		};
//		my1.print();
		
		//Com method references
		result.forEach(my1::print);
		my1.body();
	}
}