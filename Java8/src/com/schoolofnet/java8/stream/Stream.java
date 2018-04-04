package com.schoolofnet.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 0, 9, 10, 0);
	
	//Seria como um 
	List<Integer> filteredNumbers = numbers.stream()
			.filter(number -> number != 0)
			.collect(Collectors.toList());
	
}
