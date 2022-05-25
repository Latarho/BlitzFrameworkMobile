package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/emulator.properties"})
public interface MobileConfig extends Config {

    @Key("serverUrl")
    String serverUrl();

    @Key("appUrl")
    String appUrl();

    @Key("appPath")
    String appPath();

    @Key("deviceName")
    @DefaultValue("Pixel_4_API_30")
    String deviceName();

    @Key("platformVersion")
    @DefaultValue("11.0")
    String platformVersion();
}