package cn.practice.code.priciple.task1;

import java.util.Arrays;

/**
 * @author pi
 */
public class SquareOfSortedArray {
    public int[] calculateSquare(int[] inputNumberArray) {
        int[] result = new int[inputNumberArray.length];
        for (int i = 0; i < inputNumberArray.length; i++) {
            result[i] = inputNumberArray[i] * inputNumberArray[i];
        }
        return result;
    }

    public int[] sortedSquares(int[] inputNumberArray) {
        int[] squaredArray = calculateSquare(inputNumberArray);

//        Arrays.parallelSort(squaredArray);
        //冒泡排序，从序列右边往左比较
        for (int i = squaredArray.length - 1; i >= 0; i--) {
            for (int j = squaredArray.length - 1; j > squaredArray.length - 1 - i; j--) {
                if (squaredArray[j] < squaredArray[j - 1]) {
                    int temp = squaredArray[j];
                    squaredArray[j] = squaredArray[j - 1];
                    squaredArray[j - 1] = temp;
                }
            }
        }
        return squaredArray;
    }
}
