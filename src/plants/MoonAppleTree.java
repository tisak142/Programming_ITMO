package plants;

import Fruits.MoonApple;

import java.util.Objects;

public class MoonAppleTree extends Tree{

    private MoonApple apple;

    public MoonAppleTree(boolean hasFruits, MoonApple apple) {
        super(hasFruits);
        this.apple = apple;
    }

    public String getBranchDescription() {
        return "На ветвях этих деревьев были " + this.apple.getSize() + " " + this.apple.getColor() + " " + this.apple.getVariety();
    }

    @Override
    public String toString() {
        return "MoonAppleTree{" +
                "apple=" + apple +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        MoonAppleTree appleTree = (MoonAppleTree) o;
        return Objects.equals(apple, appleTree.apple);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), apple);
    }
}
