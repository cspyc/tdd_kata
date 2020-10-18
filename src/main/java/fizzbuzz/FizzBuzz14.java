package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz14 {
    public boolean isDivided(String isDividedNumberStr,String divideNumberStr) {
        boolean result = false;
        int isDividedNum = new Integer(isDividedNumberStr).intValue();
        int divideNum = new Integer(divideNumberStr).intValue();

        if(divideNum != 0) {
            if(isDividedNum % divideNum == 0) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }

    public List<String> createNumbers(int size) {
        List<String> numbers = new ArrayList<>();

        if(size > 0) {
            for (int i = 1; i <= size; i++) {
                numbers.add(new Integer(i).toString());
            }
        }else {
            throw new IllegalArgumentException();
        }
        return numbers;
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

        if(!isBuzz(numberCode) && !isFizz(numberCode)) {
            result += numberCode;
        }

        return result;
    }
}

