package fizzbuzz.nov;

/**
 * @author pi
 * @date 2020/11/28 11:56 AM
 **/
public class GameNumber6 {
    private int rawNumber;

    public GameNumber6(int rawNumber) {
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

    private boolean isRelatedTo(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
