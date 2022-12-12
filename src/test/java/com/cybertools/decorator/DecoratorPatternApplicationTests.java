package com.cybertools.decorator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cybertools.decorator.watch.BasicWatch;
import com.cybertools.decorator.watch.IWatch;
import com.cybertools.decorator.watch.SportWatchDecorator;

@SpringBootTest
class DecoratorPatternApplicationTests {

	@Test
	void contextLoads() {
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
