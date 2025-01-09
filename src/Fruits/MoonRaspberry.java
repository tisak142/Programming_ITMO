package Fruits;

public class MoonRaspberry extends Fruit {
    public MoonRaspberry() {
    }
    @Override
    public String getVariety() {
        return "лунная малина";
    }

    @Override
    public String getSize() {
        return "очень мелкая";
    }

    @Override
    public String getTaste() {
        return "На вкус она ничем не отличается от нашей обычной земной малины";
    }

    @Override
    public String toString() {
        return "MoonRaspberry{}";
    }
}
