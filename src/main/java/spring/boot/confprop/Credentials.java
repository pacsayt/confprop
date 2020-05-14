package spring.boot.confprop;

public class Credentials
{
  private String authMethod;
  private String username;
  private String password;

  // standard getters and setters

  public String getAuthMethod()
  {
    return authMethod;
  }

  public void setAuthMethod(String authMethod)
  {
    this.authMethod = authMethod;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  @Override
  public String toString()
  {
    return "Credentials{ authMethod=" + authMethod + " username=" + username + " password=" + password + "}";
  }
}