package items;

import interfaces.Nameable;

public record Stick(String name) implements Nameable {

    @Override
    public String returnName() {
        return name;
    }
}
