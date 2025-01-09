package com.example.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SpringLoggerApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringLoggerApplication.class);

	public static void main(String[] args) {
		log.info("Приложение запускается...");

		SpringApplication.run(SpringLoggerApplication.class, args);

		log.debug("Приложение запущено с {} аргументами", args.length);
		log.info("Приложение успешно запущено с {} аргументами.", args.length);
	}
}
