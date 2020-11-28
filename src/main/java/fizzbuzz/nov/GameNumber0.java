package fizzbuzz.nov;

/**
 * @author pi
 * @date 2020/11/04 11:58 PM
 **/
public class GameNumber0 {

    private final int rawNumber;

    public GameNumber0(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelatedTo(int relatedNumber) {
        return rawNumber % relatedNumber == 0 || String.valueOf(rawNumber).contains(String.valueOf(relatedNumber));
    }
}
