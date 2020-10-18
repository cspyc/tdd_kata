package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz15 {
    public List<String > createNumbers(int size) {
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

    public boolean isDivided(String isDividedStr,String divideStr) {
        boolean result = false;
        int isDividedNumber = new Integer(isDividedStr).intValue();
        int divideNumber = new Integer(divideStr).intValue();


        if(divideNumber != 0) {
            if(isDividedNumber % divideNumber == 0) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }

    public boolean isContain(String containStr,String isContainedStr) {
        return containStr.contains(isContainedStr);
    }


    public boolean isFizz(String numberCode) {
        return (isDivided(numberCode,"3") || isContain(numberCode,"3"));
    }

    public boolean isBuzz(String numberCode) {
        return (isDivided(numberCode,"5") || isContain(numberCode,"5"));
    }

    public String startGame(String numberCode) {
        String result = "";

        if(isFizz(numberCode)) {
            result += "Fizz";
        }

        if (isBuzz(numberCode)) {
            result += "Buzz";
        }

        if(!isFizz(numberCode) && !isBuzz(numberCode)) {
            result += numberCode;
        }
        return result;
    }
}
