package horse_race.configuration.annotation.services;

import horse_race.configuration.annotation.objects.Horse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseService {

    @Value("#{T(java.util.Arrays).asList({})}")
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
