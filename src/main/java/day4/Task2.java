package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array1 = new int [100];
        Random rand = new Random();
        for (int i = 0; i < array1.length; i++)
            array1[i] = rand.nextInt(10000);

            int maxCount = 0;
            for(int element:array1) {
                if (element > maxCount)
                    maxCount = element;
                }
            System.out.println(maxCount);
              int minCount = 0;
              for(int element:array1) {
                  if (element < minCount)
                      minCount = element;
              }
        System.out.println(minCount);

             int count0 = 0;
             for (int element : array1) {
              if (element % 10 == 0)
                  count0 ++;
        }
        System.out.println(count0);

             int sum0 = 0;
             for (int element : array1) {
                 if (element % 10 == 0)
                     sum0 += element;
             }
        System.out.println(sum0);
    }
}
