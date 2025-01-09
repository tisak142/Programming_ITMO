package Fruits;

import java.util.Objects;

public class MoonApple extends Fruit {
    private String color;


    public MoonApple(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String getVariety() {
        return "яблоки";
    }

    @Override
    public String getSize() {
        return "крошечные, величиной с горошину";
    }

    @Override
    public String getTaste() {
        return "кислые";
    }

    @Override
    public String toString() {
        return "MoonApple{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoonApple apple = (MoonApple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }
}
