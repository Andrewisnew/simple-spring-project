package horse_race.configuration.java_based.services;

import horse_race.configuration.java_based.objects.Horse;
import horse_race.configuration.java_based.objects.Race;

import java.util.Random;

public class RaceService {
    private Race race;
    private HorseService horseService;
    private Random random;

    public RaceService(Race race, HorseService horseService, Random random) {
        this.race = race;
        this.horseService = horseService;
        this.random = random;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Race getRace(){
        for (Horse horse: horseService.getHorses()) {
            if(random.nextBoolean()) {
                race.addHorse(horse);
            }
        }
        return race;
    }

    public Horse findByName(String horsesName) {
        for (Horse horse: race.getHorses()) {
            if(horsesName.equals(horse.getName())){
                return horse;
            }
        }
        return null;
    }

    public Horse findByBreed(String horsesBread) {
        for (Horse horse: race.getHorses()) {
            if(horsesBread.equals(horse.getBreed().getBreed())){
                return horse;
            }
        }
        return null;
    }

    public Horse findByRidersName(String horsesRiderName) {
        for (Horse horse: race.getHorses()) {
            if(horsesRiderName.equals(horse.getRider().getName())){
                return horse;
            }
        }
        return null;
    }
}
