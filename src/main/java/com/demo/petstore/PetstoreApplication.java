package com.demo.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {

		Pet dog = new Pet();
		dog.appearance = 0;
		dog.energy = 0;
		dog.type = "Dog";

		System.out.println(dog.speak());

		System.out.println("pet is eating");
		dog.eat();

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		System.out.println("pet is sleeping");
		dog.sleep();

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		//SpringApplication.run(PetstoreApplication.class, args);
	}

}
