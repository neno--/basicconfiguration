package net.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "configPojo")
public class ConfigPojo {
	private int i;
	private String s;

	public void setI(int i) {
		this.i = i;
	}


	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "ConfigPojo{" +
				"i=" + i +
				", s='" + s + '\'' +
				'}';
	}
}
