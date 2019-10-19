import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

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


    public boolean isDivided(String dividedNumber,String dividNumber) {
        int dividedNum = new Integer(dividedNumber).intValue();
        int dividNum = new Integer(dividNumber).intValue();

        boolean result = false;

        if(dividNum != 0) {
            if(dividedNum % dividNum == 0){
                result = true;
            }
        }else {
            throw new IllegalArgumentException();
        }

        return result;
    }


    public boolean isContained(String contain,String contained) {
        boolean result = false;

        if(contain.contains(contained)) {
            result = true;
        }
        return result;
    }


    public boolean isFizz(String numberCode) {
        return (isDivided(numberCode,"3") || isContained(numberCode,"3"));
    }


    public  boolean isBuzz(String numberCode) {
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
