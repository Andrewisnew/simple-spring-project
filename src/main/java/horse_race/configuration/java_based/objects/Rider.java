package horse_race.configuration.java_based.objects;

import java.util.Objects;

public class Rider {
    private String name;
    private int age;

    public Rider() {
    }

    public Rider(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rider rider = (Rider) o;
        return age == rider.age &&
                Objects.equals(name, rider.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
