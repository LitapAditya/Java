package com.array;

import com.arrayOperations.ArrayOperations;

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        int[] arrayTwo = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100);
            arrayTwo[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

//        System.out.println(Arrays.toString(arrayTwo));

//        System.out.println("SUM OF THE ARRAY ELEMENTS IS: " + ArrayOperations.sumOfArrayElements(array));

//        System.out.println("SUM OF TWO ARRAYS: " + Arrays.toString(ArrayOperations.sumOfTwoArrays(array, arrayTwo)));

//        System.out.println(Arrays.toString(ArrayOperations.reverseArray(array)));

//        System.out.println(Arrays.toString(ArrayOperations.sortArray(array)));

//        System.out.println(ArrayOperations.searchElement(20, array));

//        System.out.println(ArrayOperations.minimumValue(array));

//        System.out.println(ArrayOperations.maximumValue(array));
    }
}