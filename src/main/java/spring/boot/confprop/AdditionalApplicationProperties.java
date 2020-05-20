package spring.boot.confprop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Properties with Spring and Spring Boot
 * https://www.baeldung.com/properties-with-spring
 *
 * One other very useful way of registering a new properties file is using a placeholder to allow you to dynamically select the right file at runtime; for example:
 *
 * @PropertySource({ "classpath:persistence-${envTarget:mysql}.properties" })
 */

@Configuration // S.B. 2.2-tol nem kell (lof*t nem ...)
//@PropertySource( "classpath:secondapplication.properties") // in the event of a property name collision,
//@PropertySource( "classpath:thirdapplication.properties")  // the last source read takes precedence.
@PropertySources({ // nemcsak Java 8 utan
  @PropertySource( "classpath:secondapplication.properties"), // in the event of a property name collision,
  @PropertySource( "classpath:thirdapplication.properties")   // the last source read takes precedence.
})
public class AdditionalApplicationProperties
{
  private String second;
  private String third;

  public String getSecond()
  {
    return second;
  }

  public void setSecond(String iniSecond)
  {
    second = iniSecond;
  }

  public String getThird()
  {
    return third;
  }

  public void setThird(String iniThird)
  {
    this.third = iniThird;
  }

  @Override
  public String toString()
  {
    return "AdditionalApplicationProperties{ second=" + second + " third=" + third + "}";
  }
}
