package plants;

import java.util.Objects;

public class Tree extends Plant{

    private final String height = "лишь в полтора-два раза повыше Незнайкиного роста";

    public Tree(boolean hasFruits) {
        super(hasFruits, "дерево");
    }

    public String getHeight() {
        return this.height;
    }

    public String describe() {
        return "небольшие карликовые деревья";
    };

    @Override
    public String toString() {
        return "Tree{" +
                "height='" + height + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) {
            return false;
        }
        Tree tree = (Tree) o;
        return Objects.equals(height, tree.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}