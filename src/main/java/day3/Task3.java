package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа делимое и делитель");
        int counter = 0;
        while(counter < 5) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            counter ++;
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x/y);
        }
    }
}
