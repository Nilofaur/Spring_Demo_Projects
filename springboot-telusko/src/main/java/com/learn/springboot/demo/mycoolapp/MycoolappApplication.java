package com.learn.springboot.demo.mycoolapp;

import com.learn.springboot.demo.mycoolapp.Model.Alien;
import com.learn.springboot.demo.mycoolapp.Model.Laptop;
import com.learn.springboot.demo.mycoolapp.Service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MycoolappApplication.class, args);
		ApplicationContext context=SpringApplication.run(MycoolappApplication.class);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);
		service.add(laptop);

	}

}
