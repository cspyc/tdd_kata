package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz6 {

    public List<String> createNumbers(int size) {
        List<String> numbers = new ArrayList<>();

        if(size > 0) {
            for(int i = 1;i <= size;i++) {
                numbers.add(new Integer(i).toString());
            }
        }else {
            throw new IllegalArgumentException();
        }

        return numbers;
    }

    public boolean isDivided(String isDividedNumberStr,String divideNumberStr) {
        int isDividedNumber = new Integer(isDividedNumberStr).intValue();
        int divideNumber = new Integer(divideNumberStr).intValue();

        boolean result = false;

        if(divideNumber != 0) {
            if(isDividedNumber % divideNumber == 0) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }


    public boolean isContained(String containStr,String isContainedStr) {
        return containStr.contains(isContainedStr);
    }


    public boolean isFizz(String numberCode) {
        return (isContained(numberCode,"3") || isDivided(numberCode,"3"));
    }

    public boolean isBuzz(String numberCode) {
        return (isContained(numberCode,"5") || isDivided(numberCode,"5"));
    }

    public String startGame(String numberCode) {
        String result = "";

        if(isFizz(numberCode)) {
            result += "Fizz";
        }

        if(isBuzz(numberCode)) {
            result += "Buzz";
        }

        if(!isFizz(numberCode) && !isBuzz(numberCode)) {
            result += numberCode;
        }

        return result;
    }
}
