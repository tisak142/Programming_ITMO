package items;

import interfaces.Nameable;
import characters.Fix;

public record Eyes(String name) implements Nameable {

    public String follow() {
        return "следят";
    }

    public String belongTo(Fix fix) {
        return "принадлежали " + fix.getNickname();
    }

    @Override
    public String returnName() {
        return name;
    }
}
