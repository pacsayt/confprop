package spring.boot.confprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

/**
 * In this case, the sizeInDefaultUnit value will be 300 bytes, as the default unit is bytes.
 * The supported units are B, KB, MB, GB, and TB. We can also override the default unit using @DataSizeUnit.
 */
@Component
@ConfigurationProperties(prefix = "datasize")
public class PropertyDataSize
{
  private DataSize sizeInDefaultUnit;

  private DataSize sizeInGB;

  @DataSizeUnit(DataUnit.TERABYTES)
  private DataSize sizeInTB;

  public DataSize getSizeInDefaultUnit()
  {
    return sizeInDefaultUnit;
  }

  public void setSizeInDefaultUnit(DataSize iniSizeInDefaultUnit)
  {
    sizeInDefaultUnit = iniSizeInDefaultUnit;
  }

  public DataSize getSizeInGB()
  {
    return sizeInGB;
  }

  public void setSizeInGB(DataSize iniSizeInGB)
  {
    sizeInGB = iniSizeInGB;
  }

  public DataSize getSizeInTB()
  {
    return sizeInTB;
  }

  public void setSizeInTB(DataSize iniSizeInTB)
  {
    sizeInTB = iniSizeInTB;
  }

  @Override
  public String toString()
  {
    return "PropertyDataSize{ sizeInDefaultUnit=" + sizeInDefaultUnit + " sizeInGB=" + sizeInGB + " sizeInTB=" + sizeInTB + "}";
  }
}
