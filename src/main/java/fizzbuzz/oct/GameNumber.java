package fizzbuzz.oct;

/**
 * @author pi
 * @date 2020/10/19 10:49 PM
 **/
public class GameNumber {
    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelated(3) && isRelated(5)) {
            return "FizzBuzz";
        }
        if (isRelated(3)) {
            return "Fizz";
        }
        if (isRelated(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelated(int relatedNumber) {
        return rawNumber % relatedNumber == 0 || String.valueOf(rawNumber).contains(String.valueOf(relatedNumber));
    }
}
