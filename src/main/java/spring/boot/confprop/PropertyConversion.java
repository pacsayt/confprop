package spring.boot.confprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * The supported units are ns, us, ms, s, m, h and d for
 * nanoseconds, microseconds, milliseconds, seconds, minutes, hours, and days, respectively.
 *
 * The default unit is milliseconds, which means if we don't specify a unit next to the numeric value,
 * Spring will convert the value to milliseconds.
 *
 */

//@Component S.B. 2.2-tol nem kell. Eleg a @ConfigurationProperties
@ConfigurationProperties(prefix = "conversion")
public class PropertyConversion
{
  private Duration timeInDefaultUnit;
  private Duration timeInNano;

  @DurationUnit(ChronoUnit.DAYS)
  private Duration timeInDays;

  public Duration getTimeInDefaultUnit()
  {
    return timeInDefaultUnit;
  }

  public void setTimeInDefaultUnit(Duration iniTimeInDefaultUnit)
  {
    timeInDefaultUnit = iniTimeInDefaultUnit;
  }

  public Duration getTimeInNano()
  {
    return timeInNano;
  }

  public void setTimeInNano(Duration iniTimeInNano)
  {
    timeInNano = iniTimeInNano;
  }

  public Duration getTimeInDays()
  {
    return timeInDays;
  }

  public void setTimeInDays(Duration iniTimeInDays)
  {
    timeInDays = iniTimeInDays;
  }

  @Override
  public String toString()
  {
    return "PropertyConversion{ timeInDefaultUnit=" + timeInDefaultUnit + " timeInNano=" + timeInNano + " timeInDays=" + timeInDays + "}";
  }
}