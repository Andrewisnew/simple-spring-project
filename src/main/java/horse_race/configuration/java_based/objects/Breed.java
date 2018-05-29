package horse_race.configuration.java_based.objects;

import java.util.Objects;

public class Breed {

    private String breed;

    public Breed() {
    }

    public Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Breed breed1 = (Breed) o;
        return Objects.equals(breed, breed1.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Breed{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
