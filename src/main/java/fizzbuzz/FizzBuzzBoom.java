package fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzBoom {
    public String speakCode(int i) {
        if (isDivisableOrContained(i, 3) && isDivisableOrContained(i, 5)) {
            return "FizzBuzz";
        }
        if (isDivisableOrContained(i, 3)) {
            return "Fizz";
        }

        if (isDivisableOrContained(i, 5)) {
            return "Buzz";
        }
        return valueOf(i);
    }

    private boolean isDivisableOrContained(int rowNumber, int encryptNumber) {
        return (rowNumber % encryptNumber == 0 || valueOf(rowNumber).contains(valueOf(encryptNumber)));
    }
}
