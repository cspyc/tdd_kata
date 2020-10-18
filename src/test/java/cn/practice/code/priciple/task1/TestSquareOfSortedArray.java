package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSquareOfSortedArray {
    private SquareOfSortedArray squareOfSortedArray;

    @Before
    public void setUp(){
        squareOfSortedArray = new SquareOfSortedArray();
    }

    @Test
    public void should_return_squares_of_array_number(){
        int[] inputNumber = {-1,-2,3,2};
        int[] result = squareOfSortedArray.calculateSquare(inputNumber);

        Assert.assertArrayEquals(new int[]{1, 4, 9, 4},result);
    }

    @Test
    public void should_return_non_decreasing_array(){
        int[] inputNumber = {-2,8,7,4,9,10};
        int[] result = squareOfSortedArray.sortedSquares(inputNumber);

        Assert.assertArrayEquals(new int[]{4,16,49,64,81,100},result);
    }
}
