import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] array = new int[5][5];
        array = TwoDimensionalArray.generateTwoDimensionalArray(array);
        TwoDimensionalArray.displayTwoDimensionalArray(array);
        array = TwoDimensionalArray.sortTwoDimensionalArray(array);
        TwoDimensionalArray.displayTwoDimensionalArray(array);
    }

}