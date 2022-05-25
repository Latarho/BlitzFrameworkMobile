package config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig configBrowserstack = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
    public static MobileConfig configMobile = ConfigFactory.create(MobileConfig.class, System.getProperties());
}
