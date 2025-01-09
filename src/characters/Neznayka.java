package characters;

import Exceptions.NothingToEatException;
import interfaces.Nameable;
import Fruits.Fruit;
import spaceSuit.SpaceSuit;
import plants.Plant;

import java.util.Objects;

public class Neznayka implements Nameable {
    private String name;
    private SpaceSuit suit;
    private boolean isHungry;
    private boolean isBreathingFreely;
    private boolean isWearingSuit;
    private int timeInSuit;
    private boolean isEnoughOxygen = false;
    private boolean isCalm = false;
    private boolean accuracy;


    public Neznayka(SpaceSuit suit, int timeInSuit, String name, double chance) {
        super();
        this.timeInSuit = timeInSuit;
        this.isHungry = false;
        this.suit = suit;
        this.isBreathingFreely = false;
        this.isWearingSuit = true;
        this.name = name;
        if (chance < 0.1) {
            this.accuracy = true;
        } else {
            this.accuracy = false;
        }
    }

     @Override
     public String returnName() {
        return this.name;
     }

     public String removeSpaceSuit(SpaceSuit suit) {
        isWearingSuit = false;
        isBreathingFreely = true;
        return suit.removeSpaceSuit();
    }

    public String checkBreathing() {
        if (isBreathingFreely) {
            return "не только не задыхается, но даже вполне свободно может дышать";
        } else {
            return "Всё ещё не может свободно дышать";
        }
    }

    public String breathe() {
        this.isEnoughOxygen = true;
        this.isCalm = true;
        return "Вздохнув полной грудью";
    }

    public String checkHeartBeat() {
        if (this.isEnoughOxygen) {
            return "сердце гораздо спокойнее стало биться у него в груди";
        } else {
            return "сердце в его груди билось очень сильно";
        }
    }

    public String checkTimeInSuit() {
        if (this.timeInSuit > 30) {
            return "долго пробыл в скафандре и немного отвык от свежего воздуха";
        } else {
            return "Чувствует себя достаточно свежо";
        }
    }

    public String checkStateOfMind() {
        if (this.isCalm) {
            return "На душе сделалось весело и легко";
        } else {
            return "На душе тревожно и грустно";
        }
    }

    public String want(String time) {
        if (time == "present") {
            return "хочет";
        } else {
            return "хотел";
        }
    }

    public String eat(Plant plant) {
        if (!plant.isHasFruits()) {
            throw new NothingToEatException("Незнайка не нашел ничего покушать и расстроился");
        } else {
            return "Незнайка попробовал";
        }
    }

    public boolean getAccuracy() {
        return this.accuracy;
    }

    public String isHungry() {
        return "аппетит разыгрался";
    }

    public String suspect() {
        return "подозревая";
    }

    public String disrupt() {
        return "Cорвав";
    }

    public String toContinue() {
        return "продолжал";
    }

    public String smile() {
        return "смеяться";
    }

    public String catchYourself() {
        return "спохватился";
    }

    public String eatFast(Fruit fruit) {
        return "уплетать " + fruit.getVariety();
    }

    public String shout() {
        return "вскрикнул от боли";
    }

    public String bendDown() {
        return "нагнувшись";
    }

    public String see() {
        return "увидел";
    }

    public String decide() {
        return "решил";
    }

    public String lookAround() {
        return "оглядеться";
    }

    public String feel() {
        return "почувствовал";
    }

    public String foundOut() {
        return "Пришёл к умозаключению";
    }

    public String toSeem() {
        return "показалось";
    }

    public String shrugWithShoulders() {
        return "пожал плечами";
    }

    public String figureOut() {
        return "выяснить";
    }

    public String getTo() {
        return "попал";
    }

    public String fold() {
        return "сложив";
    }

    public String stepAside() {
        return "Сделав несколько шагов в сторону";
    }

    public String spit() {
        return "выплюнул";
    }

    public String become() {
        return "очутился";
    }

    public String toNotice() {
        return "заметить";
    }

    public String throwAway() {
        return "Отшвырнув в сторону";
    }

    public String taste() {
        return "попробовал";
    }

    public String hide() {
        return "спрятал";
    }

    public String begin() {
        return "принялся";
    }

    public String meet() {
        return "знакомиться";
    }
    public String takeCloserLook() {
        return "Присмотревшись внимательнее";
    }

    public String makeSure() {
        return "убедился";
    }

    public String toFind() {
        return "искать";
    }

    public String eatRaspberry() {
        return "Незнайка принялся набивать рот лунной малиной, но сколько ее ни ел, никак не мог насытиться";
    }

    public String isStillHungry() {
        return "Впрочем, на этот раз ему так и не удалось утолить голод";
    }

    @Override
    public String toString() {
        return "Neznayka{" +
                "name='" + name + '\'' +
                ", suit=" + suit +
                ", isHungry=" + isHungry +
                ", isBreathingFreely=" + isBreathingFreely +
                ", isWearingSuit=" + isWearingSuit +
                ", timeInSuit=" + timeInSuit +
                ", isEnoughOxygen=" + isEnoughOxygen +
                ", isCalm=" + isCalm +
                ", accuracy=" + accuracy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neznayka neznayka = (Neznayka) o;
        return isHungry == neznayka.isHungry && isBreathingFreely == neznayka.isBreathingFreely && isWearingSuit == neznayka.isWearingSuit && timeInSuit == neznayka.timeInSuit && isEnoughOxygen == neznayka.isEnoughOxygen && isCalm == neznayka.isCalm && accuracy == neznayka.accuracy && Objects.equals(name, neznayka.name) && Objects.equals(suit, neznayka.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, suit, isHungry, isBreathingFreely, isWearingSuit, timeInSuit, isEnoughOxygen, isCalm, accuracy);
    }
}
