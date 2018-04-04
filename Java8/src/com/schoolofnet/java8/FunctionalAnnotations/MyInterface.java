package com.schoolofnet.java8.FunctionalAnnotations;

//interfaces com mais de um método abstrato resultará em um erro

@FunctionalInterface
public interface MyInterface {
	void print(String s);
	
	//Também podemos criar um metodo com corpo, algo impossível em versões anteriores.
	default void body() {
		System.out.println("This is my interface function body!");
	}
}
