package com.schoolofnet.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 0, 9, 10, 0);
		List<String> texts = Arrays.asList("a","b","c","","","","e","f","g");
		
		// Seria como uma busca com filtro no banco de dados
		// Como "SELECT * FROM numbers WHERE numbers <> 0
		List<Integer> filteredNumbers = numbers.stream()
				.filter(number -> number != 0)
				.collect(Collectors.toList());
		List<String> filteredTexts = texts.stream()
				.filter(str -> !str.isEmpty())
				.collect(Collectors.toList());
		
		filteredNumbers.forEach(System.out::println);
		filteredTexts.forEach(System.out::println);
		
		Random hash = new Random();
		
		hash.doubles()
		.limit(3)//Dá limite atribuído ao objeto hash
		.forEach(System.out::println);
	}
}