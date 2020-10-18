package cn.practice.code.priciple.task1;

import java.util.Arrays;

public class DuplicateZerosArray {
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

    public int[] duplicateZero(int[] arr) {
        int[] originCopyArray = Arrays.copyOf(arr, arr.length);
        int addZeroCount = 0;
        for (int i = 0; i < originCopyArray.length; i++) {
            if (originCopyArray[i] == 0) {
                int insertPosition = i + addZeroCount + 1;
                if (insertPosition <= originCopyArray.length) {
                    arr = insertAElementAfterCurrentElement(arr, insertPosition, 0);
                    addZeroCount++;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a);
        }

        return arr;
    }
}
