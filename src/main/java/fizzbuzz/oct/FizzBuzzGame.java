package fizzbuzz.oct;

/**
 * @author pi
 * @date 2020/10/18 9:48 PM
 **/
public class FizzBuzzGame {
    public String say(Integer num) {
        if (isFizz(num) && isBuzz(num)) {
            return "FizzBuzz";
        }
        if (isFizz(num)) {
            return "Fizz";
        }

        if (isBuzz(num)) {
            return "Buzz";
        }
        return num.toString();
    }

    private boolean isBuzz(Integer num) {
        return num % 5 == 0;
    }

    private boolean isFizz(Integer num) {
        return num % 3 == 0;
    }
}
