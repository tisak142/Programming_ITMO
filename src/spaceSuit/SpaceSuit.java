package spaceSuit;

import interfaces.Nameable;

import java.util.Objects;

public class SpaceSuit implements Nameable {
    private boolean isWorn;
    private final String name = "скафандр";

    public SpaceSuit() {
        this.isWorn = true;
    }

    public String returnName() {
        return this.name;
    }

    public String removeSpaceSuit() {
        if (isWorn) {
            this.isWorn = false;
            return "cнял c себя космический скафандр";
        } else {
            return "Не был в костюме";
        }
    }

    public boolean isWearingSpaceSuit() {
        return isWorn;
    }

    @Override
    public String toString() {
        return "SpaceSuit{" +
                "isWorn=" + isWorn +
                ", NAME='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceSuit spaceSuit = (SpaceSuit) o;
        return isWorn == spaceSuit.isWorn && Objects.equals(name, spaceSuit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWorn, name);
    }
}
