package net.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component("namedInAnnotation")
public class SimplePojo {
	@Value("${simplePojo.someNumberInInterval}")
	private int i = 34;

	@Value("${simplePojo.greeting}")
	private String s;

	@Value("${simplePojo.anotherGreeting}")
	private String anotherS;

	// this one is important for @Component bean creation
	public SimplePojo() {
		this.s = "created by default constructor";
		out.println("Creating bean: " + this.s);
	}

	public SimplePojo(String s) {
		this.s = s;
		out.println("Creating bean: " + this.s);
	}

	@Override
	public String toString() {
		return "SimplePojo{" +
				"i=" + i +
				", s='" + s + '\'' +
				", anotherS='" + anotherS + '\'' +
				'}';
	}
}
