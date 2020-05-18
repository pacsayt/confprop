package spring.boot.confprop;

/**
 * Ez a ConfigProperties resze.
 */

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

  public void setAuthMethod(String iniAuthMethod)
  {
    authMethod = iniAuthMethod;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String iniUsername)
  {
    username = iniUsername;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String iniPassword)
  {
    password = iniPassword;
  }

  @Override
  public String toString()
  {
    return "Credentials{ authMethod=" + authMethod + " username=" + username + " password=" + password + "}";
  }

  @Override
  public boolean equals(Object obj)
  {
    if ( obj == null )
    {
      return false;
    }

    if ( ! (obj instanceof Credentials) )
    {
      return false;
    }

    Credentials otherCredentials = (Credentials) obj;

    if ( !authMethod.equals( otherCredentials.getAuthMethod()) ||
         !username.equals( otherCredentials.getUsername()) ||
         !password.equals( otherCredentials.getPassword()) )
    {
      return false;
    }

    return true;
  }
}