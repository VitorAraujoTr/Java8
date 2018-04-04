package com.schoolofnet.java8.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	public static void say(String s) {
		System.out.println("A new person is saying something... " + s);
	}
}
public class MethodReferences {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Vitor", "SON", "Java 8");
		
		System.out.println("\n"+"Lambdas:");
		strs.forEach(str -> System.out.println(str));
		
		List<String> result = strs.stream()
				.filter(str -> str.startsWith("V"))
				.collect(Collectors.toList());
		
		//Método convencional
		result.forEach(str -> {
			Person.say(str);
		});
		
		//Novo método de referência
		//Só funciona se a referência estiver atribuido a receber o mesmo dado
		//Os "::" são chamados de Double Colon
		result.forEach(Person::say);
	}
}
