package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Order order = context.getBean("order", Order.class);
		order.confirmOrder();

		Customer customer = context.getBean("customer", Customer.class);
		customer.show();

		Delivery delivery = context.getBean("delivery", Delivery.class);
		delivery.show();

		context.close();
	}
}
