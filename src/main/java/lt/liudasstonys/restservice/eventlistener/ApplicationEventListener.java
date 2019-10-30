package lt.liudasstonys.restservice.eventlistener;

import lt.liudasstonys.restservice.helper.Helper;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class ApplicationEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        Helper.logWarning(applicationEvent.getClass().toString());
    }
}
