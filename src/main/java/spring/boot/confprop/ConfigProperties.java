package spring.boot.confprop;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Map;

@Configuration // S.B. 2.2-tol nem kell
@ConfigurationProperties( prefix = "mail")
public class ConfigProperties
{
  // If any of these validations fail, then the main application would fail to start with an IllegalStateException.
  @NotBlank
  private String hostName;
  @Min(1025)
  @Max(65536)
  private int port;
//  @Length(max = 4, min = 1)
  @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
  private String from;
  private List<String> defaultRecipients;
  private Map<String, String> additionalHeaders;
  private Credentials credentials;

  // standard getters and setters

  public String getHostName()
  {
    return hostName;
  }

  public void setHostName(String hostName)
  {
    this.hostName = hostName;
  }

  public int getPort()
  {
    return port;
  }

  public void setPort(int port)
  {
    this.port = port;
  }

  public String getFrom()
  {
    return from;
  }

  public void setFrom(String from)
  {
    this.from = from;
  }

  public List<String> getDefaultRecipients()
  {
    return defaultRecipients;
  }

  public void setDefaultRecipients(List<String> defaultRecipients)
  {
    this.defaultRecipients = defaultRecipients;
  }

  public Map<String, String> getAdditionalHeaders()
  {
    return additionalHeaders;
  }

  public void setAdditionalHeaders(Map<String, String> additionalHeaders)
  {
    this.additionalHeaders = additionalHeaders;
  }

  public Credentials getCredentials()
  {
    return credentials;
  }

  public void setCredentials(Credentials credentials)
  {
    this.credentials = credentials;
  }

  @Override
  public String toString()
  {
    return "ConfigProperties{ hostName='" + hostName + " port=" + port + " from=" + from + " defaultRecipients=" + defaultRecipients + " additionalHeaders=" + additionalHeaders + " credentials=" + credentials + "}";
  }
}