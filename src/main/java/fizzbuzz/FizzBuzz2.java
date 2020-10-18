package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz2 {

    public List<String> createNumbers(int size) {
        List<String> numbersList = new ArrayList<String>();

        if(size > 0) {
            for(int i = 1;i <= size;i++) {
                numbersList.add(new Integer(i).toString());
            }
        }else {
            throw new IllegalArgumentException();
        }

        return numbersList;
    }


    public boolean isDivided(String dividedNumber,String divideNumber) {
        int dividedNum = new Integer(dividedNumber).intValue();
        int divideNum = new Integer(divideNumber).intValue();

        boolean result = false;

        if(divideNum != 0) {
            if(dividedNum % divideNum == 0 ) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }


    public boolean isContained(String containStr,String isContainedStr) {
        boolean result = false;

        if(containStr.contains(isContainedStr)) {
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
        String resultCode = "";

        if(isFizz(numberCode)) {
            resultCode += "Fizz";
        }

        if(isBuzz(numberCode)) {
            resultCode += "Buzz";
        }

        if(!isFizz(numberCode) && !isBuzz(numberCode)) {
            resultCode += numberCode;
        }

        return resultCode;
    }

    
}
