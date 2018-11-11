package com.Sparta.sdg;

public class MergedArrays {
    public int[] merge(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < newArray.length; k++) {
            if (i == firstArray.length) {
                newArray[k] = secondArray[j];
                j++;
            } else if (j == firstArray.length) {
                newArray[k] = firstArray[i];
                i++;
            } else if (firstArray[i] < secondArray[j]) {
                newArray[k] = firstArray[i];
                i++;
            } else if (firstArray[i] > secondArray[j]) {
                newArray[k] = secondArray[j];
                j++;
            }
        }
        return newArray;
    }
}