import static java.lang.String.valueOf;

public class FizzBuzzGamer {
    public String speakCode(int rawNumber) {
        String result = "";
        if (isRelatedTo(rawNumber, 3)) {
            result += "Fizz";
        }
        if (isRelatedTo(rawNumber, 5)) {
            result += "Buzz";
        }
        if (!isRelatedTo(rawNumber, 3) && !isRelatedTo(rawNumber, 5)) {
            result += valueOf(rawNumber);
        }
        return result;
    }

    public boolean isRelatedTo(int rawNumber, int i) {
        return isDividedBy(rawNumber, i) || isContains(rawNumber, i);
    }

    public boolean isContains(int rawNumber, int i) {
        return valueOf(rawNumber).contains(valueOf(i));
    }

    public boolean isDividedBy(int rawNumber, int i) {
        return rawNumber % i == 0;
    }
}
