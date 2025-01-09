package symbols;

public enum PunctuationMarks {
    DOT(". "),
    COMMA(", "),
    COMMA_PERIOD("; ");


    private final String symbol;

    PunctuationMarks(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}