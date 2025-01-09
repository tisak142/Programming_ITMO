package symbols;

public enum Words {
    WHAT("что"), BIG_WHAT("Что"),
    AND("и"), DIG_AND("И"),
    EVEN("даже"), BIG_EVEN("Даже"),
    BUT("но"), BIG_BUT("Но"),
    THIS("это"), BIG_THIS("Это"),
    OF_COURSE("конечно"), BIG_OF_COURSE("Конечно"),
    ONLY("только"), BIG_ONLY("Только"),
    SO("так"), BIG_SO("Так"),
    BECAUSE("потому что"), BIG_BECAUSE("Потому что"),
    FIRST_OF_ALL("прежде всего"), BIG_FIRST_OF_ALL("Прежде всего"),
    WHERE("куда"), BIG_WHERE("Куда"),
    IN("в"), BIG_IN("В"),
    BUT_A("а"), BIG_BUT_A("А"),
    AT("у"), BIG_AT("У"),
    HOW("как"), BIG_HOW("Как"),
    IF("если бы"), BIG_IF("Если бы"),
    THESE("эти"), BIG_THESE("Эт");


    private final String word;

    Words(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
