package items;

import interfaces.Nameable;

public record Fence(String name) implements Nameable {


    @Override
    public String returnName() {
        return name;
    }
}
