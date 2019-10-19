import java.util.ArrayList;
import java.util.List;

public class FizzBuzz3 {

    public List<String> createNumbers(int size) {
        List<String> numbers = new ArrayList<String>();

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
        int dividedNum = new Integer(dividedNumber).intValue();
        int divideNum = new Integer(divideNumber).intValue();

        boolean result = false;

        if(divideNum != 0) {
            if(dividedNum % divideNum == 0) {
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }


    public boolean isContained(String containStr,String isContainedStr) {
        return (containStr.contains(isContainedStr));
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
