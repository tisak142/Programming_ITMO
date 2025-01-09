package Fruits;

public class MoonPear extends Fruit {
    public MoonPear() {
    }
    @Override
    public String getVariety() {
        return "лунные груши";
    }

    @Override
    public String getSize() {
        return "карликовые";
    }

    @Override
    public String getTaste() {
        return "безвкусная, к тому же очень терпкая должно быть еще незрелая";
    }

    @Override
    public String toString() {
        return "MoonPear{}";
    }
}

