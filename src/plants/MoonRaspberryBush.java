package plants;

import Fruits.MoonRaspberry;

import java.util.Objects;

public class MoonRaspberryBush extends Bush{
    private MoonRaspberry raspberry;

    public MoonRaspberryBush(boolean hasFruits, MoonRaspberry raspberry) {
        super(hasFruits);
        this.raspberry = raspberry;
    }

    @Override
    public String toString() {
        return "MoonRaspberryBush{" +
                "raspberry=" + raspberry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        MoonRaspberryBush that = (MoonRaspberryBush) o;
        return Objects.equals(raspberry, that.raspberry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raspberry);
    }
}
