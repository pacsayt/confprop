package spring.boot.confprop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//
// In JUnit 5, the @RunWith(JUnitPlatform.class pld. JU 4) annotation has been replaced by the more powerful @ExtendWith annotation.
@SpringBootTest // ezeket tartalmazza : -> @BootstrapWith(SpringBootTestContextBootstrapper.class)
                //                         @ExtendWith({SpringExtension.class}) van a JU5-ben a @RunWith helyett
// @TestPropertySource( locations = "classpath:application-integrationtest.properties")
class ConfpropApplicationTests
{
	@Autowired
  private ApplicationContext context;

	@Autowired
	private ConfigProperties configProperties;

	@Test
	public void contextLoads()
	{
		assertNotNull( context);
	}

	@Test
	public void propertiesLoaded()
	{
		Map<String,String> expectedAdditonalHeadersMap = Map.of( "redelivery", "true", "secure", "true");
		assertThat( configProperties.getAdditionalHeaders(), is( expectedAdditonalHeadersMap)) ;
		Credentials expectedCredentials = new Credentials();

		expectedCredentials.setAuthMethod( "SHA1");
		expectedCredentials.setPassword( "jelszo");
		expectedCredentials.setUsername( "john");

		assertThat( configProperties.getCredentials(), is( expectedCredentials)) ;

		assertThat( configProperties.getFrom(), is( "mailer@mail.com")) ;
		assertThat( configProperties.getHostName(), is( "mailer@mail.com")) ;
		assertThat( configProperties.getPort(), is( 9000)) ;

		List<String> expectedDefaultRecipients = List.of( "admin@mail.com", "owner@mail.com");
		assertThat( configProperties.getDefaultRecipients(), is( expectedDefaultRecipients)) ;
	}
}
