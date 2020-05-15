package spring.boot.confprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * https://www.baeldung.com/configuration-properties-in-spring-boot
 *
 * Note:
 * If we don't use @Configuration in the POJO,
 * then we need to add @EnableConfigurationProperties(ConfigProperties.class)
 * in the main Spring application class to bind the properties into the POJO :
 */
@SpringBootApplication
@ConfigurationPropertiesScan("spring.boot.confprop")   // ide korlatozza a keresest
// @EnableConfigurationProperties(ConfigProperties.class) S.B. 2.2-tol nem kell. Eleg a @ConfigurationProperties
public class ConfpropApplication
{
	@Bean
	@ConfigurationProperties(prefix = "configitem")
	public ConfigItem configItem()
	{
		return new ConfigItem();
	}

	public static void main( String[] args)
	{
		SpringApplication.run(ConfpropApplication.class, args);
	}
}