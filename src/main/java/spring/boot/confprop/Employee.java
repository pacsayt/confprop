package spring.boot.confprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * As, of Spring Boot 2.2, Spring finds and registers @ConfigurationProperties classes via classpath scanning.
 * Therefore, there is no need to annotate such classes with @Component (and other meta-annotations like @Configuration)
 * or even use the @EnableConfigurationProperties
 * https://www.baeldung.com/configuration-properties-in-spring-boot
 */
// @Component S.B. 2.2-tol nem kell. Eleg a @ConfigurationProperties
@ConfigurationProperties(prefix = "employee") //
public class Employee
{
  private String name;
  private double salary;
/*
  public Employee( String iniName, double iniSalary) // Nem t'om, setter helyett jo-e a konstruktor ?
  {
    name = iniName;
    salary = iniSalary;
  }
*/
  public String getName()
  {
    return name;
  }

  public void setName(String iniName)
  {
    name = iniName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double iniSalary)
  {
    salary = iniSalary;
  }

  @Override
  public String toString()
  {
    return "Employee{ name=" + name + " salary=" + salary + "}";
  }
}
