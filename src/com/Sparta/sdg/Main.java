package com.Sparta.sdg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] evenArray = {2, 4, 6, 8};
        int[] oddArray = {1, 3, 7, 9};
        MergedArrays combine = new MergedArrays (); // class MergedArrays assigning combine to be a new method from Merged Arrays
        int[] answer = combine.merge (evenArray, oddArray); //assign the array 'answer' to be a new array which passes the arguments even and odd to merge
        System.out.println (Arrays.toString (answer)); //calls answer by using class Arrays and using to string method


    }


}
