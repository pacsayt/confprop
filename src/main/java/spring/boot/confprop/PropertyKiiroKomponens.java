package spring.boot.confprop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// csak azert hoztam letre, hogy ki tudjam irni a konfiguraciot
@Component
public class PropertyKiiroKomponens
{
  private static final Logger LOG = LoggerFactory.getLogger( PropertyKiiroKomponens.class);

  public PropertyKiiroKomponens( ConfigProperties iniConfigProperties, ConfigItem configItem, Employee employee, ProjectInfoConfigItem projectInfoConfigItem)
  {
    LOG.info( "PropertyKiiroKomponens() : iniConfigProperties=" + iniConfigProperties +
                                                 " ConfigItem=" + configItem +
                                                   " Employee=" + employee +
                                      " ProjectInfoConfigItem=" + projectInfoConfigItem);
  }
}