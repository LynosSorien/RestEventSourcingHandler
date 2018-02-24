package org.djorquera.cloud.eventsourcinghandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EventsourcingHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsourcingHandlerApplication.class, args);
	}
}
