package io.nishant.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.AbstractEnvironment;

import io.nishant.api.config.SwaggerConfig;
import io.nishant.api.config.WebConfig;

@SpringBootApplication
@Profile(value="prod")
@Import({ WebConfig.class, SwaggerConfig.class })
public class Application {

	public static void main(String[] args) {
		//System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"prod");
		SpringApplication.run(Application.class, args);
	}
}