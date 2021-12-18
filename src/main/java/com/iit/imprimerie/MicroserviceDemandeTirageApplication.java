package com.iit.imprimerie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MicroserviceDemandeTirageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemandeTirageApplication.class, args);
	}

}
