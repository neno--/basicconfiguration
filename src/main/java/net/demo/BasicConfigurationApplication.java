package net.demo;

import net.demo.pojo.SimplePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import static java.lang.System.out;

@SpringBootApplication
public class BasicConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(BasicConfigurationApplication.class, args);

		for (String beanName : appCtx.getBeanDefinitionNames()) {
			out.println(beanName);
		}

		BasicConfigurationApplication app = new BasicConfigurationApplication();
		out.println(app.simplePojo);
	}

	@Bean
	SimplePojo anotherPojo() {
		return new SimplePojo();
	}

	@Autowired
	private SimplePojo simplePojo;
}
