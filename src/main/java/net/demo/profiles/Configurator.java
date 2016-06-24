package net.demo.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Configurator {

	@Profile("development")
	@Bean(name = "configuration")
	public ConfigurableObject createDevelopment() {
		return new ConfigurableObject("development");
	}

	@Profile("production")
	@Bean(name = "configuration")
	public ConfigurableObject createProduction() {
		return new ConfigurableObject("production");
	}
}
