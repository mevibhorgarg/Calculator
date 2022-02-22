package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		Calculate calculate = new Calculate();
		Integer res = calculate.add(1, 3);
		System.out.println(res);
		res = calculate.sub(100, 30);
		System.out.println(res);
	}

}
