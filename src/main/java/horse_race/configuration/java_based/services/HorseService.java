package horse_race.configuration.java_based.services;

import horse_race.configuration.java_based.objects.Horse;

import java.util.List;

public class HorseService {
    private List<Horse> horses;

    public HorseService() {
    }

    public HorseService(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }
}
