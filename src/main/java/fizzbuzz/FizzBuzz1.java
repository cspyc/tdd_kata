package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz1 {

    public boolean isDivided(String dividedNumber,String dividNumber) {
        boolean result = false;
        int dividedNum = new Integer(dividedNumber).intValue();
        int divideNum = new Integer(dividNumber).intValue();

        if(divideNum != 0) {
            if(dividedNum % divideNum == 0) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }


    public List<String> createNumbers(int count) {
        List<String> numbers = new ArrayList<>();
        if(count > 0) {
            for(int i = 1;i <= count;i++) {
                numbers.add(new Integer(i).toString());
            }
        }else {
            throw new IllegalArgumentException();
        }
        return numbers;
    }


    public boolean isContained(String contains,String isContained) {
        boolean result = false;
        if(contains.contains(isContained)) {
            result = true;
        }
        return result;
    }


    public boolean isFizz(String numberCode) {
        return (isDivided(numberCode,"3") || isContained(numberCode,"3"));
    }


    public boolean isBuzz(String numberCode) {
        return (isDivided(numberCode,"5") || isContained(numberCode,"5"));
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
