package com.schoolofnet.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClassOptional {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();

		Person person1 = new Person("Cascão");
		Person person2 = new Person("Cebolinha");
		Person person3 = new Person("Magali");
		Person person4 = new Person(null);
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		
		Optional<Person> op = Optional.of(person1);
		
		//Optional Somente funciona com valores não nulos
		//Caso valor seja nulo, haverá um NullPointerException
		String name = person4.getName();
		//Optional<String> opError = Optional.of(name);
		
		//opError.ifPresent(System.out::println);
		
		//Para que não dê erro em valores nulos
		//Precisa ser trocado seu método
		Optional<String> opNoError = Optional.ofNullable(name);
		
		opNoError.ifPresent(System.out::println);
		
		people.forEach(p -> {
			System.out.println(p.getName());
		});
	}
}
