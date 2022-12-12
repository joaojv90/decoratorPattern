package com.cybertools.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cybertools.decorator.watch.BasicWatch;
import com.cybertools.decorator.watch.IWatch;
import com.cybertools.decorator.watch.SportWatchDecorator;

@SpringBootApplication
public class DecoratorPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternApplication.class, args);
		
		System.out.println("\n");
		System.out.println("Prueba de patrón decorador");
		IWatch watch = new SportWatchDecorator(new BasicWatch());
		watch.createFunctionality();
		System.out.println("\n");
		IWatch watch1 = new BasicWatch();
		watch1.createFunctionality();
		System.out.println("\n");
		//otra forma de implemetar!
		IWatch wdeco = new BasicWatch();
		wdeco = new SportWatchDecorator(wdeco);
		wdeco.createFunctionality();
		System.out.println();
		
	}

}
