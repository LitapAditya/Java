import java.util.Scanner;

public class TotalExpenses
{
    public static void main(String[] args)
    {
        int quantityOfItem;
        double pricePerItem, totalExpenses;
        System.out.println("ENTER THE QUANTITY AND THE PRICE OF AN ITEM RESPECTIVELY");
        Scanner sVariable = new Scanner(System.in);
        quantityOfItem = sVariable.nextInt();
        pricePerItem = sVariable.nextDouble();
        totalExpenses = quantityOfItem * pricePerItem;

        if (quantityOfItem > 1000)
        {
            totalExpenses *= 0.9;
        }

        System.out.println("TOTAL EXPENSES: " + totalExpenses);
    }
}
