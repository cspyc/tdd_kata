package cn.practice.code.priciple.task1;

/**
 * @author pi
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive1s = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            counter = counterOne(counter, nums[i]);
            maxConsecutive1s = compareToReturnMaxCounterNumber(maxConsecutive1s,counter);
        }
        return maxConsecutive1s;
    }

    public int counterOne(int counter, int inputNumber) {
        int result = 0;

        if (inputNumber == 1) {
            result = counter + 1;
        }
        return result;
    }

    public int compareToReturnMaxCounterNumber(int maxCounter, int counter) {
        if (counter > maxCounter) {
            return counter;
        }
        return maxCounter;
    }
}
