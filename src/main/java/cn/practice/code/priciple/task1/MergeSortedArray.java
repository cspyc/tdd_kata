package cn.practice.code.priciple.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author pi
 * @date 2020/05/15
 */
public class MergeSortedArray {
    public int[] insertAElementAfterCurrentElement(int[] originArray, int insertPosition, int insertElement) {
        int[] copyOfOriginArray = Arrays.copyOf(originArray, originArray.length);

        for (int i = 0; i < copyOfOriginArray.length; i++) {
            if (i < insertPosition) {
                originArray[i] = copyOfOriginArray[i];
            }

            if (i == insertPosition) {
                originArray[insertPosition] = insertElement;
            }

            if (i > insertPosition) {
                originArray[i] = copyOfOriginArray[i - 1];
            }
        }
        return originArray;
    }

    /**
     * 思路比较明确，就是维护三个index，分别对应数组A，数组B，和结果数组。然后A和B同时从后往前扫，每次迭代中A和B指向的元素大的便加入结果数组中，然后index-1，另一个不动。
     * 这里从后往前扫是因为这个题目中结果仍然放在A中，如果从前扫会有覆盖掉未检查的元素的可能性。算法的时间复杂度是O(m+n),m和n分别是两个数组的长度，空间复杂度是O(1)
     */
    public int[] mergeTwoSortedArrays(int[] sortedArrayA, int sizeOfNotZeroElementOfArrayA, int[] sortedArrayB, int arrayBLength) {
        if (sortedArrayA == null || sortedArrayB == null) {
            return null;
        }

        int idx1 = sizeOfNotZeroElementOfArrayA - 1;
        int idx2 = arrayBLength - 1;
        int len = sizeOfNotZeroElementOfArrayA + arrayBLength - 1;

        while (idx1 >= 0 && idx2 >= 0) {
            if (sortedArrayA[idx1] > sortedArrayB[idx2]) {
                sortedArrayA[len--] = sortedArrayA[idx1--];
            } else {
                sortedArrayA[len--] = sortedArrayB[idx2--];
            }
        }

        while (idx2 >= 0) {
            sortedArrayA[len--] = sortedArrayB[idx2--];
        }
        return sortedArrayA;
    }
}
