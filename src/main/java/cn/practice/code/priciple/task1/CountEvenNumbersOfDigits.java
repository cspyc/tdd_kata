package cn.practice.code.priciple.task1;

/**
 * @author pi
 */
public class CountEvenNumbersOfDigits {
    public int countDigitsOfNumber(int inputNumber) {
        int result = 0;
        do {
            inputNumber = inputNumber / 10;
            result += 1;
        } while (inputNumber >= 1);

        return result;
    }

    public boolean isEven(int inputNumber) {
        boolean result = false;
        if (inputNumber % 2 == 0) {
            result = true;
        }
        return result;
    }

    public int countEvenNumberDgits(int[] inputArray) {
        int countResult = 0;
        for (int inputNumber : inputArray) {
            int countNumber = countDigitsOfNumber(inputNumber);
            boolean isEven = isEven(countNumber);

            if (isEven) {
                countResult++;
            }
        }
        return countResult;
    }
}
