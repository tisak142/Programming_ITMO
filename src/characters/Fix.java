package characters;

import items.Clothes;
import interfaces.Nameable;
import items.Stick;
import java.util.ArrayList;
import java.util.Objects;

public class Fix implements Nameable {
    private String name;
    private String nickname;
    private ArrayList<Clothes> clothes;
    private Stick stick;

    public Fix(Stick stick, String nickname, String name) {
        this.clothes = new ArrayList<>();
        this.stick = stick;
        this.name = name;
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getStickDescription() {
        return "метла, которую он держал наперевес, как ружье, будто собирался идти с этим ружьем в атаку";
    }

    public String getStickName() {
        return this.stick.returnName();
    }

    public void addClothes(Clothes clothingItem) {
        clothes.add(clothingItem);
    }

    public String follow() {
        return "следивший за каждым его шагом " + this.name;
    }

    public String jumpFromTheAbmush() {
        return "выскочил из своей засады";
    }

    public String attacWithStick() {
        return "изо все сил ударил " + stick.returnName();
    }

    public String notToHear() {
        return "не слушал";
    }

    public String runTo(Neznayka neznayka) {
        return "подбежав к " + neznayka.returnName();
    }

    public void displayClothes() {
        System.out.print("одет в ");
        for (Clothes item : clothes) {
            System.out.print(item.returnName() + ", ");
        }
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Fix{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", clothes=" + clothes +
                ", stick=" + stick +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fix fix = (Fix) o;
        return Objects.equals(name, fix.name) && Objects.equals(nickname, fix.nickname) && Objects.equals(clothes, fix.clothes) && Objects.equals(stick, fix.stick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname, clothes, stick);
    }
}
