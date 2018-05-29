package horse_race.configuration.java_based;

import horse_race.configuration.java_based.objects.Breed;
import horse_race.configuration.java_based.objects.Horse;
import horse_race.configuration.java_based.objects.Race;
import horse_race.configuration.java_based.objects.Rider;
import horse_race.configuration.java_based.services.EmulationService;
import horse_race.configuration.java_based.services.HorseService;
import horse_race.configuration.java_based.services.RaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class AppConfig {
    @Bean
    public Race race(){
        return new Race("The best race ever", new ArrayList<>());
    }

    @Bean
    public HorseService horseService(){
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Lana", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Lan", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("La", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Lanj", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Lanajjj", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Lanagg", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Lanahj", new Breed("Arabian"), new Rider("John", 36)));
        horses.add(new Horse("Langjha", new Breed("Arabian"), new Rider("John", 36)));
        return new HorseService(horses);
    }

    @Bean
    public RaceService raceService(){
        return new RaceService(race(), horseService(), random());
    }

    @Bean
    public EmulationService emulationService(){
        return new EmulationService(raceService());
    }
    @Bean
    public Random random(){
        return new Random();
    }
}
