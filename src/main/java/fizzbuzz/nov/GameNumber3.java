package fizzbuzz.nov;

/**
 * @author pi
 * @date 2020/11/03 8:55 PM
 **/
public class GameNumber3 {
    private int rawNumber;

    public GameNumber3(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isDividedBy(3) && isDividedBy(5)) {
            return "FizzBuzz";
        }
        if (isDividedBy(3)) {
            return "Fizz";
        }
        if (isDividedBy(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isDividedBy(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
