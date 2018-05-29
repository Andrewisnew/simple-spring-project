package horse_race.configuration.java_based.objects;

import java.util.List;

public class Race {
    private String name;
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
