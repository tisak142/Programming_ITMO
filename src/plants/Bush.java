package plants;

public class Bush extends Plant{


    public Bush(boolean hasFruits) {
        super(hasFruits, "куст");
    }

    public String describe() {
        return "колючие кустики, усеянные уже совсем крошечными красными ягодками";
    };

    @Override
    public String toString() {
        return "Bush{}";
    }
}