package horse_race.configuration.annotation.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Race {
    @Value("The best race ever")
    private String name;

    @Value("#{new java.util.ArrayList}")
    private List<Horse> horses;

    public Race() {
    }

    public Race(String name, List<Horse> horses) {
        this.name = name;
        this.horses = horses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void addHorse(Horse horse){
        horses.add(horse);
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", horses=" + horses +
                '}';
    }
}
