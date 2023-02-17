package JavaLoops;

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalQueries = scanner.nextInt();
        for (int i = 0; i < totalQueries; i++)
        {
            String receivedIntegerString = scanner.nextLine();
            String[] stringArray = receivedIntegerString.split(" ", 2);
            System.out.println(Arrays.toString(stringArray));
            int[] integerArray = new int[stringArray.length];
            int j = 0;
            for (String individualString : stringArray)
            {
                integerArray[i] = Integer.parseInt(individualString);
                j++;
            }
            System.out.println(Arrays.toString(integerArray));
        }
    }
}