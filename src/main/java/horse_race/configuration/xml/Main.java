package horse_race.configuration.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import horse_race.configuration.xml.services.EmulationService;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean("emulationService", EmulationService.class).start();
    }
}
