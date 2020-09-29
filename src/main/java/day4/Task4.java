package day4;

import java.util.Random;

public class
Task4 {
    public static void main(String[] args) {
        int [] numbers = new int [100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++ )
            numbers[i] = rand.nextInt(10000);

           int maxSum = 0;
           int maxIdx = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIdx = i;
            }
            }
        System.out.println(maxIdx);
        System.out.println(maxSum);
    }
}
