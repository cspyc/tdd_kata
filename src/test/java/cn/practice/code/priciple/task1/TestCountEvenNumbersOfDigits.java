package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCountEvenNumbersOfDigits {
    private CountEvenNumbersOfDigits countEvenNumbersOfDigits;

    @Before
    public void setUp() {
        countEvenNumbersOfDigits = new CountEvenNumbersOfDigits();
    }

    @Test
    public void should_return_numbers_of_digits() {
        int countNumber = countEvenNumbersOfDigits.countDigitsOfNumber(111);
        Assert.assertEquals(3, countNumber);
    }

    @Test
    public void should_return_true_if_input_number_is_even() {
        boolean isEven = countEvenNumbersOfDigits.isEven(22);
        Assert.assertEquals(true, isEven);

    }

    @Test
    public void should_return_the_number_of_even_number_of_digits_in_array() {
        int[] inputArray = {12, 222, 333, 2333};
        int counts = countEvenNumbersOfDigits.countEvenNumberDgits(inputArray);
        Assert.assertEquals(2, counts);
    }
}
