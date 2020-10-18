package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveArrayElementTest {
    private static RemoveArrayElement removeArrayElement;

    @Before
    public void setUp() {
        removeArrayElement = new RemoveArrayElement();
    }

    @Test
    public void testCase_1() {
        int[] nums = {3, 2, 2, 3};
        int removeVal = 3;
        int length = removeArrayElement. removeElement(nums, removeVal);
        Assert.assertEquals(2,length);
        Assert.assertArrayEquals(new int[]{2,2,0,0},nums);
    }

    @Test
    public void testCase_2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int removeVal = 2;
        int length = removeArrayElement. removeElement(nums, removeVal);
        Assert.assertEquals(5,length);
        Assert.assertArrayEquals(new int[]{0,1,4,0,3,0,0,0},nums);
    }


}
