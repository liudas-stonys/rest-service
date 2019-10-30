package lt.liudasstonys.restservice.helper;

import lt.liudasstonys.restservice.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Helper {

    public static final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    private static final Logger LOGGER = Logger.getLogger("****************************************");

    public static void logBeans() {
        logInfo("Logging beans...");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(Helper::logInfo);
    }

    public static void logInfo(String msg) {
        LOGGER.log(Level.INFO, msg);
    }

    public static void logWarning(String msg) {
        LOGGER.log(Level.WARNING, msg);
    }
}
