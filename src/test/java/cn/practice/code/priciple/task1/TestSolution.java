package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSolution {

    private static Solution solution;

    @BeforeClass
    public static void setUp(){
        solution = new Solution();
    }

    @Test
    public void should_add_one_if_input_number_equals_one() {
        int counter = 0;
        int inputNumber = 1;

        int result = solution.counterOne(counter,inputNumber);

        Assert.assertEquals(1,result);
    }

    @Test
    public void should_clear_counter_if_input_number_equals_zero(){
        int counter = 10;
        int inputNumber = 0;

        int result = solution.counterOne(counter,inputNumber);
        Assert.assertEquals(0,result);
    }

    @Test
    public void should_max_number(){
        int maxCounter = 10;
        int counter = 11;

        int result = solution.compareToReturnMaxCounterNumber(maxCounter,counter);
        Assert.assertEquals(11,result);

    }

    @Test
    public void TestFindMaxConsecutiveOnes(){
        int[] numbers = {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int result = solution.findMaxConsecutiveOnes(numbers);

        Assert.assertEquals(19,result);
    }
}
