package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DuplicateZerosArrayTest {

    private static DuplicateZerosArray duplicateZerosArray;

    @Before
    public void setUp(){
        duplicateZerosArray = new DuplicateZerosArray();
    }
    @Test
    public void should_insert_a_element_after_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 1;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{1, 0, 2}, duplicateZerosArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }

    @Test
    public void should_insert_a_element_at_first_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 0;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{0, 1, 2}, duplicateZerosArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }


    @Test
    public void should_insert_a_element_at_last_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 2;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{1, 2, 0}, duplicateZerosArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }

    @Test
    public void should_insert_zero_after_zero(){
        int[] originArray = {0,1,3,0};
       Assert.assertArrayEquals(new int[]{0,0,1,3},duplicateZerosArray.duplicateZero(originArray));
    }

    @Test
    public void should_insert_zero_after_zero_case(){
        int[] originArray = new int[]{1,0,2,3,0,4,5,0};
        Assert.assertArrayEquals(new int[]{1,0,0,2,3,0,0,4},duplicateZerosArray.duplicateZero(originArray));
    }

    @Test
    public void should_insert_zero_after_zero_case_2(){
        int[] originArray = new int[]{0,1,7,6,0,2,0,7};
        Assert.assertArrayEquals(new int[]{0,0,1,7,6,0,0,2},duplicateZerosArray.duplicateZero(originArray));
    }
}
