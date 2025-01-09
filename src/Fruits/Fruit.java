package Fruits;

public abstract class Fruit {
    public Fruit() {
    }

    public abstract String getVariety();

    public abstract String getSize();

    public abstract String getTaste();

    @Override
    public String toString() {
        return "Fruit{}";
    }
}
