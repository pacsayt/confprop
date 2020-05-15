package spring.boot.confprop;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  Informaciok a pom.xml-bol
 */

@ConfigurationProperties( prefix = "project")
public class ProjectInfoConfigItem
{
  private String version;
  private String property;

  public String getVersion()
  {
    return version;
  }

  public void setVersion(String iniVersion)
  {
    version = iniVersion;
  }

  public String getProperty()
  {
    return property;
  }

  public void setProperty(String iniProperty)
  {
    property = iniProperty;
  }

  @Override
  public String toString()
  {
    return "ProjectInfoConfigItem{ version=" + version + " property=" + property + "}";
  }
}