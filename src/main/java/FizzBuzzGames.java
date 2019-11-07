import static java.lang.String.valueOf;

public class FizzBuzzGames {
    public String speakCode(int rawNumber) {
        String result = "";
        if (isRelatedTo(rawNumber, 3)) {
            result += "Fizz";
        }

        if (isRelatedTo(rawNumber, 5)) {
            result += "Buzz";
        }

        if (!(isRelatedTo(rawNumber, 3)) && !(isRelatedTo(rawNumber, 5))) {

            result += valueOf(rawNumber);
        }

        return result;
    }

    private boolean isRelatedTo(int rawNumber, int relatedNumber) {
        return isDivided(rawNumber, relatedNumber) || isContains(rawNumber, relatedNumber);
    }

    private boolean isContains(int rawNumber, int containsNumber) {
        return valueOf(rawNumber).contains(valueOf(containsNumber));
    }

    private boolean isDivided(int rawNumber, int dividedNumber) {
        return rawNumber % dividedNumber == 0;
    }
}
