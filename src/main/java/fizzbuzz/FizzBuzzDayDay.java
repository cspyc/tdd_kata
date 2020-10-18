package fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzDayDay {
    public String speak(int rawNumber) {
        String result = "";
        if (isRelated(rawNumber, 3)) {
            result += "Fizz";
        }

        if (isRelated(rawNumber, 5)) {

            result += "Buzz";
        }

        if (!(isRelated(rawNumber, 3)) && !isRelated(rawNumber, 5)) {
            result += valueOf(rawNumber);
        }
        return result;
    }

    private boolean isRelated(int rawNumber, int i) {
        return isDivided(rawNumber, i) || isContains(rawNumber, i);
    }

    private boolean isContains(int rawNumber, int i) {
        return valueOf(rawNumber).contains(valueOf(i));
    }

    private boolean isDivided(int rawNumber, int i) {
        return rawNumber % i == 0;
    }
}
