import Exceptions.NothingToEatException;
import Fruits.MoonApple;
import Fruits.MoonPear;
import Fruits.MoonRaspberry;
import items.*;
import characters.Fix;
import characters.Neznayka;
import air.AirQuality;
import plants.*;
import spaceSuit.SpaceSuit;
import symbols.Pronouns;
import symbols.PunctuationMarks;
import symbols.Words;

public class Main {
    public static void main(String[] args) {
        double randomChanceAccuracy = Math.random();
        double randomChanceTrap = Math.random();
        SpaceSuit suit = new SpaceSuit();
        Neznayka neznayka = new Neznayka(suit, 40, "Незнайка", randomChanceAccuracy);
        Stick stick = new Stick("метла");
        Fix fix = new Fix(stick, "Фикс", "лунный коротышка");
        MoonApple apple = new MoonApple("зеленые");
        MoonPear pear = new MoonPear();
        MoonRaspberry raspberry = new MoonRaspberry();
        MoonAppleTree appleTree = new MoonAppleTree(false, apple);
        MoonPearTree pearTree = new MoonPearTree(true, pear);
        MoonRaspberryBush bush = new MoonRaspberryBush(true, raspberry);
        Clothes jacket = new Clothes("рыжий, протертый на локтях пиджак");
        Clothes cap = new Clothes("какая-то нелепая засаленная рыжая кепка");
        Clothes pants = new Clothes("штаны, какие обычно носят, заткнув в сапоги");
        Clothes boots = new Clothes("сандалии, которые он надел на босу ногу");
        Trap trap = new Trap("капкан", randomChanceTrap);
        Fence fence = new Fence("Высокий дощатый забор");
        Eyes eyes = new Eyes("внимательные глаза");
        AirQuality airQuality = new AirQuality("воздух вокруг гораздо лучше того, которым он дышал на Земле");
        fix.addClothes(jacket);
        fix.addClothes(cap);
        fix.addClothes(pants);
        fix.addClothes(boots);




        System.out.println(neznayka.returnName() + " " + neznayka.foundOut() + PunctuationMarks.COMMA + neznayka.returnName() + " " + neznayka.removeSpaceSuit(suit) + " " + Words.AND + " " + neznayka.feel() + PunctuationMarks.COMMA + Words.WHAT+" "+ neznayka.checkBreathing() + PunctuationMarks.DOT + Pronouns.BIG_HIM + " " + Words.EVEN + " " + neznayka.toSeem() + PunctuationMarks.COMMA + Words.WHAT);
        System.out.println(airQuality.description() + PunctuationMarks.DOT + Words.BIG_BUT +" " + Words.THIS+" " + Pronouns.HIM + PunctuationMarks.COMMA + Words.OF_COURSE + PunctuationMarks.COMMA + Words.ONLY+" " + Words.SO+" " + neznayka.toSeem()+PunctuationMarks.COMMA + Words.BECAUSE +" " + Pronouns.HE + " " + neznayka.checkTimeInSuit() + PunctuationMarks.DOT);
        System.out.println(neznayka.breathe() + PunctuationMarks.COMMA + neznayka.returnName() + " " + neznayka.feel() + PunctuationMarks.COMMA + Words.WHAT + " " + neznayka.checkHeartBeat() + PunctuationMarks.DOT + neznayka.checkStateOfMind() + PunctuationMarks.DOT + Pronouns.BIG_HE + " " + Words.EVEN + " " + neznayka.want("past") + " " + neznayka.smile() + PunctuationMarks.COMMA + Words.BUT +" "+ "вовремя");
        System.out.println(neznayka.catchYourself() + " " + Words.AND + " " + neznayka.decide() + " повременить с выражением радости" + PunctuationMarks.DOT + Words.BIG_FIRST_OF_ALL + " " + Pronouns.HIM + PunctuationMarks.COMMA + Words.OF_COURSE + PunctuationMarks.COMMA + "следовало " + neznayka.lookAround() + " " + Words.AND + " " + neznayka.figureOut() + PunctuationMarks.COMMA + Words.WHERE + " " + Pronouns.HE + " " + neznayka.getTo() + PunctuationMarks.DOT + "Аккуратно " + neznayka.fold() + " " + suit.returnName() + PunctuationMarks.COMMA + " " + neznayka.returnName() + " " + neznayka.hide() + " " + Pronouns.HIS + " под");
        System.out.println("одним из кустов " + Words.AND + " " + neznayka.begin() + " " + neznayka.meet() + " с местностью" + PunctuationMarks.DOT + neznayka.takeCloserLook() + " к окружавшим " + Pronouns.HIS + " кустам" + PunctuationMarks.COMMA + Pronouns.HE + " " + neznayka.makeSure() + PunctuationMarks.COMMA + Words.WHAT + " " + Words.IN + " действительности " + Words.THIS + " были не кусты" + PunctuationMarks.COMMA + Words.BUT_A + " " + appleTree.describe() + PunctuationMarks.DOT);
        System.out.println("Каждое " + appleTree.getType() + " " + appleTree.getHeight() + PunctuationMarks.DOT + appleTree.getBranchDescription() + PunctuationMarks.DOT);
        try {
            System.out.println(neznayka.disrupt() + " " + apple.getVariety() + PunctuationMarks.COMMA + neznayka.eat(appleTree) + " " + Pronouns.HIS + " " + Words.AND + " тут же " + neznayka.spit() + PunctuationMarks.COMMA + "до того они оказались " + apple.getTaste() + PunctuationMarks.DOT + "Неподалеку росли такие же " + pear.getSize() + " " + pear.getVariety() + PunctuationMarks.DOT + neznayka.eat(pearTree));
        } catch (NothingToEatException e) {
            System.out.println("Незнайка ничего не поел, но продолжил искать дальше");
        }
        System.out.println(pear.getVariety() + PunctuationMarks.COMMA + Words.BUT + " " + Pronouns.SHE + " была " + pear.getTaste() + PunctuationMarks.DOT + neznayka.throwAway() + " " + pear.getVariety() + PunctuationMarks.COMMA + neznayka.returnName() + " " + neznayka.begin() + " " + neznayka.toFind() + PunctuationMarks.COMMA + "чем бы еще поживиться" + PunctuationMarks.DOT + "От этих");
        System.out.println(pear.getVariety() + " " + Words.AND + " " + apple.getVariety() + " " + Words.AT + " " + Pronouns.AT_HIM + " " + Words.ONLY + " " + neznayka.isHungry() + PunctuationMarks.COMMA_PERIOD + "к тому же с тех пор" + PunctuationMarks.COMMA + Words.HOW + " " + Pronouns.HE + " ел " + Words.IN + " последний раз" + PunctuationMarks.COMMA + "прошло уже много времени" + PunctuationMarks.DOT + neznayka.stepAside() + PunctuationMarks.COMMA + Pronouns.HE + " " + neznayka.become() + " перед");
        System.out.println(fence.returnName() + PunctuationMarks.COMMA + "вдоль которого росли " + bush.describe() + PunctuationMarks.DOT + neznayka.eat(bush) + " одну ягодку" + PunctuationMarks.COMMA + neznayka.returnName() + " " + neznayka.makeSure() + PunctuationMarks.COMMA + Words.WHAT + " перед ним была");
        System.out.println(raspberry.getVariety() + PunctuationMarks.DOT + raspberry.getTaste() + PunctuationMarks.COMMA + Words.ONLY + " была" + " " + raspberry.getSize() + PunctuationMarks.DOT + neznayka.eatRaspberry() + PunctuationMarks.DOT);
        System.out.print(neznayka.isStillHungry() + PunctuationMarks.DOT);
        if (!neznayka.getAccuracy()) {
            System.out.println(Words.IF + " " + Pronouns.HE + " вёл " + Pronouns.HIMSELF + " осторожнее" + PunctuationMarks.COMMA + "то мог бы" + neznayka.toNotice() + PunctuationMarks.COMMA + Words.WHAT + " за ним уже давно " + eyes.follow() + " из-за кустов");
            System.out.print("чьи-то " + eyes.returnName() + PunctuationMarks.DOT + Words.THESE + " " + eyes.returnName() + " " + eyes.belongTo(fix) + " которого звали " + fix.returnName() + PunctuationMarks.DOT +  Pronouns.BIG_HE + " был ");
            fix.displayClothes();
            System.out.println("В руках у " + fix.returnName() + " была");
            System.out.println(fix.getStickDescription() + PunctuationMarks.DOT + "Ничего не" + neznayka.suspect() + PunctuationMarks.COMMA + neznayka.returnName() + " " + neznayka.toContinue() + " " + neznayka.eatFast(raspberry) + PunctuationMarks.COMMA + Words.HOW + " вдруг " + trap.catchNeznayka(neznayka));
            if (trap.isTrapWorking()) {
                System.out.println(neznayka.returnName() + " " + neznayka.shout() + " " + Words.AND + PunctuationMarks.COMMA + neznayka.bendDown() + PunctuationMarks.COMMA + neznayka.see() + PunctuationMarks.COMMA + Words.WHAT + " нога его попала в " + trap.returnName() + PunctuationMarks.DOT + Words.BIG_IN + " " + Words.THIS + " же момент " + fix.follow() + " " + fix.jumpFromTheAbmush() + " " + Words.AND + PunctuationMarks.COMMA + fix.runTo(neznayka) + PunctuationMarks.COMMA + fix.attacWithStick() + " по голове" + PunctuationMarks.DOT + Words.BIG_BUT + " " + fix.returnName() + " " + fix.notToHear() + " " + Pronouns.HIS + PunctuationMarks.DOT + neznayka.returnName() + " " + Words.ONLY + " " + neznayka.shrugWithShoulders() + PunctuationMarks.DOT);
            } else {
                System.out.println("Незнайка захватил как можно больше ягод и побежал в ракету.");
            }
        } else {
            System.out.println("Внезапно Незнайка заметил, что за ним кто-то наблюдает из кустов и убежал в ракету.");
        }
    }
}