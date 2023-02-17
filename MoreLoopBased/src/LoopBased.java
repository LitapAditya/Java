public class LoopBased
{
    public boolean hasSharedDigit(int numberOne, int numberTwo)
    {
        for (int i = numberOne; i != 0; i /= 10)
        {
            for (int j = numberTwo; j != 0; j /= 10)
            {
                if (i % 10 == j % 10)
                {
                    if (numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99)
                        return true;
                }
            }
        }
        return false;
    }

    public boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree)
    {
        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree))
        {
            return numberOne % 10 == numberTwo % 10 || numberOne % 10 == numberThree % 10 || numberTwo % 10 == numberThree % 10;
        }
        return false;
    }

    public boolean isValid(int number)
    {
        return number >= 10 && number <= 999;
    }

    public void printFactors(int number)
    {
        if (number < 0)
            System.out.println("INVALID NUMBER");

        else
            for (int i = 1; i <= number; i++)
            {
                if (number % i == 0)
                    System.out.print(i + " ");
            }
    }

    public int greatestCommonDivisor(int first, int second)
    {
        if (first < 10 || second < 10)
            return -1;

        else
            for (int i = Math.min(first, second); i >= 1; i--)
            {
                if (first % i == 0 && second % i == 0)
                    return i;
            }
        return -1;
    }

    public void numberToWords(int number)
    {
        if (number < 0)
            System.out.println("INVALID NUMBER");

        else
        {
            int reversedNumber = reverse(number);

            for (int i = reversedNumber; i != 0; i /= 10)
            {
                int lastDigit = i % 10;
                switch (lastDigit)
                {
                    case 1 -> System.out.print("ONE ");
                    case 2 -> System.out.print("TWO ");
                    case 3 -> System.out.print("THREE ");
                    case 4 -> System.out.print("FOUR ");
                    case 5 -> System.out.print("FIVE ");
                    case 6 -> System.out.print("SIX ");
                    case 7 -> System.out.print("SEVEN ");
                    case 8 -> System.out.print("EIGHT ");
                    case 9 -> System.out.print("NINE ");
                    case 0 -> System.out.print("ZERO ");
                }
            }

            int digitsInNumber = numberOfDigits(number);
            int digitsInReversedNumber = numberOfDigits(reversedNumber);
            int zeroesToBeAdded = digitsInNumber - digitsInReversedNumber;

            for (int i = 1; i <= zeroesToBeAdded; i++)
            {
                System.out.print("ZERO ");
            }
        }
    }

    public int reverse(int number)
    {
        int reversedNumber = 0;

        for (int i = number; i != 0; i /= 10)
        {
            reversedNumber = reversedNumber * 10 + (i % 10);
        }

        return reversedNumber;
    }

    public int numberOfDigits(int number)
    {
        int digitsInNumber = 0;

        for (int i = number; i != 0; i /= 10)
        {
            digitsInNumber++;
        }
        return digitsInNumber;
    }

    public boolean canPack(int bigCount, int smallCount, int goal)
    {
        return ((bigCount * 5) <= goal) && ((bigCount * 5) + smallCount >= goal) && bigCount >= 0 && smallCount >= 0;
    }

    public boolean canPack2(int bigCount, int smallCount,int goal )
    {
        int bigBag = 5;
        int smallBag = 1;

        if (bigCount>=0 && smallCount >= 0)
        {
            int total = (bigCount * bigBag) + (smallCount* smallBag);

            if (total >= goal)
            {
                if ((bigCount * bigBag) <= goal)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int getLargestPrime(int number)
    {
        if (number < 0 || isPrime(number))
            return -1;

        else
        {
            for (int i = number; i != 0; i--)
            {
                if (number % i == 0 && isPrime(i))
                    return i;
            }
        }
        return -1;
    }

    public boolean isPrime(int number)
    {
        int flag = 1;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }

    public int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0)
            return -1;
        else
        {
            return (int) Math.round(((width * height - areaPerBucket * extraBuckets) / areaPerBucket));
        }
    }

    public int getBucketCount(double width, double height, double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        else
        {
            return (int) Math.ceil(width * height  / areaPerBucket);
        }
    }

    public int getBucketCount(double area, double areaPerBucket)
    {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        else
        {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}