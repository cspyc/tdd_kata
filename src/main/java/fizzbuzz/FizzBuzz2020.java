package fizzbuzz;

/**
 * @author pi
 */
public class FizzBuzz2020 {

    public String speakFizzBuzzGame(int number) {
        int fizzNumber = 3;
        int buzzNumber = 5;
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            return "FizzBuzz";
        }
        if (number % fizzNumber == 0) {
            return "Fizz";
        }
        if (number % buzzNumber == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
