package com.schoolofnet.java8.dateTimeApi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeAPI {
	public static void main(String[] args) {
		//Busca data e hora do momento de execução
		Instant now = Instant.now();
		System.out.println(now);
		
		Instant now2 = Instant.now();
		
		//Dá a diferença entre os dois horários
		Duration dir = Duration.between(now, now2);
		
		//Diferença de horario em segundos
		System.out.println(dir.getSeconds());
		
		//Data do momento de execução
		LocalDate local = LocalDate.now();
		System.out.println(local);
		
		LocalDate birthday1 = LocalDate.of(1990, 2, 10);
		LocalDate birthday2 = LocalDate.of(2016, 9, 8);
		
		//Diferença entre as datas acima
		Period period = Period.between(birthday1, birthday2);
		
		System.out.printf("%s %s %s", period.getYears(), period.getMonths(), period.getDays());
	}
}
