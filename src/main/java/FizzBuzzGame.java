import static java.lang.String.valueOf;

public class FizzBuzzGame {
    public String speakCode(int i) {
        if (isRelated(i, 3) && isRelated(i, 5)) {
            return "FizzBuzz";
        }
        if (isRelated(i, 3)) {
            return "Fizz";
        }

        if (isRelated(i, 5)) {
            return "Buzz";
        }
        return valueOf(i);
    }

    private boolean isRelated(int rawNumber, int regularNumber) {
        return (rawNumber % regularNumber == 0) || valueOf(rawNumber).contains(valueOf(regularNumber));
    }
}
