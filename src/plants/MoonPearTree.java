package plants;

import Fruits.MoonPear;

import java.util.Objects;

public class MoonPearTree extends Tree{

    private MoonPear pear;

    public MoonPearTree(boolean hasFruits, MoonPear pear) {
        super(hasFruits);
        this.pear = pear;
    }

    @Override
    public String toString() {
        return "MoonPearTree{" +
                "pear=" + pear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        MoonPearTree pearTree = (MoonPearTree) o;
        return Objects.equals(pear, pearTree.pear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pear);
    }
}
