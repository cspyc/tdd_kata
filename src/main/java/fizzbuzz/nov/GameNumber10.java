package fizzbuzz.nov;

/**
 * @author pi
 * @date 2020/11/23 11:59 PM
 **/
public class GameNumber10 {
    private int rawNumber;

    public GameNumber10(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isDivided(3) && isDivided(5)) {
            return "FizzBuzz";
        }
        if (isDivided(3)) {
            return "Fizz";
        }
        if (isDivided(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isDivided(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
