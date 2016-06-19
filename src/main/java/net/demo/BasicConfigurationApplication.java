package net.demo;

import net.demo.pojo.SimplePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static java.lang.System.out;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BasicConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(BasicConfigurationApplication.class, args);

		for (String beanName : appCtx.getBeanDefinitionNames()) {
			out.println(beanName);
		}

		BasicConfigurationApplication app = (BasicConfigurationApplication) appCtx
				.getBean("basicConfigurationApplication");
		app.printFields();
	}

	@Bean
	public SimplePojo createdByPrototypeFactory() {
		return new SimplePojo("createdByPrototypeFactory");
	}

	@Bean
	public static SimplePojo createdByStaticFactory() {
		return new SimplePojo("createdByStaticFactory");
	}

	@Autowired
	private SimplePojo namedInAnnotation;

	private SimplePojo simplePojo = new SimplePojo("created by calling custom constructor");

	// @Autowired
	// private SimplePojo createdByPrototypeFactory;

	@Autowired
	private SimplePojo createdByStaticFactory;

	public void printFields() {
		out.println("--- autowired fields ---");
		out.println(namedInAnnotation);
		// out.println(createdByPrototypeFactory);
		out.println(createdByStaticFactory);
		out.println(simplePojo);
		out.println("------");
	}
}
