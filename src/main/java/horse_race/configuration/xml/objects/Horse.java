package horse_race.configuration.xml.objects;

import java.util.Objects;

public class Horse {
    private String name;
    private Breed breed;
    private Rider rider;

    public Horse() {
    }

    public Horse(String name, Breed breed, Rider rider) {
        this.name = name;
        this.breed = breed;
        this.rider = rider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) &&
                Objects.equals(breed, horse.breed) &&
                Objects.equals(rider, horse.rider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, rider);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", rider=" + rider +
                '}';
    }
}
