package utils;

import lombok.experimental.UtilityClass;

import java.util.Map;

@UtilityClass
public class TestEnvHelper {
    public final String TEST_ENV = System.getProperty("env");
    public final Map<String, String> envVars = System.getenv();
}
