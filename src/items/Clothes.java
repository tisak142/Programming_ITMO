package items;

import interfaces.Nameable;

import java.util.Objects;

public class Clothes implements Nameable {

    private String name;

    public Clothes(String clothes) {
        this.name = clothes;
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(name, clothes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
