package net.demo.profiles;

public class ConfigurableObject {
	private String somethingConfigurable;

	public ConfigurableObject(String somethingConfigurable) {
		this.somethingConfigurable = somethingConfigurable;
	}

	@Override
	public String toString() {
		return "ConfigurableObject{" +
				"somethingConfigurable='" + somethingConfigurable + '\'' +
				'}';
	}
}
