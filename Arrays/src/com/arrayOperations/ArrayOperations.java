package com.arrayOperations;

import java.util.Arrays;

public class ArrayOperations
{
    public static int sumOfArrayElements(int[] array)
    {
        int sum = 0;
        for (int intValue : array)
        {
            sum += intValue;
        }
        return sum;
    }

    public static int[] sumOfTwoArrays(int[] arrayOne, int[] arrayTwo)
    {
        for (int i = 0; i < arrayOne.length; i++)
        {
            arrayOne[i] += arrayTwo[i];
        }
        return arrayOne;
    }

    public static int[] reverseArray(int[] array)
    {
        for (int i = 0; i < array.length / 2; i ++)
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static int[] sortArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = (i + 1); j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static boolean searchElement(int givenElement, int[] array)
    {
        int[] sortedArray = sortArray(array);
        int beginning = 0;
        int end = sortedArray.length - 1;

        while (beginning <= end)
        {
            int middle = (beginning + end) / 2;
            if (givenElement == sortedArray[middle])
            {
                return true;
            }

            else if (givenElement > sortedArray[middle])
            {
                beginning = middle + 1;
            }

            else
            {
                end = middle - 1;
            }
        }
        return false;
    }

    public static int minimumValue(int[] array)
    {
        int[] sortedArray = sortArray(array);
        return sortedArray[0];
    }

    public static int maximumValue(int[] array)
    {
        int[] sortedArray = sortArray(array);
        return sortedArray[sortedArray.length - 1];
    }
}
