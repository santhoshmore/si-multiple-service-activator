package com.si.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.config.EnableIntegration;
@ComponentScan(basePackages = "com.si.demo")
@EnableIntegration
@ImportResource("classpath*:/spring-multiple-sa-config.xml")
@SpringBootApplication
public class SiMultipleServiceActivatorApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SiMultipleServiceActivatorApplication.class, args);
	}
}
