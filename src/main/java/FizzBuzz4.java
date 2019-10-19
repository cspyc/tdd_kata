import java.util.ArrayList;
import java.util.List;

public class FizzBuzz4 {

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

    public boolean isDivided(String dividedNumber,String divideNumber) {
        boolean result = false;
        int dividedInt = new Integer(dividedNumber).intValue();
        int divideInt = new Integer(divideNumber).intValue();

        if(divideInt != 0) {
            if(dividedInt % divideInt == 0) {
                result = true;
            }
        } else {
            throw new IllegalArgumentException();
        }

        return result;

    }

    public boolean isContained(String containStr,String isContainedStr) {
        return (containStr.contains(isContainedStr));
    }

    public boolean isFizz(String numberCode) {
        return (isContained(numberCode,"3") || isDivided(numberCode,"3"));
    }

    public boolean isBuzz(String numberCode) {
        return (isDivided(numberCode,"5") || isContained(numberCode,"5"));
    }


    public boolean isNotFizzOrBuzz(String numberCode) {
        boolean result = false;

        if(!isFizz(numberCode) && !isBuzz(numberCode)) {
            result = true;
        }
        return result;
    }

    public String startGame(String numberCode) {
        String result = "";

        if(isFizz(numberCode)) {
            result += "Fizz";
        }

        if(isBuzz(numberCode)) {
            result += "Buzz";
        }

        if(isNotFizzOrBuzz(numberCode)) {
            result += numberCode;
        }

        return result;
    }





}
