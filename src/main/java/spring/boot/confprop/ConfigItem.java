package spring.boot.confprop;

// We can also use @ConfigurationProperties annotation on @Bean-annotated methods (ConfpropApplication).
// https://www.baeldung.com/configuration-properties-in-spring-boot
public class ConfigItem
{
    private String name;
    private int size;

    // standard getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
      return "ConfigItem{ name=" + name + " size=" + size + "}";
    }
}
