package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.trainconfig.TrainConfiguration;

@SpringBootApplication
public class TrainBookingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(TrainBookingApplication.class, args);

		TrainConfiguration bean = (TrainConfiguration) run.getBean(TrainConfiguration.class);
		bean.createTrain();

	}

}
