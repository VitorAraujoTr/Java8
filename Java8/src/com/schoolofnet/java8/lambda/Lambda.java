package com.schoolofnet.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		System.out.println("Convencional:");
		List<String> strs = Arrays.asList("Vitor", "SON", "Java 8");
		
		//Método convencional
		for(String str: strs) {
			System.out.println(str);
		}
		
		//Método utilizando Lambda
		System.out.println("\n"+"Lambdas:");
		strs.forEach(str -> System.out.println(str));
		
		List<String> result = strs.stream().filter(str -> str.startsWith("V")).collect(Collectors.toList());
		
		System.out.println("\n"+"Filtro:");
		result.forEach(str -> System.out.println(str));
	}
}
