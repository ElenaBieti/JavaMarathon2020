package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            array[i] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println(arraySize);

        int moreThen8 = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] > 8) {
                moreThen8++;
            }
        }
                System.out.println(moreThen8);


        int equals1 = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == 1) {
                equals1++;
            }
        }
                System.out.println(equals1);


        int numberEven = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0) {
                numberEven++;
            }
        }
                System.out.println(numberEven);


        int numberOdd = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 != 0) {
                numberOdd++;
            }
        }
                System.out.println(numberOdd);


        int sum = 0;
        for (int i = 0; i < arraySize; i++)
            sum += array[i];
        System.out.println(sum);

    }
}

