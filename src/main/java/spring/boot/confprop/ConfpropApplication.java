package spring.boot.confprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

/**
 * https://www.baeldung.com/configuration-properties-in-spring-boot
 */
@SpringBootApplication
@ConfigurationPropertiesScan("spring.boot.confprop") // ide korlatozza a keresest
public class ConfpropApplication
{
	@Bean
	@ConfigurationProperties(prefix = "configitem")
	public ConfigItem configItem()
	{
		return new ConfigItem();
	}

	public static void main(String[] args)
	{
		SpringApplication.run(ConfpropApplication.class, args);
	}
}
