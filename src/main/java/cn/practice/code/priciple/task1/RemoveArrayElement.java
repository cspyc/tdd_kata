package cn.practice.code.priciple.task1;

public class RemoveArrayElement {
    public int removeElement(int[] nums, int removeVal) {

        int length = nums.length;

        int count = 0;
        for (int k = 0; k < length; k++) {
            if (nums[k] == removeVal) {
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == removeVal) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[length - 1] = 0;
                length--;
            }
        }

        while (count > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == removeVal) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[length - 1] = 0;
                    length--;
                }
            }
            count--;
        }

        return length;
    }
}
