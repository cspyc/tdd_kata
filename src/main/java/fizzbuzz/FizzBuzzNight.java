package fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzzNight {
    public String speakCode(int rawNumber) {

        String result = "";

        if (isRelated(rawNumber, 3)) {
            result += "Fizz";
        }

        if (isRelated(rawNumber, 5)) {
            result += "Buzz";
        }

        if (!(isRelated(rawNumber, 3)) && !(isRelated(rawNumber, 5))) {
            result += valueOf(rawNumber);
        }

        return result;


    }

    private boolean isRelated(int rawNumber, int relatedNumber) {
        return isDivided(rawNumber, relatedNumber) || isContains(rawNumber, relatedNumber);
    }

    private boolean isContains(int rawNumber,int containsNumber) {

        return valueOf(rawNumber).contains(valueOf(containsNumber));
    }

    private boolean isDivided(int rawNumber, int devidedNumber) {
        return rawNumber % devidedNumber == 0;
    }
}
