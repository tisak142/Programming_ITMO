package symbols;

public enum Pronouns {
    HIM("ему"), BIG_HIM("Ему"),
    HE("он"), BIG_HE("Он"),
    HIS("его"), BIG_HIS("Его"),
    SHE("она"), BIG_SHE("Она"),
    AT_HIM("него"), BIG_AT_HIM("Него"),
    HER("её"), BIG_HER("Её"),
    HIMSELF("себя"), BIG_HIMSELF("Себя");

    private final String pronoun;
    Pronouns(String pronoun) {
        this.pronoun = pronoun;
    }

    @Override
    public String toString() {
        return pronoun;
    }
}
