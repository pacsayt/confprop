package spring.boot.confprop;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class EmployeeConverter implements Converter<String, Employee>
{
  @Override
  public Employee convert(String from)
  {
    String[] data = from.split(",");
    Employee employee = new Employee();
    employee.setName( data[0]);
    employee.setSalary( Double.parseDouble( data[1]));
    return employee;
  }
}