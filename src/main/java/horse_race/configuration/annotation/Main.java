package horse_race.configuration.annotation;

import horse_race.configuration.annotation.objects.Race;
import horse_race.configuration.annotation.objects.Rider;
import horse_race.configuration.annotation.services.EmulationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        System.out.println(context.getBean(Race.class).getHorses());
    }
}
