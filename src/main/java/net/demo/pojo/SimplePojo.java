package net.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimplePojo {
	private int i = 34;

	@Value("${simplePojo.greeting}")
	private String s = "Hello";

	@Override
	public String toString() {
		return "SimplePojo{" +
				"i=" + i +
				", s='" + s + '\'' +
				'}';
	}
}
