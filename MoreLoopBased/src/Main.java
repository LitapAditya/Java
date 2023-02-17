import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LoopBased loopBased = new LoopBased();


//        System.out.println("ENTER THREE NUMBERS");
//        int numberOne = scanner.nextInt();
//        int numberTwo = scanner.nextInt();
//        System.out.println(loopBased.hasSharedDigit(numberOne, numberTwo) ? "NUMBERS HAVE SHARED DIGIT" : "NUMBERS DO NOT HAVE SHARED DIGIT");
//
//
//        System.out.println("ENTER THREE NUMBERS");
//        int numberOne = scanner.nextInt();
//        int numberTwo = scanner.nextInt();
//        int numberThree = scanner.nextInt();
//        System.out.println(loopBased.hasSameLastDigit(numberOne, numberTwo, numberThree) ? "SAME LAST DIGIT EXIST" : "SAME LAST DIGIT DOESN'T EXIST");
//
//
//        System.out.println("ENTER A NUMBER");
//        int number = scanner.nextInt();
//        loopBased.printFactors(number);
//
//
//        System.out.println("ENTER TWO NUMBERS");
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        System.out.println("GREATEST COMMON DIVISOR: " + loopBased.greatestCommonDivisor(first, second));
//
//
//        System.out.println("ENTER A NUMBER");
//        int number = scanner.nextInt();
//        loopBased.numberToWords(number);
//
//
        System.out.println("ENTER THE NUMBER OF BIG CAN, SMALL CAN & GOAL RESPECTIVELY");
        PackCan packCan = new PackCan();
        int bigCan = scanner.nextInt();
        int smallCan = scanner.nextInt();
        int goal = scanner.nextInt();
        System.out.println(packCan.canPack(bigCan, smallCan, goal));
//
//
//        System.out.println("ENTER A NUMBER");
//        int number = scanner.nextInt();
//        System.out.println(loopBased.getLargestPrime(number));
//
//
//        System.out.println("ENTER THE WIDTH OF THE WALL, THE HEIGHT OF THE WALL, AREA COVERED BY ONE BUCKET AND THE NUMBER OF BUCKETS");
//        double width = scanner.nextDouble();
//        double height = scanner.nextDouble();
//        double areaPerBucket = scanner.nextDouble();
//        int extraBuckets = scanner.nextInt();
//        System.out.println("NUMBER OF BUCKETS THAT BOB NEEDS TO BUY: " + loopBased.getBucketCount(width, height, areaPerBucket, extraBuckets));
//
//        System.out.println("ENTER WIDTH, HEIGHT & AREA PER BUCKET");
//        double width = scanner.nextDouble();
//        double height = scanner.nextDouble();
//        double areaPerBucket = scanner.nextDouble();
//        System.out.println("NUMBER OF BUCKETS THAT BOB NEEDS TO BUY: " + loopBased.getBucketCount(width, height, areaPerBucket));
//
//        System.out.println("ENTER AREA & AREA PER BUCKET");
//        double area = scanner.nextDouble();
//        double areaPerBucket = scanner.nextDouble();
//        System.out.println("NUMBER OF BUCKETS THAT BOB NEEDS TO BUY: " + loopBased.getBucketCount(area, areaPerBucket));
    }
}