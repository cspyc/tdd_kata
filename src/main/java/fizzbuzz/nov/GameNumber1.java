package fizzbuzz.nov;

/**
 * @author pi
 * @date 2020/11/01 11:48 PM
 **/
public class GameNumber1 {
    private int rowNumber;

    public GameNumber1(int rowNumber) {
        this.rowNumber = rowNumber;
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
        return String.valueOf(rowNumber);
    }

    private boolean isRelatedTo(int i) {
        return rowNumber % i == 0 || String.valueOf(rowNumber).contains(String.valueOf(i));
    }
}
