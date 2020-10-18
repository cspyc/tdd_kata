package fizzbuzz;

import static java.lang.String.valueOf;

public class FizzbuzzSun {
    public String speak(int rawNumber) {
        String result = "";
        if (isRelatedTo(rawNumber, 3)) {
            result += "Fizz";
        }

        if (isRelatedTo(rawNumber, 5)) {
            result += "Buzz";
        }

        if (!(isRelatedTo(rawNumber, 3)) && !isRelatedTo(rawNumber, 5)) {
            result += valueOf(rawNumber);
        }
        return result;
    }

    private boolean isRelatedTo(int rawNumber, int i) {
        return isDivided(rawNumber, i) || isContains(rawNumber, i);
    }

    private boolean isContains(int rawNumber, int i) {
        return valueOf(rawNumber).contains(valueOf(i));
    }

    private boolean isDivided(int rawNumber, int i) {
        return rawNumber % i == 0;
    }
}
