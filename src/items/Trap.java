package items;

import interfaces.Nameable;
import characters.Neznayka;
import symbols.Pronouns;
import symbols.PunctuationMarks;
import symbols.Words;

import java.util.Objects;

public class Trap implements Nameable {
    private final String name;
    private boolean isWorking;

    public Trap(String name, double chance) {
        this.name = name;
        if (chance < 0.1) {
            this.isWorking = false;
        } else {
            this.isWorking = true;
        }
    }

    public String catchNeznayka(Neznayka neznayka) {
        if (this.isWorking) {
            return "снизу раздался щелчок"  + PunctuationMarks.COMMA + Words.AND + " "+ neznayka.returnName() + " " + neznayka.feel() + PunctuationMarks.COMMA + Words.HOW + " " + Pronouns.HIS + " что-то крепко схватило за ногу";
        } else {
            return neznayka.returnName() + " увидел капкан, но к счастью он оказался нерабочий и незнайка убежал";
        }
    }

    public boolean isTrapWorking() {
        return this.isWorking;
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Trap{" +
                "NAME='" + name + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trap trap = (Trap) o;
        return isWorking == trap.isWorking && Objects.equals(name, trap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isWorking);
    }
}
