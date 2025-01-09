package plants;

import java.util.Objects;

public abstract class Plant {
    private String type;
    private boolean hasFruits;

    public Plant(boolean hasFruits, String type) {
        this.hasFruits = hasFruits;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public boolean isHasFruits() {
        return this.hasFruits;
    }

    public abstract String describe();

    @Override
    public String toString() {
        return "Plant{" +
                "TYPE='" + type + '\'' +
                ", hasFruits=" + hasFruits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return hasFruits == plant.hasFruits && Objects.equals(type, plant.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, hasFruits);
    }
}
