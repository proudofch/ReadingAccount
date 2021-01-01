package com.ra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadingAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingAccountApplication.class, args);
		
//		SpringApplication app = new SpringApplication(ReadingAccountApplication.class);
//		app.setWebApplicationType(WebApplicationType.NONE); // None 덕분에 내장 톰캣을 구동하지 않고 실행된다.
//		app.run(args);
		
	}

}
