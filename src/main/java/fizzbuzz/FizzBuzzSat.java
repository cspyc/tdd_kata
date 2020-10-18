package fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzSat {
    public String speak(int i) {
        String result = "";
        if (isRelatedTo(i, 3)) {
            result += "Fizz";
        }

        if (isRelatedTo(i, 5)) {
            result += "Buzz";
        }

        if (!(isRelatedTo(i, 3)) && !(isRelatedTo(i, 5))) {
            result += valueOf(i);
        }
        return result;
    }

    private boolean isRelatedTo(int i, int i2) {
        return isDivided(i, i2) || isContains(i, i2);
    }

    private boolean isContains(int i, int i2) {
        return valueOf(i).contains(valueOf(i2));
    }

    private boolean isDivided(int i, int i2) {
        return i % i2 == 0;
    }
}
