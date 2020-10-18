package cn.practice.code.priciple.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortedArrayTest {

    private static MergeSortedArray mergeSortedArray;

    @Before
    public void setUp(){
        mergeSortedArray = new MergeSortedArray();
    }
    @Test
    public void should_insert_a_element_after_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 1;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{1, 0, 2}, mergeSortedArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }

    @Test
    public void should_insert_a_element_at_first_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 0;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{0, 1, 2}, mergeSortedArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }


    @Test
    public void should_insert_a_element_at_last_position() {
        int[] testCaseArray = {1, 2, 3};
        int insertPosition = 2;
        int insertElement = 0;
        Assert.assertArrayEquals(new int[]{1, 2, 0}, mergeSortedArray.insertAElementAfterCurrentElement(testCaseArray, insertPosition, insertElement));
    }

    @Test
    public void should_return_merged_sorted_array(){
        int[] sortedArrayA = {1,2,4,0,0,0,0};
        int[] sortedArrayB = {3,5,8,10};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,8,10},mergeSortedArray.mergeTwoSortedArrays(sortedArrayA,3,sortedArrayB,sortedArrayB.length));
    }

    @Test
    public void should_return_merged_sorted_array_case_1(){
        int[] sortedArrayA = {0};
        int[] sortedArrayB = {1};
        Assert.assertArrayEquals(new int[]{1},mergeSortedArray.mergeTwoSortedArrays(sortedArrayA,0,sortedArrayB,sortedArrayB.length));
    }

    @Test
    public void should_return_merged_sorted_array_case_2(){
        int[] sortedArrayA = {2,0};
        int[] sortedArrayB = {1};
        Assert.assertArrayEquals(new int[]{1,2},mergeSortedArray.mergeTwoSortedArrays(sortedArrayA,1,sortedArrayB,sortedArrayB.length));
    }

    @Test
    public void should_return_merged_sorted_array_case_3(){
        int[] sortedArrayA = {4,5,6,0,0,0};
        int[] sortedArrayB = {1,2,3};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6},mergeSortedArray.mergeTwoSortedArrays(sortedArrayA,3,sortedArrayB,sortedArrayB.length));
    }

    @Test
    public void should_return_merged_sorted_array_case_4(){
        int[] sortedArrayA = {0,0,0,0,0};
        int[] sortedArrayB = {1,2,3,4,5};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5},mergeSortedArray.mergeTwoSortedArrays(sortedArrayA,0,sortedArrayB,sortedArrayB.length));
    }

}
