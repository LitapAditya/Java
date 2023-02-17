import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray
{
    public static int[][] generateTwoDimensionalArray(int[][] array)
    {
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

    public static void displayTwoDimensionalArray(int[][] array)
    {
        for (int[] innerArray: array)
        {
            for (int innerArrayValue : innerArray)
            {
                System.out.print(innerArrayValue + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sortTwoDimensionalArray(int[][] array)
    {
        int[] longArray = new int[array.length * array[0].length];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                longArray[i + j + ((array[i].length - 1) * i)] = array[i][j];
            }
        }

        Arrays.sort(longArray);

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = longArray[i + j + ((array[i].length - 1) * i)];
            }
        }
        return array;
    }
}